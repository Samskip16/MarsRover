#!/usr/bin/env python3

import threading

from modules.speaker import Speaker
from store import Store


class ListenerThread(threading.Thread):

    def __init__(self, client):
        threading.Thread.__init__(self)
        self.client = client
        self.speaker = Speaker()
        self.store = Store()

    def run(self):
        print("Starting listening thread")

        while True:
            data = self.client.recv(1024)
            print("Received: ", str(data))

            if int(data) == 2:
                self.speaker.speak("Heard blue was found")
            elif int(data) == 4:
                self.speaker.speak("Heard yellow was found")
            elif int(data) == 5:
                self.speaker.speak("Heard red was found")

            self.store.found(int(data))
