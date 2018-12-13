from ev3dev2.motor import MoveTank, OUTPUT_A, OUTPUT_B, OUTPUT_D, SpeedPercent, LargeMotor

from drive.speed import Speed
from util.singleton import Singleton


class Motor(metaclass=Singleton):

    def __init__(self):
        self.tank = MoveTank(OUTPUT_A, OUTPUT_D)
        # self.arm = LargeMotor(OUTPUT_B)

    def drive_on(self, speed):
        per = self.__to_speed_per(speed)
        self.__drive_on(per)

    def __drive_on(self, speed_per):
        self.tank.on(SpeedPercent(speed_per), SpeedPercent(speed_per))

    def drive_meters(self, speed, meters):
        per = self.__to_speed_per(speed)
        self.__drive_meters(per, meters)

    def __drive_meters(self, speed_per, meters):
        if meters < 0:
            meters = abs(meters)
            speed_per = -speed_per

        self.tank.on_for_degrees(SpeedPercent(speed_per), SpeedPercent(speed_per), meters)

    def rotate_degrees(self, speed, degrees):
        per = self.__to_speed_per(speed)

        degrees = degrees * 2
        if degrees > 0:
            self.tank.on_for_degrees(SpeedPercent(per), SpeedPercent(0), degrees)
        else:
            self.tank.on_for_degrees(SpeedPercent(0), SpeedPercent(per), degrees)

    def stop_drive(self):
        self.tank.stop()

    def arm_up(self, speed):
        per = self.__to_speed_per(speed)
        self.arm.on_for_rotations(SpeedPercent(per), 1)

    def arm_down(self, speed):
        per = self.__to_speed_per(speed)
        self.arm.on_for_rotations(SpeedPercent(per), -1)

    def __to_speed_per(self, speed):
        switcher = {
            Speed.SLOW: 10,
            Speed.NORMAL: 30,
            Speed.FAST: 50
        }

        return switcher.get(speed, 30)
