from ev3dev2.sensor.lego import ColorSensor

from src.avoider.avoider import Avoider
from src.color import Color


class ColorAvoider(Avoider):

    def __init__(self, colors, drive_actions):
        self.colors = self.emptyfy_colors(colors)
        self.drive_actions = drive_actions

        self.cs = ColorSensor()

    def triggered(self):
        return self.cs.color in self.colors

    def avoid(self):
        for a in self.drive_actions:
            a.execute()

    def emptyfy_colors(self, colors):
        if colors.isEmpty:
            return [Color.RED, Color.GREEN, Color.BLUE]
        else:
            return colors
