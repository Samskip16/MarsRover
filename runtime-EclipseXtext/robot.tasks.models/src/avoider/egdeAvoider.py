from ev3dev2.sensor.lego import ColorSensor
from ev3dev2.sensor.lego import UltrasonicSensor

from src.avoider.avoider import Avoider
from src.drive.driveAction import DriveAction
from src.drive.speed import Speed


class EdgeAvoider(Avoider):

    def __init__(self):
        self.color = 1
        self.drive_actions = [DriveAction(Speed.NORMAL, 100, 0), DriveAction(Speed.NORMAL, 0, 40)]

        self.cs = ColorSensor()
        self.us = UltrasonicSensor()
        self.us.mode = 'US-DIST-CM'

    def triggered(self):
        return self.cs.color is self.color or self.us.value() > 1

    def avoid(self):
        for a in self.drive_actions:
            a.execute()
