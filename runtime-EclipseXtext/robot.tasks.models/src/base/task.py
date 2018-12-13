from avoider.egdeAvoider import EdgeAvoider


class Task:

    def __init__(self):
        self.avoiders = []
        self.avoiders.append(EdgeAvoider())

    def set_action(self, action):
        self.action = action

    def add_avoider(self, avoider):
        self.avoiders.append(avoider)

    def execute(self):
        while True:
            for a in (x for x in self.avoiders if x.triggered()):
                print("Task: avoiding: " + str(a))
                a.avoid()

            print("Task: executing")
            if self.action.execute():
                return
