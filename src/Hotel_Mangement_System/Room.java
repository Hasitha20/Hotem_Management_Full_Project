package Hotel_Mangement_System;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Room extends JFrame  {

    JTable table;

    JButton back;
    Room(){

        JPanel panel = new JPanel();
        panel.setBounds(5,5,890,590);
        panel.setBackground(new Color(3, 45, 48));
        panel.setLayout(null);
        add(panel);

        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icon/room.png"));
        Image image = imageIcon.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
        ImageIcon imageIcon1 = new ImageIcon(image);
        JLabel label = new JLabel(imageIcon1);
        label.setBounds(600,200,200,200);
        panel.add(label);

        table = new JTable();
        table.setBounds(10,40,500,400);
        table.setBackground(new Color(3,45,48));
        table.setForeground(Color.white);
        panel.add(table);

        try{
            con c = new con();
            String RoomInfo = "select * from room";
            ResultSet resultSet = c.statement.executeQuery(RoomInfo);
            table.setModel(DbUtils.resultSetToTableModel(resultSet));
        }catch (Exception e) {
            e.printStackTrace();
        }

        back = new JButton("BACK");
        back.setBounds(200,500,120,30);
        back.setForeground(Color.white);
        back.setBackground(Color.black);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);

            }
        });
        panel.add(back);

        JLabel room = new JLabel("Room No:");
        room.setBounds(12,15,80,19);
        room.setForeground(Color.white);
        room.setFont(new Font("Tahoma", Font.BOLD,14));
        panel.add(room);

        JLabel availability = new JLabel("Availability");
        availability.setBounds(119,15,80,19);
        availability.setForeground(Color.white);
        availability.setFont(new Font("Tahoma", Font.BOLD,14));
        panel.add(availability);

        JLabel Clean = new JLabel("Clean Status");
        Clean.setBounds(216,15,150,19);
        Clean.setForeground(Color.white);
        Clean.setFont(new Font("Tahoma", Font.BOLD,14));
        panel.add(Clean);

        JLabel Price = new JLabel("Price");
        Price.setBounds(330,15,80,19);
        Price.setForeground(Color.white);
        Price.setFont(new Font("Tahoma", Font.BOLD,14));
        panel.add(Price);

        JLabel BType = new JLabel("Bed Type");
        BType.setBounds(417,15,80,19);
        BType.setForeground(Color.white);
        BType.setFont(new Font("Tahoma", Font.BOLD,14));
        panel.add(BType);

        setLocation(500,10);
        setLayout(null);
        setSize(900,600);
        setVisible(true);
    }


    public static void main(String[] args) {
        new Room();
    }
}
