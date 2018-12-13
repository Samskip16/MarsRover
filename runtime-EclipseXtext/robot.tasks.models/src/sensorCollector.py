import time

from ev3dev.core import UltrasonicSensor, TouchSensor
from ev3dev2._platform.ev3 import INPUT_1, INPUT_4

from bt.bluethooth import Bluetooth
from util.singleton import Singleton


class SensorCollector(metaclass=Singleton):

    def __init__(self):
        self.ts1 = TouchSensor(INPUT_1)
        self.ts4 = TouchSensor(INPUT_4)
        self.us = UltrasonicSensor()

        self.bt = Bluetooth()

    def collect(self):
        ts1_prev_val = False
        ts4_prev_val = False
        us_prev_val = False

        while True:
            msg = ""

            if self.ts1.is_pressed is not ts1_prev_val:
                ts1_prev_val = not ts1_prev_val
                msg += "ts1=" + str(ts1_prev_val)

                print("ts1 pressed: " + str(ts1_prev_val))

            if self.ts4.is_pressed is not ts4_prev_val:
                ts4_prev_val = not ts4_prev_val
                msg += "ts4=" + str(ts4_prev_val)

                print("ts4 pressed: " + str(ts4_prev_val))

            if self.us.value() < 300 is not us_prev_val:
                us_prev_val = not us_prev_val
                msg += "us=" + str(us_prev_val)

                print("us pressed: " + str(us_prev_val))

            self.bt.send(msg)
            time.sleep(0.2)
