from ev3dev2.sound import Sound

from src.action.action import Action


class Speaker(Action):

    def __init__(self, text):
        self.text = text
        self.sound = Sound()

    def execute(self):
        self.sound.speak(self.text)
        return True
