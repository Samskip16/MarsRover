from drive.driveAction import DriveAction
from drive.motor import Motor


class RotateAction(DriveAction):

    def __init__(self, speed, degrees):
        self.speed = speed
        self.degrees = degrees

        self.driver = Motor()

    def execute(self):
        self.driver.rotate_degrees(self.speed, self.degrees)
