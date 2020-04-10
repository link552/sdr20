package sdr20.ui;

import javax.swing.*;

public class MainWindow extends JFrame {

    public MainWindow(MainMenuBar mainMenuBar, ContentPanel contentPanel) {
        super();
        setJMenuBar(mainMenuBar);
        add(contentPanel);
        pack();
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
