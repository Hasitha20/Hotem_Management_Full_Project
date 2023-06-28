package Hotel_Mangement_System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

public class CheckOut extends JFrame {
    CheckOut(){

        JPanel panel = new JPanel();
        panel.setBounds(5,5,790,390);
        panel.setBackground(new Color(3, 45, 48));
        panel.setLayout(null);
        add(panel);

        JLabel label = new JLabel("CHECK-OUT");
        label.setBounds(100,20,150,30);
        label.setForeground(Color.white);
        label.setFont(new Font("Tahoma", Font.PLAIN,20));
        panel.add(label);

        JLabel UserId = new JLabel("Customer Id");
        UserId.setBounds(30,80,150,30);
        UserId.setForeground(Color.white);
        UserId.setFont(new Font("Tahoma", Font.BOLD,14));
        panel.add(UserId);

        Choice Customer  = new Choice();
        Customer.setBounds(200,80,150,25);
        panel.add(Customer);

        JLabel roomNum = new JLabel("Room Number");
        roomNum.setBounds(30,130,150,30);
        roomNum.setForeground(Color.white);
        roomNum.setFont(new Font("Tahoma", Font.BOLD,14));
        panel.add(roomNum);

        JLabel labelRoomnumber = new JLabel();
        labelRoomnumber.setBounds(200,130,150,30);
        labelRoomnumber.setForeground(Color.white);
        labelRoomnumber.setFont(new Font("Tahoma", Font.BOLD,14));
        panel.add(labelRoomnumber);

        JLabel checkingtime = new JLabel("Checking Time");
        checkingtime.setBounds(30,180,150,30);
        checkingtime.setForeground(Color.white);
        checkingtime.setFont(new Font("Tahoma", Font.BOLD,14));
        panel.add(checkingtime);

        JLabel labelcheckingtime = new JLabel();
        labelcheckingtime.setBounds(200,180,150,30);
        labelcheckingtime.setForeground(Color.white);
        labelcheckingtime.setFont(new Font("Tahoma", Font.BOLD,14));
        panel.add(labelcheckingtime);

        JLabel checkouttime = new JLabel("Check-out Time");
        checkouttime.setBounds(30,230,150,30);
        checkouttime.setForeground(Color.white);
        checkouttime.setFont(new Font("Tahoma", Font.BOLD,14));
        panel.add(checkouttime);

        Date date = new Date();


        JLabel labelcheckouttime = new JLabel(""+date);
        labelcheckouttime.setBounds(200,230,250,30);
        labelcheckouttime.setForeground(Color.white);
        labelcheckouttime.setFont(new Font("Tahoma", Font.BOLD,14));
        panel.add(labelcheckouttime);


        try{
            con c = new con();
            ResultSet resultSet = c.statement.executeQuery("select * from customer");
            while (resultSet.next()){
                Customer.add(resultSet.getString("number"));
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        JButton add = new JButton("Check");
        add.setBounds(300,300,120,30);
        add.setBackground(Color.black);
        add.setForeground(Color.white);
        panel.add(add);
        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                con c = new con();

                try {
                    ResultSet resultSet = c.statement.executeQuery("select * from customer where number  = '"+Customer.getSelectedItem()+"'");
                    while (resultSet.next()){
                        labelRoomnumber.setText(resultSet.getString("room"));
                        labelcheckingtime.setText(resultSet.getString("checkingtime"));
                    }
                }catch (Exception E){
                    E.printStackTrace();
                }
            }
        });

        JButton checkout = new JButton("Check-Out");
        checkout.setBounds(30,300,120,30);
        checkout.setBackground(Color.black);
        checkout.setForeground(Color.white);
        panel.add(checkout);
        checkout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    con cv = new con();
                    cv.statement.executeUpdate("delete from customer where number = '"+Customer.getSelectedItem()+"'");
                    cv.statement.executeUpdate("Update room set availability = 'Available' where roomnumber  = '"+labelRoomnumber+"'");
                    JOptionPane.showMessageDialog(null, "Done");
                    setVisible(false);
                } catch (Exception E) {
                    E.printStackTrace();
                }
            }
        });

        JButton back = new JButton("Back");
        back.setBounds(170,300,120,30);
        back.setBackground(Color.black);
        back.setForeground(Color.white);
        panel.add(back);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });

        setUndecorated(true);
        setLocation(500,210);
        setLayout(null);
        setSize(800,400);
        setVisible(true);
    }
    public static void main(String[] args) {
        new CheckOut();
    }
}
