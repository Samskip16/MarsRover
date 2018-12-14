import bluetooth

from bt.listenerthread import ListenerThread
from util.singleton import Singleton


class Bluetooth(metaclass=Singleton):

    def connect_as_server(self):
        self.server = bluetooth.BluetoothSocket(bluetooth.RFCOMM)
        port = 3

        self.server.bind(("CC:78:AB:4D:DC:04", port))
        self.server.listen(1)

        self.client, address = self.server.accept()
        print("Connected!")

    def connect_as_client(self):
        self.client = bluetooth.BluetoothSocket(bluetooth.RFCOMM)
        port = 3

        self.client.connect(("CC:78:AB:4D:DC:04", port))
        print("Connected!")

        self.listen()

    def send(self, value):
        print("Sending: ", str(value))
        self.client.send(str(value))

    def listen(self):
        t = ListenerThread(self.client)
        t.start()

    def close(self):
        self.client.close()
        if self.server is not None:
            self.server.close()
