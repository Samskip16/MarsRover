from avoider.avoider import Avoider

from util.store import Store

from util import constant


class RockAvoider(Avoider):

    def __init__(self, drive_actions):
        self.drive_actions = drive_actions
        self.store = Store()

    def triggered(self):
        if self.store.has_approached():
            return constant.us_front_sensor_id

        return -1

    def actions(self):
        return self.drive_actions
