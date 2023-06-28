package Hotel_Mangement_System;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class CustomerInfo extends JFrame  {

    JButton   back;
    CustomerInfo(){

        JPanel panel = new JPanel();
        panel.setBounds(5,5,890,590);
        panel.setBackground(new Color(3, 45, 48));
        panel.setLayout(null);
        add(panel);

        JTable table = new JTable();
        table.setBounds(10,40,900,450);
        table.setForeground(Color.white);
        table.setBackground(new Color(3, 45, 48));
        panel.add(table);

        try {

            con c = new con();
            String q = "select * from Customer";
            ResultSet resultSet = c.statement.executeQuery(q);
            table.setModel((DbUtils.resultSetToTableModel(resultSet)));

        } catch ( Exception e) {
            e.printStackTrace();
        }

        JLabel id = new JLabel("ID");
        id.setBounds(31,11,100,14);
        id.setForeground(Color.white);
        id.setFont(new Font("Tahoma", Font.BOLD,14));
        panel.add(id);

        JLabel number = new JLabel("Number");
        number.setBounds(150,11,100,14);
        number.setForeground(Color.white);
        number.setFont(new Font("Tahoma", Font.BOLD,14));
        panel.add(number);

        JLabel name = new JLabel("Name");
        name.setBounds(270,11,46,14);
        name.setForeground(Color.white);
        name.setFont(new Font("Tahoma", Font.BOLD,14));
        panel.add(name);

        JLabel gender = new JLabel("Gender");
        gender.setBounds(360,11,100,14);
        gender.setForeground(Color.white);
        gender.setFont(new Font("Tahoma", Font.BOLD,14));
        panel.add(gender);

        JLabel country = new JLabel("Country");
        country.setBounds(480,11,100,25);
        country.setForeground(Color.white);
        country.setFont(new Font("Tahoma", Font.BOLD,14));
        panel.add(country);

        JLabel room = new JLabel("Room");
        room.setBounds(600,11,46,14);
        room.setForeground(Color.white);
        room.setFont(new Font("Tahoma", Font.BOLD,14));
        panel.add(room);

        JLabel time = new JLabel("CI Time");
        time.setBounds(680,11,100,14);
        time.setForeground(Color.white);
        time.setFont(new Font("Tahoma", Font.BOLD,14));
        panel.add(time);

        JLabel deposit = new JLabel("Deposit");
        deposit.setBounds(800,11,100,25);
        deposit.setForeground(Color.white);
        deposit.setFont(new Font("Tahoma", Font.BOLD,14));
        panel.add(deposit);

        back = new JButton("back");
        back.setBounds(450,510,120,30);
        back.setForeground(Color.white);
        back.setBackground(Color.black);
        panel.add(back );
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);

            }
        });

        setUndecorated(true);
        setLocation(500,100);
        setLayout(null);
        setSize(900,600);
        setVisible(true);
    }



    public static void main(String[] args) {
        new CustomerInfo();
    }
}
