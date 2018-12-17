from ev3dev2.sensor.lego import ColorSensor

from avoider.avoider import Avoider

from util import constant


class ColorAvoider(Avoider):

    def __init__(self, colors, drive_actions):
        self.colors = colors
        self.drive_actions = drive_actions

        self.cs = ColorSensor()

    def triggered(self):
        if self.cs.color in self.colors:
            return constant.color_sensor_id

        return -1

    def actions(self):
        return self.drive_actions
