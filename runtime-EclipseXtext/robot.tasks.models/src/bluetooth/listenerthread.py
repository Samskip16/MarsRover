#!/usr/bin/env python3

import threading

from src.util.store import Store


class ListenerThread(threading.Thread):

    def __init__(self, client):
        threading.Thread.__init__(self)

        self.client = client
        self.store = Store()

    def run(self):
        print("Starting listening thread")

        while True:
            raw = self.client.recv(1024)
            data = str(raw)

            print("Received: ", data)

            splitter = data.split("=")
            key = splitter[0]
            value = bool(splitter[1])

            if key is "ts1":
                self.store.ts1_state = value
            elif key is "ts4":
                self.store.ts4_state = value
            elif key is "us":
                self.store.us_state = value
