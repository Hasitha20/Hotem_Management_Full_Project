package Hotel_Mangement_System;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Department extends JFrame {
    JTable table;
    JButton back;
    Department(){
        JPanel panel = new JPanel();
        panel.setBounds(5,5,690,490);
        panel.setBackground(new Color(3, 45, 48));
        panel.setLayout(null);
        add(panel);

        table = new JTable();
        table.setBounds(0,40,700,350);
        table.setBackground(new Color(3,45,48));
        table.setForeground(Color.white);
        panel.add(table);

        try{
            con c = new con();
            String DepartmentInfo = "select * from department";
            ResultSet resultSet = c.statement.executeQuery(DepartmentInfo);
            table.setModel(DbUtils.resultSetToTableModel(resultSet));
        }catch (Exception e) {
            e.printStackTrace();
        }

        JLabel department = new JLabel("Department:");
        department.setBounds(145,11,105,20);
        department.setForeground(Color.white);
        department.setFont(new Font("Tahoma", Font.BOLD,14));
        panel.add(department);

        JLabel department2 = new JLabel("Budget:");
        department2.setBounds(431,11,105,20);
        department2.setForeground(Color.white);
        department2.setFont(new Font("Tahoma", Font.BOLD,14));
        panel.add(department2);

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

        setUndecorated(true);
        setLocation(500,150);
        setLayout(null);
        setSize(700,500);
        setVisible(true);
    }
    public static void main(String[] args) {

    }
}
