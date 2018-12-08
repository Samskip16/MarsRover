#!/usr/bin/env python3
from src.bluetooth.bluethooth import Bluetooth


def run():
    for t in tasks:
        t.execute()


print("Starting brick 1")
print("Connecting as Client...")

b = Bluetooth()
b.connect_as_client()

tasks = []
run()
