class Mission:

    def __init__(self, tasks):
        self.tasks = tasks

    def execute(self):
        for t in self.tasks:
            t.execute()
