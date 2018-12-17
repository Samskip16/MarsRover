#!/usr/bin/env python3

import threading

from util.store import Store


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
            data = data[2:-1]

            # print("Received: ", data)

            for x in data.split(";"):
                splitter = x.split("=")
                key = splitter[0]
                value = splitter[1] == "True"

                # print("XXX: " + x)
                # print("KEYY: " + key)
                # print("VALUEE: " + str(value))
                # print("SPLITTER: " + splitter[1])

                if key == "ts1":
                    self.store.ts1_state = value
                elif key == "ts4":
                    self.store.ts4_state = value
                elif key == "us":
                    # print("STORE: " + str(value))
                    self.store.us_state = value
