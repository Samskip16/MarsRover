import threading

from singleton import Singleton


class Store(metaclass=Singleton):

    def __init__(self):
        self.colorsLeft = [2, 4, 5]
        self.lock = threading.Lock()

    def get_colors_left(self):
        return self.colorsLeft

    def found(self, color):
        print("Trying to acquire lock")
        self.lock.acquire()

        print("Lock acquire")
        if color in self.colorsLeft:
            self.colorsLeft.remove(color)

        self.lock.release()
        print("Lock released")
