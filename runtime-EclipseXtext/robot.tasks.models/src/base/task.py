from avoider.egdeAvoider import EdgeAvoider

from drive.motor import Motor


class Task:

    def __init__(self):
        self.avoiders = []
        self.avoiders.append(EdgeAvoider())

        self.motor = Motor()

    def set_action(self, action):
        self.action = action

    def add_avoider(self, avoider):
        self.avoiders.append(avoider)

    def execute(self):
        i = 0
        sensor_id = -1
        actions = []

        while True:

            for x in self.avoiders:
                val = x.triggered()

                if val is not -1 and val is not sensor_id:
                    print("Triggered avoider ID: " + str(val))
                    self.motor.stop_drive()

                    i = 0
                    sensor_id = val

                    actions.clear()
                    actions.extend(x.actions())
                    break

            if i < len(actions):
                if not self.motor.is_running():
                    print("Executing avoider i: " + str(i))
                    actions[i].execute()
                    i += 1
            else:
                if actions:
                    i = 0
                    sensor_id = -1
                    actions.clear()

                # print("Task: executing")
                if self.action.execute():
                    return
