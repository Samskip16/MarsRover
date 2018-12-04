from ev3dev2.sound import Sound

from singleton import Singleton


class Speaker(metaclass=Singleton):

    def __init__(self):
        self.s = Sound()

    def speak(self, text):
        self.s.speak(text)

    def play_blyat(self):
        self.s.play("blyat.wav")
