package sdr20.ui;

import java.awt.event.*;
import javax.swing.*;

public class JoinMenuItem extends JMenuItem implements ActionListener {
    private JoinDialog joinDialog;

    public JoinMenuItem() {
        super("Join");
        addActionListener(this);
    }

    public void setDialog(JoinDialog joinDialog) {
        this.joinDialog = joinDialog;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        joinDialog.setModal(true);
        joinDialog.setVisible(true);
    }
}
