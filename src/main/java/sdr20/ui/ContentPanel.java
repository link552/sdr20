package sdr20.ui;

import javax.swing.*;

public class ContentPanel extends JPanel {

    public ContentPanel(ChatScrollPane chatScrollPane, SendButton sendButton) {
        add(chatScrollPane);
        add(sendButton);
    }
}
