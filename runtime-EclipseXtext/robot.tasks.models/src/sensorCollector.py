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
        us_prev_val = 0

        while True:
            msg = ""

            #if self.ts1.is_pressed == 1 is not ts1_prev_val:
            #    ts1_prev_val = not ts1_prev_val
            msg += "ts1=" + str(self.ts1.is_pressed == 1)

            # print("ts1 pressed: " + str(ts1_prev_val))

            #if self.ts4.is_pressed == 1 is not ts4_prev_val:
            #    ts4_prev_val = not ts4_prev_val
            msg += ";ts4=" + str(self.ts4.is_pressed == 1)

            # print("ts4 pressed: " + str(ts4_prev_val))

            # if self.us.value() < 100 + us_prev_val or self.us.value() > 100 - us_prev_val:
            #    us_prev_val = self.us.value()
            msg += ";us=" + str(self.us.value() < 300)
            #    print("us pressed: " + str(us_prev_val))

            print(msg)
            self.bt.send(msg)
            time.sleep(0.5)
