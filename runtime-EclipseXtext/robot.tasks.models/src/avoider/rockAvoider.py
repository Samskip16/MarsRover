from avoider.avoider import Avoider

from util.store import Store


class RockAvoider(Avoider):

    def __init__(self, drive_actions):
        self.drive_actions = drive_actions
        self.store = Store()

    def triggered(self):
        return self.store.has_approached()

    def avoid(self):
        for a in self.drive_actions:
            a.execute()
