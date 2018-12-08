from ev3dev2.sensor.lego import ColorSensor

from src.action.action import Action
from src.color import Color
from src.drive.motor import Motor


class ColorFinder(Action):

    def __init__(self, colors, speed):
        self.colors = self.emptyfy_colors(colors)
        self.speed = speed

        self.driver = Motor()
        self.cs = ColorSensor()

    def execute(self):
        if self.cs.color in self.colors:
            return True
        else:
            self.driver.drive_on(self.speed)

    def emptyfy_colors(self, colors):
        if colors.isEmpty:
            return [Color.RED, Color.GREEN, Color.BLUE]
        else:
            return colors
