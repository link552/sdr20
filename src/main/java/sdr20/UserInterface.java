package sdr20;

import java.awt.event.*;
import javax.swing.*;

public class UserInterface extends JFrame implements ActionListener {
    private JMenuBar menuBar;
    private JMenu fileMenu;
    private JMenuItem hostMenuItem;
    private JMenuItem joinMenuItem;
    private JPanel contentPanel;
    private JTextArea chatTextArea;
    private JScrollPane chatScrollPane;
    private JPanel messagePanel;
    private JTextField messageTextField;
    private JButton sendButton;
    private JDialog hostDialog;
    private JDialog joinDialog;

    public UserInterface() throws Exception {
        super("SDR20");
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());

        menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        fileMenu = new JMenu("File");
        menuBar.add(fileMenu);

        hostMenuItem = new JMenuItem("Host");
        hostMenuItem.addActionListener(this);
        fileMenu.add(hostMenuItem);

        joinMenuItem = new JMenuItem("Join");
        joinMenuItem.addActionListener(this);
        fileMenu.add(joinMenuItem);

        contentPanel = new JPanel();
        contentPanel.setLayout(
            new BoxLayout(contentPanel, BoxLayout.PAGE_AXIS)
        );
        add(contentPanel);

        chatTextArea = new JTextArea(6, 30);
        chatTextArea.setEnabled(false);

        chatScrollPane = new JScrollPane(chatTextArea);
        contentPanel.add(chatTextArea);

        messagePanel = new JPanel();
        contentPanel.add(messagePanel);

        messageTextField = new JTextField(30);
        messageTextField.setEnabled(false);
        messagePanel.add(messageTextField);

        sendButton = new JButton("Send");
        sendButton.addActionListener(this);
        sendButton.setEnabled(false);
        messagePanel.add(sendButton);

        hostDialog = new JDialog(this, "Host");
        hostDialog.setLocationRelativeTo(null);
        hostDialog.setModal(true);

        joinDialog = new JDialog(this, "Join");
        joinDialog.setLocationRelativeTo(null);
        joinDialog.setModal(true);

        pack();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        Object source = event.getSource();

        if (source.equals(hostMenuItem)) {
            hostDialog.setVisible(true);
        }

        if (source.equals(joinMenuItem)) {
            joinDialog.setVisible(true);
        }

        if (source.equals(sendButton)) {
            System.out.println("Send clicked.");
        }
    }
}
