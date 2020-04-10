package sdr20.net;

import java.io.IOException;
import java.net.*;

public class Socket extends DatagramSocket {

    public Socket() throws SocketException {
        super();
    }

    public void join(String hostname, int port) {
        InetAddress address;

        try {
            address = InetAddress.getByName(hostname);
        } catch (UnknownHostException exception) {
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
            send(packet);
        } catch (IOException exception) {
            exception.printStackTrace();
            return;
        }

        close();
    }

    public void host(int port) {
        InetAddress address;

        try {
            address = InetAddress.getByName("localhost");
        } catch (UnknownHostException exception) {
            exception.printStackTrace();
            return;
        }

        connect(address, port);

        byte[] buffer = new byte[512];
        DatagramPacket packet = new DatagramPacket(buffer, buffer.length);

        try {
            receive(packet);
        } catch (IOException exception) {
            exception.printStackTrace();
            return;
        }

        String data = new String(buffer);

        close();
    }
}
