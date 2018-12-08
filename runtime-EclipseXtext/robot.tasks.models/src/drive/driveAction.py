from src.drive.motor import Motor


class DriveAction:

    def __init__(self, speed, meters, degrees):
        self.speed = speed
        self.meters = meters
        self.degrees = degrees

        self.driver = Motor()

    def execute(self):
        if self.meters is 0:
            self.driver.rotate_degrees(self.speed, self.degrees)
        else:
            self.driver.drive_meters(self.speed, self.meters)
