#!/usr/bin/env python3

from src.bluetooth.bluethooth import Bluetooth
from src.sensorCollector import SensorCollector

print("Starting brick 2")
print("Connecting as Server...")

b = Bluetooth()
b.connect_as_server()

sc = SensorCollector()
sc.collect()
