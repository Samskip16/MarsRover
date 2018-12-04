from behaviour.behaviour import Behaviour
from modules.bluethooth import Bluetooth
from modules.speaker import Speaker
from modules.driver import Driver

from ev3dev2.sensor.lego import ColorSensor

from store import Store


class Color(Behaviour):

    def __init__(self):
        self.driver = Driver()
        self.speaker = Speaker()
        self.bluetooth = Bluetooth()
        self.store = Store()

        self.cs = ColorSensor()
        self.cs.calibrate_white()

    def can_execute(self):
        colors = self.store.get_colors_left()
        return self.cs.color == 1 or self.cs.color in colors

    def execute(self):
        self.driver.stop()

        if self.cs.color == 1:
            self.speaker.play_blyat()
            self.driver.reverse_rotations(0.75)
            self.driver.rotate_degrees(150)
        else:
            self.store.found(self.cs.color)
            self.bluetooth.send(self.cs.color)
            self.speak_color(self.cs.color)

        self.driver.drive()

    def speak_color(self, color):
        if color == 2:
            self.speaker.speak("Blue found")
        elif color == 4:
            self.speaker.speak("Yellow found")
        elif color == 5:
            self.speaker.speak("Red found")
