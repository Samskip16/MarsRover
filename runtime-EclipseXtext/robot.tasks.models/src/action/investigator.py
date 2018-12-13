import time

from action.action import Action
from drive.motor import Motor


class Investigator(Action):

    def __init__(self, speed):
        self.speed = speed
        self.driver = Motor()

    def execute(self):
        self.driver.arm_down(self.speed)
        time.sleep(2)
        self.driver.arm_up(self.speed)

        return True
