package ContactsMerge;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by tjones on 11/3/2015.
 */
public class ContactsMergeMainForm {


    private JTextField username;

    private JTextField password;
    private JComboBox comboBox1;
    private JPanel ContactsMergeMainFormPanel;
    private JTable table1;
    private JTextPane textPane1;
    private JTextPane textPane2;
    private JButton getContactsButton;

    public ContactsMergeMainForm() {
        getContactsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("button pushed: " + e.getActionCommand());
                System.out.println("username=" + username.getText());
                System.out.println("password=" + password.getText());
                System.out.println("comboBox1=" + comboBox1.getSelectedItem());
                System.out.println("comboBox2=" + comboBox1.getSelectedItem());
            }
        });
    }

    public static void buildMainForm(String[] args) {
        JFrame frame = new JFrame("ContactsMergeMainForm");
        frame.setContentPane(new ContactsMergeMainForm().ContactsMergeMainFormPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
    public JTextField getUsername() {
        return username;
    }

    public void setUsername(JTextField username) {
        this.username = username;
    }

    public JTextField getPassword() {
        return password;
    }

    public void setPassword(JTextField password) {
        this.password = password;
    }


    public JComboBox getComboBox1() {
        return comboBox1;
    }

    public void setComboBox1(JComboBox comboBox1) {
        this.comboBox1 = comboBox1;
    }

    public JPanel getContactsMergeMainFormPanel() {
        return ContactsMergeMainFormPanel;
    }

    public void setContactsMergeMainFormPanel(JPanel contactsMergeMainFormPanel) {
        ContactsMergeMainFormPanel = contactsMergeMainFormPanel;
    }

    public JTable getTable1() {
        return table1;
    }

    public void setTable1(JTable table1) {
        this.table1 = table1;
    }

    public JTextPane getTextPane1() {
        return textPane1;
    }

    public void setTextPane1(JTextPane textPane1) {
        this.textPane1 = textPane1;
    }

    public JTextPane getTextPane2() {
        return textPane2;
    }

    public void setTextPane2(JTextPane textPane2) {
        this.textPane2 = textPane2;
    }

    public JButton getGetContactsButton() {
        return getContactsButton;
    }

    public void setGetContactsButton(JButton getContactsButton) {
        this.getContactsButton = getContactsButton;
    }

    @Override
    public String toString() {
        return "ContactsMergeMainForm{" +
                "username=" + username +
                ", password=" + password +
                ", comboBox1=" + comboBox1 +
                ", ContactsMergeMainFormPanel=" + ContactsMergeMainFormPanel +
                ", table1=" + table1 +
                ", textPane1=" + textPane1 +
                ", textPane2=" + textPane2 +
                ", getContactsButton=" + getContactsButton +
                '}';
    }
}
