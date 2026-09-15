package com.employee.payroll;

import java.awt.Font;
import java.awt.event.*;
import javax.swing.*;

public class EmployeePayrollSystem extends JFrame implements ActionListener {

    JLabel title, lblId, lblName, lblDept, lblDays, lblRate, lblSalary, footer;

    JTextField txtId, txtName, txtDept, txtDays, txtRate, txtSalary;

    JButton btnCompute, btnAdd, btnSave, btnUpdate, btnDelete;
    JButton btnFirst, btnNext, btnPrevious, btnLast, btnExit;

    public EmployeePayrollSystem() {

        setTitle("Employees Information");
        setLayout(null);

        title = new JLabel("Simple Payroll System Version 2.0");
        title.setFont(new Font("Arial", Font.BOLD, 26));
        title.setBounds(170, 40, 420, 40);
        add(title);

        lblId = new JLabel("ID");
        lblName = new JLabel("NAME");
        lblDept = new JLabel("DEPARTMENT");
        lblDays = new JLabel("NO. OF DAYS");
        lblRate = new JLabel("RATE PER DAY");
        lblSalary = new JLabel("SALARY");

        lblId.setBounds(230,100,100,25);
        lblName.setBounds(230,130,100,25);
        lblDept.setBounds(230,160,120,25);
        lblDays.setBounds(230,190,120,25);
        lblRate.setBounds(230,220,120,25);
        lblSalary.setBounds(230,250,120,25);

        add(lblId);
        add(lblName);
        add(lblDept);
        add(lblDays);
        add(lblRate);
        add(lblSalary);

        txtId = new JTextField();
        txtName = new JTextField();
        txtDept = new JTextField();
        txtDays = new JTextField();
        txtRate = new JTextField();
        txtSalary = new JTextField();

        txtId.setBounds(310,100,120,25);
        txtName.setBounds(310,130,120,25);
        txtDept.setBounds(310,160,120,25);
        txtDays.setBounds(310,190,120,25);
        txtRate.setBounds(310,220,120,25);
        txtSalary.setBounds(310,250,120,25);

        add(txtId);
        add(txtName);
        add(txtDept);
        add(txtDays);
        add(txtRate);
        add(txtSalary);

        btnCompute = new JButton("Compute");
        btnCompute.setBounds(280,300,100,30);
        btnCompute.addActionListener(this);
        add(btnCompute);

        btnAdd = new JButton("Add");
        btnSave = new JButton("Save");
        btnUpdate = new JButton("Update");
        btnDelete = new JButton("Delete");

        btnAdd.setBounds(140,350,80,30);
        btnSave.setBounds(230,350,80,30);
        btnUpdate.setBounds(320,350,80,30);
        btnDelete.setBounds(410,350,80,30);

        add(btnAdd);
        add(btnSave);
        add(btnUpdate);
        add(btnDelete);

        btnFirst = new JButton("First");
        btnNext = new JButton("Next");
        btnPrevious = new JButton("Previous");
        btnLast = new JButton("Last");

        btnFirst.setBounds(140,390,80,30);
        btnNext.setBounds(230,390,80,30);
        btnPrevious.setBounds(320,390,80,30);
        btnLast.setBounds(410,390,80,30);

        add(btnFirst);
        add(btnNext);
        add(btnPrevious);
        add(btnLast);

        btnExit = new JButton("Exit");
        btnExit.setBounds(280,440,100,30);
        btnExit.addActionListener(this);
        add(btnExit);

        footer = new JLabel("Developed By : Mr. Jake Rodriguez Pomperada, MAED-IT");
        footer.setFont(new Font("Arial", Font.BOLD, 14));
        footer.setBounds(110,490,500,25);
        add(footer);

        setSize(700,600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == btnCompute) {
            try {
                int days = Integer.parseInt(txtDays.getText());
                double rate = Double.parseDouble(txtRate.getText());

                double salary = days * rate;
                txtSalary.setText(String.valueOf(salary));

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this,
                        "Enter valid Days and Rate.");
            }
        }

        if (e.getSource() == btnExit) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        new EmployeePayrollSystem();
    }
}