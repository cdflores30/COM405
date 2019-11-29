/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week10.polymorphish;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Carlos Flores
 */
public class GUI extends JFrame implements ActionListener {

    Bridge brid = new Bridge(30000, 20);

    private JLabel lbl_title;
    private JLabel lbl_currentWeight;
    private JLabel lbl_currentLoadNumeric;
    private JLabel lbl_registration;
    private JLabel lbl_vehicleWeight;

    private JTextField txt_vehicleWeight;
    private JTextField txt_Registration;

    private JButton btn_Add;
    private JButton btn_Remove;

    private GridBagConstraints con;

    public GUI() {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new GridBagLayout());
        con = new GridBagConstraints();
        initComponents();
        layoutComponents();
    }

    public void initComponents() {
        lbl_title = new JLabel("Bridge System");
        lbl_currentWeight = new JLabel("Current Load :");
        lbl_currentLoadNumeric = new JLabel("0");
        lbl_registration = new JLabel("Registration: ");
        lbl_vehicleWeight = new JLabel("Weight: ");
        txt_vehicleWeight = new JTextField();
        txt_Registration = new JTextField();

        btn_Add = new JButton("Add Vehicle");
        btn_Add.addActionListener(this);
        btn_Remove = new JButton("Remove Vehicle");
        btn_Remove.addActionListener(this);
    }

    public void layoutComponents() {
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
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(btn_Add)) {
            String reg = txt_Registration.getText();
            double weight = Double.valueOf(txt_vehicleWeight.getText());
            Vehicle veh = null;

            if (weight < 500) {
                veh = new Motorbike(reg, weight);
                if (brid.addVehicle(veh)) {

                    JOptionPane.showMessageDialog(null, "Vehicle has been added\n" + "The price to be paid is £" + veh.calculateFee());
                    lbl_currentLoadNumeric.setText(String.valueOf(brid.calcTotalWeight()) + " Kg");
                } else {
                    JOptionPane.showMessageDialog(null, "Could not be added");
                }
            } else if (weight >= 500 && weight <= 3500) {
                veh = new Car(reg, weight);
                if (brid.addVehicle(veh)) {

                    JOptionPane.showMessageDialog(null, "Vehicle has been added\n" + "The price to be paid is £" + veh.calculateFee());
                    lbl_currentLoadNumeric.setText(String.valueOf(brid.calcTotalWeight()) + " Kg");
                } else {
                    JOptionPane.showMessageDialog(null, "Could not be added");
                }
            } else {
                veh = new Lorry(reg, weight);
                if (brid.addVehicle(veh)) {

                    JOptionPane.showMessageDialog(null, "Vehicle has been added\n" + "The price to be paid is £" + veh.calculateFee());
                    lbl_currentLoadNumeric.setText(String.valueOf(brid.calcTotalWeight()) + " Kg");
                } else {
                    JOptionPane.showMessageDialog(null, "Could not be added");
                }
            }
        } else if (e.getSource().equals(btn_Remove)) {
            String reg = txt_Registration.getText();
            if (brid.removeVehicle(reg)) {
                JOptionPane.showMessageDialog(null, "Vehicle has been removed");
            } else {
                JOptionPane.showMessageDialog(null, "This vehicle is not registered");
            }

        }
    }

}
