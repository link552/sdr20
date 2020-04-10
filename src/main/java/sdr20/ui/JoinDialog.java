package sdr20.ui;

import sdr20.net.*;
import java.awt.event.*;
import javax.swing.*;

public class JoinDialog extends JDialog implements ActionListener {
    private Socket socket;
    private JTextField textField = new JTextField(15);

    public JoinDialog(MainWindow mainWindow, Socket socket) {
        super(mainWindow, "Join");
        this.socket = socket;

        JPanel panel = new JPanel();
        add(panel);

        JLabel label = new JLabel("Hostname:");
        panel.add(label);

        panel.add(textField);

        JButton button = new JButton("Join");
        button.addActionListener(this);
        panel.add(button);

        pack();
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        String hostname = textField.getText().trim();
        socket.join(hostname, 8080);
        setVisible(false);
    }
}
