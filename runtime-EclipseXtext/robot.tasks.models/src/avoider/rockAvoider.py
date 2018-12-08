from ev3dev.core import UltrasonicSensor

from src.avoider.avoider import Avoider


class RockAvoider(Avoider):

    def __init__(self, drive_actions):
        self.drive_actions = drive_actions

        self.us = UltrasonicSensor()
        self.us.mode = 'US-DIST-CM'

    def triggered(self):
        return self.us.value() < 380

    def avoid(self):
        for a in self.drive_actions:
            a.drive()
