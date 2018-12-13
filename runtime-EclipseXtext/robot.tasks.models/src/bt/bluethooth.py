import bluetooth

from bt.listenerthread import ListenerThread
from util.singleton import Singleton


class Bluetooth(metaclass=Singleton):

    def connect_as_server(self):
        self.server = bluetooth.BluetoothSocket(bluetooth.RFCOMM)
        port = 3

        self.server.bind(("00:17:E9:B2:6C:86", port))
        self.server.listen(1)

        self.client, address = self.server.accept()
        print("Connected!")

        self.listen()

    def connect_as_client(self):
        self.client = bluetooth.BluetoothSocket(bluetooth.RFCOMM)
        port = 3

        self.client.connect(("00:17:E9:B2:6C:86", port))
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
