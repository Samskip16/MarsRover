from drive.driveAction import DriveAction
from drive.motor import Motor


class MoveAction(DriveAction):

    def __init__(self, speed, meters):
        self.speed = speed
        self.meters = meters

        self.driver = Motor()

    def execute(self):
        self.driver.drive_meters(self.speed, self.meters)
