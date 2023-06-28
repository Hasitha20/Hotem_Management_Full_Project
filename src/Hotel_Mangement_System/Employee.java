package Hotel_Mangement_System;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Employee extends JFrame {
    JTable table;
    JButton back;
    Employee(){

        JPanel panel = new JPanel();
        panel.setBounds(5,5,990,590);
        panel.setBackground(new Color(3, 45, 48));
        panel.setLayout(null);
        add(panel);

        table = new JTable();
        table.setBounds(10,34,900,450);
        table.setBackground(new Color(3,45,48));
        table.setForeground(Color.white);
        panel.add(table);

        try{
            con c = new con();
            String EmployeeInfo = "select * from employee";
            ResultSet resultSet = c.statement.executeQuery(EmployeeInfo);
            table.setModel(DbUtils.resultSetToTableModel(resultSet));
        }catch (Exception e) {
            e.printStackTrace();
        }

        back = new JButton("BACK");
        back.setBounds(400,410,120,30);
        back.setForeground(Color.white);
        back.setBackground(Color.black);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });
        panel.add(back);

        JLabel name = new JLabel("NAME:");
        name.setBounds(41,11,70,19);
        name.setForeground(Color.white);
        name.setFont(new Font("Tahoma", Font.BOLD,14));
        panel.add(name);

        JLabel age = new JLabel("AGE:");
        age.setBounds(159,11,105,20);
        age.setForeground(Color.white);
        age.setFont(new Font("Tahoma", Font.BOLD,14));
        panel.add(age);

        JLabel gender = new JLabel("GENDER:");
        gender.setBounds(273,11,105,20);
        gender.setForeground(Color.white);
        gender.setFont(new Font("Tahoma", Font.BOLD,14));
        panel.add(gender);

        JLabel job = new JLabel("JOB:");
        job.setBounds(416,11,105,20);
        job.setForeground(Color.white);
        job.setFont(new Font("Tahoma", Font.BOLD,14));
        panel.add(job);

        JLabel salary = new JLabel("SALARY:");
        salary.setBounds(536,11,105,20);
        salary.setForeground(Color.white);
        salary.setFont(new Font("Tahoma", Font.BOLD,14));
        panel.add(salary);

        JLabel phone = new JLabel("PHONE:");
        phone.setBounds(656,11,105,20);
        phone.setForeground(Color.white);
        phone.setFont(new Font("Tahoma", Font.BOLD,14));
        panel.add(phone);

        JLabel email = new JLabel("EMAIL:");
        email.setBounds(786,11,105,20);
        email.setForeground(Color.white);
        email.setFont(new Font("Tahoma", Font.BOLD,14));
        panel.add(email);

        JLabel aadhr = new JLabel("AADHR:");
        aadhr.setBounds(896,11,105,20);
        aadhr.setForeground(Color.white);
        aadhr.setFont(new Font("Tahoma", Font.BOLD,14));
        panel.add(aadhr);

        setUndecorated(true);
        setLocation(430,100);
        setLayout(null);
        setSize(1000,600);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Employee();
    }
}
