from util.singleton import Singleton


class Store(metaclass=Singleton):

    def __init__(self):
        self.ts1_state = False
        self.ts4_state = False
        self.us_state = False

    def has_touched(self):
        return self.ts1_state or self.ts4_state
