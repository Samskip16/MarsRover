#!/usr/bin/env python3
from action.colorFinder import ColorFinder
from avoider.colorAvoider import ColorAvoider
from base.mission import Mission
from base.task import Task
# from bt.bluethooth import Bluetooth
from color import Color
from drive.moveAction import MoveAction
from drive.rotateAction import RotateAction
from drive.speed import Speed


def run():
    for m in missions:
        m.execute()


print("Starting brick 1")
missions = []


print("Creating tasks...")
task_Task1 = Task()
task_Task1.set_action(ColorFinder([Color.GREEN], Speed.SLOW)
)

task_Task1.add_avoider(ColorAvoider(Color.RED, [MoveAction(Speed.NORMAL, 10),
RotateAction(Speed.NORMAL, 3),
MoveAction(Speed.NORMAL, 100)
])
)

print("Creating missions...")
missions.append(Mission([task_Task1
]))


print("Connecting as Client...")

# b = Bluetooth()
# b.connect_as_client()

run()
