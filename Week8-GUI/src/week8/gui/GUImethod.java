/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week8.gui;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author 4florc81
 */
public class GUImethod extends JFrame {

    private GridBagConstraints constraints;

    private JLabel lblRegNo;
    private JLabel lblColour;
    private JLabel lblMake;
    private JLabel lblModel;
    private JLabel lblStatus;

    private JTextField txt_regNo;
    private JTextField txt_colour;
    private JTextField txt_make;
    private JTextField txt_model;

    private JButton btnAdd;
    private JButton btnRemove;

    public GUImethod() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new GridBagLayout());
        constraints = new GridBagConstraints();
        initComponents();
        layoutComponents();
    }

    public void initComponents() {
        lblRegNo = new JLabel("Reg No.");
        lblColour = new JLabel("Colour");
        lblMake = new JLabel("Make");
        lblModel = new JLabel("Model");
        lblStatus = new JLabel("There are 15 empty spaces");
        //Here will be the lblStatus

        txt_regNo = new JTextField();
        txt_colour = new JTextField();
        txt_make = new JTextField();
        txt_model = new JTextField();

        btnAdd = new JButton("Add a Car");
        btnRemove = new JButton("Remove a Car");
    }

    public void layoutComponents() {
        constraints.gridy = 0;
        constraints.gridx = 0;
        constraints.gridwidth = 1;
        this.add(lblRegNo, constraints);

        constraints.gridy = 0;
        constraints.gridx = 1;
        constraints.fill = GridBagConstraints.HORIZONTAL;
        this.add(txt_regNo, constraints);

        constraints.gridy = 1;
        constraints.gridx = 0;
        constraints.fill = GridBagConstraints.LINE_END;
        this.add(lblColour, constraints);

        constraints.gridy = 1;
        constraints.gridx = 1;
        constraints.fill = GridBagConstraints.HORIZONTAL;
        this.add(txt_colour, constraints);

        constraints.gridy = 2;
        constraints.gridx = 0;
        constraints.fill = GridBagConstraints.LINE_END;
        this.add(lblMake, constraints);

        constraints.gridy = 2;
        constraints.gridx = 1;
        constraints.fill = GridBagConstraints.HORIZONTAL;
        this.add(txt_make, constraints);

        constraints.gridy = 3;
        constraints.gridx = 0;
        constraints.fill = GridBagConstraints.LINE_END;
        this.add(lblModel, constraints);

        constraints.gridy = 3;
        constraints.gridx = 1;
        constraints.fill = GridBagConstraints.HORIZONTAL;
        this.add(txt_model, constraints);

        constraints.gridy = 4;
        constraints.gridx = 0;
        constraints.gridwidth = 2;
        constraints.fill = GridBagConstraints.LINE_END;
        this.add(lblStatus, constraints);

        constraints.gridy = 5;
        constraints.gridx = 0;
        constraints.gridwidth = 1;
        this.add(btnAdd, constraints);

        constraints.gridy = 5;
        constraints.gridx = 1;
        this.add(btnRemove, constraints);
    }
}
