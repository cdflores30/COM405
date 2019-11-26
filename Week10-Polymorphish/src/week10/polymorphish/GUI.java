/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week10.polymorphish;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Carlos Flores
 */
public class GUI extends JFrame{
private JLabel lbl_title;
private JLabel lbl_currentWeight;
private JLabel lbl_currentLoadNumeric;
private JLabel lbl_registration;
private JLabel lbl_vehicleWeight;
private JLabel lbl_access;
private JLabel lbl_fee;

private JTextField txt_vehicleWeight;
private JTextField txt_Registration;

private JButton btn_Add;
private JButton btn_Remove;

private GridBagConstraints con;

public GUI(){
this.setDefaultCloseOperation(EXIT_ON_CLOSE);
this.setLayout(new GridBagLayout());
con = new GridBagConstraints();
initComponents();
layoutComponents();
}

public void initComponents(){
lbl_title = new JLabel ("Bridge System");
lbl_currentWeight = new JLabel ("Current Load :");
lbl_currentLoadNumeric = new JLabel ("");
lbl_registration = new JLabel ("Registration: ");
lbl_vehicleWeight = new JLabel ("Weight: ");
lbl_access = new JLabel ("");
lbl_fee = new JLabel ("Fee: 5.00£");

txt_vehicleWeight = new JTextField();
txt_Registration = new JTextField();

btn_Add = new JButton("Add Vehicle");
btn_Remove = new JButton("Remove Vehicle");
}

public void layoutComponents(){
con.gridx = 0;
con.gridy = 0;
con.gridwidth = 2;
this.add(lbl_title, con);

con.gridx = 0;
con.gridy = 1;
con.gridwidth = 1;
this.add(lbl_currentWeight, con);

con.gridx = 1;
con.gridy = 1;
this.add(lbl_currentLoadNumeric, con);

con.gridx = 0;
con.gridy = 2;
this.add(lbl_registration, con);

con.gridx = 1;
con.gridy = 2;
con.fill = GridBagConstraints.HORIZONTAL;
this.add(txt_Registration, con);

con.gridx = 0;
con.gridy = 3;
con.fill = GridBagConstraints.NONE;
this.add(lbl_vehicleWeight, con);

con.gridx = 1;
con.gridy = 3;
con.fill = GridBagConstraints.HORIZONTAL;
this.add(txt_vehicleWeight, con);

con.gridx = 0;
con.gridy = 4;
this.add(btn_Add, con);

con.gridx = 1;
con.gridy = 4;
this.add(btn_Remove, con);

con.gridx = 0;
con.gridy = 5;
con.gridwidth = 2;
this.add(lbl_access, con);

con.gridx = 0;
con.gridy = 6;
con.fill = GridBagConstraints.CENTER;
this.add(lbl_fee, con);
}


}
