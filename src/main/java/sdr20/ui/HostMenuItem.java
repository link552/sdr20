package sdr20.ui;

import sdr20.net.*;
import java.awt.event.*;
import javax.swing.*;

public class HostMenuItem extends JMenuItem implements ActionListener {
    private Socket socket;

    public HostMenuItem(Socket socket) {
        super("Host");
        this.socket = socket;
        addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        socket.host(8080);
    }
}
