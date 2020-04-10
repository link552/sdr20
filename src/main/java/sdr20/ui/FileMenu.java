package sdr20.ui;

import javax.swing.*;

public class FileMenu extends JMenu {

    public FileMenu(HostMenuItem hostMenuItem, JoinMenuItem joinMenuItem) {
        super("File");
        add(hostMenuItem);
        add(joinMenuItem);
    }
}
