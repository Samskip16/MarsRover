from behaviour.behaviour import Behaviour
from modules.speaker import Speaker
from modules.driver import Driver

from ev3dev2.sensor.lego import TouchSensor
from ev3dev2._platform.ev3 import INPUT_1, INPUT_4


class Touching(Behaviour):

    def __init__(self):
        self.driver = Driver()
        self.speaker = Speaker()

        self.ts1 = TouchSensor(INPUT_1)
        self.ts4 = TouchSensor(INPUT_4)

    def can_execute(self):
        return self.ts1.is_pressed or self.ts4.is_pressed

    def execute(self):
        self.driver.stop()

        self.speaker.play_blyat()
        self.driver.reverse_rotations(1)
        self.driver.rotate_degrees(180)

        self.driver.drive()
