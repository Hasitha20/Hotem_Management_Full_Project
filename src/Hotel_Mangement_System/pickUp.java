package Hotel_Mangement_System;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.InputStream;
import java.io.Reader;
import java.math.BigDecimal;
import java.net.URL;
import java.sql.*;
import java.util.Calendar;
import java.util.Map;

public class pickUp extends JFrame {
    pickUp(){

        JPanel panel = new JPanel();
        panel.setBounds(5,5,790,590);
        panel.setBackground(new Color(3, 45, 48));
        panel.setLayout(null);
        add(panel);

        JLabel pus = new JLabel("Pick Up Service");
        pus.setBounds(90,11,160,15);
        pus.setForeground(Color.white);
        pus.setFont(new Font("Tahoma", Font.BOLD,20));
        panel.add(pus);

        JLabel TOQ = new JLabel("Type of Car");
        TOQ.setBounds(32,97,89,20);
        TOQ.setForeground(Color.white);
        TOQ.setFont(new Font("Tahoma", Font.BOLD,14));
        panel.add(TOQ);

        Choice c = new Choice();
        c.setBounds(123,94,150,25);
        panel.add(c);

        try {
            con C = new con();
            ResultSet resultSet = C.statement.executeQuery("select * from driver");
            while (resultSet.next()){
                c.add(resultSet.getString("carname"));
            }

        } catch (Exception e){
            e.printStackTrace();
        }

        JTable table = new JTable();
        table.setBounds(10,233,800,250);
        table.setBackground(new Color(3, 45, 48));
        table.setForeground(Color.white);
        panel.add(table);

        try {

            con C = new con();
            String q = "select * from driver";
            ResultSet resultSet =C.statement.executeQuery(q);
            table.setModel(DbUtils.resultSetToTableModel(resultSet));
        } catch (Exception e){
            e.printStackTrace();
        }

        JLabel name = new JLabel("Name");
        name.setBounds(24,200,46,14);
        name.setForeground(Color.white);
        panel.add(name);

        JLabel age = new JLabel("Age");
        age.setBounds(165,200,46,14);
        age.setForeground(Color.white);
        panel.add(age);

        JLabel gender = new JLabel("Gender");
        name.setBounds(264,200,46,14);
        name.setForeground(Color.white);
        panel.add(gender);

        JLabel company = new JLabel("Company");
        company.setBounds(366,200,100,14);
        company.setForeground(Color.white);
        panel.add(company);

        JLabel Carname = new JLabel("Car Name");
        Carname.setBounds(486,200,100,14);
        Carname.setForeground(Color.white);
        panel.add(Carname);

        JLabel Available = new JLabel("Available");
        Available.setBounds(600,200,100,14);
        Available.setForeground(Color.white);
        panel.add(Available);

        JLabel location = new JLabel("Location");
        location.setBounds(700,200,100,14);
        location.setForeground(Color.white);
        panel.add(location);

        JButton display = new JButton("Display");
        display.setBounds(200,500,120,30);
        display.setForeground(Color.white);
        display.setBackground(Color.black);
        panel.add(display);

        display.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String q = "select * from driver where carname = '"+c.getSelectedItem()+"'";
                try{
                    con c = new con();
                    ResultSet resultSet = c.statement.executeQuery(q);
                    table.setModel((DbUtils.resultSetToTableModel(resultSet)));
                }catch (Exception E){
                    E.printStackTrace();
                }
            }
        });


        JButton back = new JButton("Back");
        back.setBounds(420,500,120,30);
        back.setForeground(Color.white);
        back.setBackground(Color.black);
        panel.add(back);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });

        setLocation(500,100);
        setLayout(null);
        setSize(800,600);
        setVisible(true);
    }
    public static void main(String[] args) {
        new pickUp();
    }
}
