from ev3dev2._platform.ev3 import INPUT_1, INPUT_3, INPUT_4
from ev3dev2.sensor.lego import ColorSensor

from action.action import Action
from drive.motor import Motor


class ColorFinder(Action):

    def __init__(self, colors, speed):
        self.colors = colors
        self.speed = speed

        self.driver = Motor()
        self.csL = ColorSensor(address=INPUT_1)
        self.csC = ColorSensor(address=INPUT_3)
        self.csR = ColorSensor(address=INPUT_4)

    def execute(self):
        csL = self.csL.color in self.colors
        csC = self.csC.color in self.colors
        csR = self.csR.color in self.colors

        if csL and not csC and not csR:
            self.driver.rotate_degrees(self.speed, -55)

        if not csL and not csC and csR:
            self.driver.rotate_degrees(self.speed, 55)

        if csL and csC and not csR:
            self.driver.rotate_degrees(self.speed, -25)

        if not csL and csC and csR:
            self.driver.rotate_degrees(self.speed, 25)

        if csL or csC or csR:
            return True
        else:
            self.driver.drive_on(self.speed)
