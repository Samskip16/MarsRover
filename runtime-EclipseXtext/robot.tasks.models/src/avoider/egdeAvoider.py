from ev3dev2._platform.ev3 import INPUT_1, INPUT_3, INPUT_4
from ev3dev2.sensor.lego import ColorSensor
from ev3dev2.sensor.lego import UltrasonicSensor

from avoider.avoider import Avoider
from drive.moveAction import MoveAction
from drive.rotateAction import RotateAction
from drive.speed import Speed


class EdgeAvoider(Avoider):

    def __init__(self):
        self.color = 6  # white
        self.drive_actions_lcs = [MoveAction(Speed.NORMAL, -200), RotateAction(Speed.NORMAL, -60)]  # L/C cs triggered
        self.drive_actions_rcs = [MoveAction(Speed.NORMAL, -200), RotateAction(Speed.NORMAL, 60)]  # R cs triggered
        self.drive_actions_us = [MoveAction(Speed.NORMAL, 200), RotateAction(Speed.NORMAL, -60)]  # Us triggered

        self.csL = ColorSensor(address=INPUT_1)
        self.csC = ColorSensor(address=INPUT_3)
        self.csR = ColorSensor(address=INPUT_4)

        self.us = UltrasonicSensor()
        self.us.mode = 'US-DIST-CM'

    def triggered(self):
        return self.csL.color is self.color \
               or self.csC.color is self.color \
               or self.csR.color is self.color \
               or self.us.value() > 40

    def avoid(self):
        actions = []
        if self.csL.color is self.color or self.csC.color is self.color:
            actions = self.drive_actions_lcs
        if self.csR.color is self.color:
            actions = self.drive_actions_rcs
        if self.us.value() > 40:
            actions = self.drive_actions_us

        for a in actions:
            a.execute()
