from ev3dev2.motor import MoveTank, OUTPUT_A, OUTPUT_D, SpeedPercent

from singleton import Singleton


class Driver(metaclass=Singleton):

    def __init__(self):
        self.tank = MoveTank(OUTPUT_A, OUTPUT_D)

    def drive(self):
        self.tank.on(SpeedPercent(30), SpeedPercent(30))

    def stop(self):
        self.tank.stop()

    def reverse_rotations(self, rotations):
        self.tank.on_for_rotations(SpeedPercent(-35), SpeedPercent(-35), rotations)

    def rotate_degrees(self, degrees):
        degrees = degrees * 2
        self.tank.on_for_degrees(SpeedPercent(40), SpeedPercent(0), degrees)
