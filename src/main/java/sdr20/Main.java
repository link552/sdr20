package sdr20;

import sdr20.ui.*;
import sdr20.net.*;
import javax.swing.*;

public class Main {

    public static void main(String[] args) throws Exception {
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        Socket socket = new Socket();
        HostMenuItem hostMenuItem = new HostMenuItem(socket);
        JoinMenuItem joinMenuItem = new JoinMenuItem();
        FileMenu fileMenu = new FileMenu(hostMenuItem, joinMenuItem);
        MainMenuBar mainMenuBar = new MainMenuBar(fileMenu);
        ChatTextArea chatTextArea = new ChatTextArea();
        ChatScrollPane chatScrollPane = new ChatScrollPane(chatTextArea);
        SendButton sendButton = new SendButton();
        ContentPanel contentPanel = new ContentPanel(chatScrollPane, sendButton);
        MainWindow mainWindow = new MainWindow(mainMenuBar, contentPanel);

        JoinDialog joinDialog = new JoinDialog(mainWindow, socket);
        joinMenuItem.setDialog(joinDialog);

        mainWindow.setVisible(true);
    }
}
