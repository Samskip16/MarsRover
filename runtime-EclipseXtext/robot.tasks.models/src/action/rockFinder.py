from action.action import Action
from drive.motor import Motor
from util.store import Store


class RockFinder(Action):

    def __init__(self, colors, speed):
        self.colors = colors
        self.speed = speed

        self.driver = Motor()
        self.store = Store()

    def execute(self):
        if self.store.has_touched():
            return True
        else:
            self.driver.drive(self.speed)
