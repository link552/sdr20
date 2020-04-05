package sdr20;

import java.io.IOException;
import java.net.*;

class Client {

    public void run(String hostname) {
        int port = 8080;

        InetAddress address;

        try {
            address = InetAddress.getByName(hostname);
        } catch (UnknownHostException exception) {
            exception.printStackTrace();
            return;
        }

        DatagramSocket socket;

        try {
            socket = new DatagramSocket();
        } catch (SocketException exception) {
            exception.printStackTrace();
            return;
        }

        String message = "This is a message.";
        byte[] buffer = message.getBytes();

        DatagramPacket packet = new DatagramPacket(
            buffer,
            buffer.length,
            address,
            port
        );

        try {
            socket.send(packet);
        } catch (IOException exception) {
            exception.printStackTrace();
            return;
        }

        socket.close();
    }
}
