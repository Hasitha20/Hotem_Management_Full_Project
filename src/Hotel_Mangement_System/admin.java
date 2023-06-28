package Hotel_Mangement_System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class admin extends JFrame implements ActionListener {

    JButton add_Employee, add_Room, add_Drivers, Logout, Back;
    admin(){

        add_Employee = new JButton("ADD Employee");
        add_Employee.setBounds(250,230,280,30);
        add_Employee.setBackground(Color.white);
        add_Employee.setForeground(Color.black);
        add_Employee.setFont(new Font("Tahoma", Font.BOLD, 15));
        add_Employee.addActionListener(this);
        add(add_Employee);

        add_Room = new JButton("ADD Room");
        add_Room.setBounds(250,380,280,30);
        add_Room.setBackground(Color.white);
        add_Room.setForeground(Color.black);
        add_Room.setFont(new Font("Tahoma", Font.BOLD, 15));
        add_Room.addActionListener(this);
        add(add_Room);

        add_Drivers = new JButton("ADD Drivers");
        add_Drivers.setBounds(250,530,280,30);
        add_Drivers.setBackground(Color.white);
        add_Drivers.setForeground(Color.black);
        add_Drivers.setFont(new Font("Tahoma", Font.BOLD, 15));
        add_Drivers.addActionListener(this);
        add(add_Drivers);

        Logout = new JButton("Logout");
        Logout.setBounds(30,750,95,30);
        Logout.setBackground(Color.black);
        Logout.setForeground(Color.white);
        Logout.setFont(new Font("Tahoma", Font.BOLD, 15));
        Logout.addActionListener(this);
        add(Logout);

        Back = new JButton("Back");
        Back.setBounds(130,750,95,30);
        Back.setBackground(Color.black);
        Back.setForeground(Color.white);
        Back.setFont(new Font("Tahoma", Font.BOLD, 15));
        Back.addActionListener(this);
        add(Back);

        ImageIcon l1 = new ImageIcon(ClassLoader.getSystemResource("icon/employees.png"));
        Image l11 = l1.getImage().getScaledInstance(120,120,Image.SCALE_DEFAULT);
        ImageIcon imageIcon = new ImageIcon(l11);
        JLabel label = new JLabel(imageIcon);
        label.setBounds(70,180,120,120);
        add(label);

        ImageIcon imageIcon1 = new ImageIcon(ClassLoader.getSystemResource("icon/room.png"));
        Image image = imageIcon1.getImage().getScaledInstance(120,120,Image.SCALE_DEFAULT);
        ImageIcon imageIcon11 = new ImageIcon(image);
        JLabel label1 = new JLabel(imageIcon11);
        label1.setBounds(70,340,120,120);
        add(label1);

        ImageIcon imageIcon2 = new ImageIcon(ClassLoader.getSystemResource("icon/driver.png"));
        Image image1 = imageIcon2.getImage().getScaledInstance(120,120,Image.SCALE_DEFAULT);
        ImageIcon imageIcon12 = new ImageIcon(image1);
        JLabel label2 = new JLabel(imageIcon12);
        label2.setBounds(70,500,120,120);
        add(label2);

        ImageIcon imageIcon3 = new ImageIcon(ClassLoader.getSystemResource("icon/login.gif"));
        Image image2 = imageIcon3.getImage().getScaledInstance(400,400,Image.SCALE_DEFAULT);
        ImageIcon imageIcon123 = new ImageIcon(image2);
        JLabel label3 = new JLabel(imageIcon123);
        label3.setBounds(1000,250,400,400);
        add(label3);

        getContentPane().setBackground(new Color(3,45,48));
        setLayout(null);
        setSize(1950, 1090);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == add_Employee){
            new AddEmployee();
        }else if (e.getSource()== add_Room){
            new AddRoom();
        } else if (e.getSource() == add_Drivers) {
            new AddDriver();
        }else if (e.getSource()== Logout){
            System.exit(102);
        }else if (e.getSource()== Back) {
            new Dashboard();
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new admin();
    }
}
