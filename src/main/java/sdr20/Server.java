package sdr20;

import java.net.*;
import java.io.IOException;

class Server {

    public void run() {
        int port = 8080;
        DatagramSocket socket;

        try {
            socket = new DatagramSocket(port);
        } catch (SocketException exception) {
            exception.printStackTrace();
            return;
        }

        byte[] buffer = new byte[512];
        DatagramPacket packet = new DatagramPacket(buffer, buffer.length);

        try {
            socket.receive(packet);
        } catch (IOException exception) {
            exception.printStackTrace();
            return;
        }

        String data = new String(buffer);
        System.out.println(data);

        socket.close();
    }
}
