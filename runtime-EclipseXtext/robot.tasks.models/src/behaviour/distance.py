from behaviour.behaviour import Behaviour
from modules.speaker import Speaker
from modules.driver import Driver

from ev3dev2.sensor.lego import UltrasonicSensor


class Distance(Behaviour):

    def __init__(self):
        self.driver = Driver()
        self.speaker = Speaker()

        self.us = UltrasonicSensor()
        self.us.mode = 'US-DIST-CM'

    def can_execute(self):
        return self.us.value() < 380

    def execute(self):
        self.driver.stop()

        self.speaker.speak("wow")
        self.driver.reverse_rotations(0.5)
        self.driver.rotate_degrees(125)

        self.driver.drive()
