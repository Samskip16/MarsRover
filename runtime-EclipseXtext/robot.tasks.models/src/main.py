#!/usr/bin/env python3

from behaviour.color import Color
from behaviour.distance import Distance
from behaviour.touching import Touching
from modules.bluethooth import Bluetooth
from modules.driver import Driver
from modules.speaker import Speaker
from store import Store


def run():
    while len(s.get_colors_left()) > 0:
        for b in (x for x in behaviours if x.can_execute()):
            b.execute()

    Speaker().speak("Done motherfucker")


print("Starting")

s = Store()
colors = []
for()

behaviours = [Touching(), Color(), Distance()]

b = Bluetooth()
if False:
    print("Connecting as Server...")
    b.connect_as_server()
else:
    print("Connecting as Client...")
    b.connect_as_client()

d = Driver()
d.drive()
run()
