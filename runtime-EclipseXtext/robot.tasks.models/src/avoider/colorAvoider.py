from ev3dev2.sensor.lego import ColorSensor

from avoider.avoider import Avoider


class ColorAvoider(Avoider):

    def __init__(self, colors, drive_actions):
        self.colors = colors
        self.drive_actions = drive_actions

        self.cs = ColorSensor()

    def triggered(self):
        return self.cs.color in self.colors

    def avoid(self):
        for a in self.drive_actions:
            a.execute()
