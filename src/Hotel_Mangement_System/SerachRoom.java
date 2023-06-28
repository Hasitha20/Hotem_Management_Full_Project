package Hotel_Mangement_System;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class SerachRoom extends JFrame implements ActionListener {
    JCheckBox checkBox;
    JTable table;
    Choice choice;

    JButton search, back,add;
    SerachRoom(){

        JPanel panel = new JPanel();
        panel.setBounds(5,5,690,570);
        panel.setBackground(new Color(3, 45, 48));
        panel.setLayout(null);
        add(panel);

        JLabel searchForRoom = new JLabel("Search For Room");
        searchForRoom.setBounds(250,11,186,31);
        searchForRoom.setForeground(Color.white);
        searchForRoom.setFont(new Font("Tahoma", Font.BOLD,20));
        panel.add(searchForRoom);

        JLabel rbt = new JLabel("Room Bed Type");
        rbt.setBounds(50,73,120,20);
        rbt.setForeground(Color.white);
        rbt.setFont(new Font("Tahoma", Font.BOLD,14));
        panel.add(rbt);

        JLabel rn = new JLabel("Room Number");
        rbt.setBounds(50,162,150,20);
        rbt.setForeground(Color.white);
        rbt.setFont(new Font("Tahoma", Font.BOLD,14));
        panel.add(rbt);

        JLabel available = new JLabel("Availablity");
        available.setBounds(175,162,150,20);
        available.setForeground(Color.white);
        available.setFont(new Font("Tahoma", Font.BOLD,14));
        panel.add(available);

        JLabel price = new JLabel("Price");
        price.setBounds(458,162,150,20);
        price.setForeground(Color.white);
        price.setFont(new Font("Tahoma", Font.BOLD,14));
        panel.add(price);

        JLabel BT = new JLabel("Bed Type");
        BT.setBounds(580,162,150,20);
        BT.setForeground(Color.white);
        BT.setFont(new Font("Tahoma", Font.BOLD,14));
        panel.add(BT);

        JLabel ss = new JLabel("Clean Status");
        ss.setBounds(306,162,150,20);
        ss.setForeground(Color.white);
        ss.setFont(new Font("Tahoma", Font.BOLD,14));
        panel.add(ss);

        checkBox = new JCheckBox("Only Display Available");
        checkBox.setBounds(400,69,205,23);
        checkBox.setForeground(Color.white);
        checkBox.setFont(new Font("Tahoma", Font.BOLD,14));
        checkBox.setBackground(new Color(3, 45, 48));
        panel.add(checkBox);
        
        choice = new Choice();
        choice.add("Single Bed");
        choice.add("Double Bed");
        choice.setBounds(170,70,120,20);
        panel.add(choice);

        table = new JTable();
        table.setBounds(20,187,700,150);
        table.setForeground(Color.white);
        table.setFont(new Font("Tahoma", Font.PLAIN,14));
        table.setBackground(new Color(3, 45, 48));
        panel.add(table);

        try{
            con c = new con();
            String q = "Select * from room";
            ResultSet resultSet = c.statement.executeQuery(q);
            table.setModel(DbUtils.resultSetToTableModel(resultSet));

        }catch (Exception e) {
            e.printStackTrace();
        }

        add = new JButton("Search");
        add.setBounds(60,400,120,30);
        add.setForeground(Color.white);
        add.setBackground(Color.black);
        add.addActionListener(this);
        panel.add(add);

        back = new JButton("back");
        back.setBounds(380,400,120,30);
        back.setForeground(Color.white);
        back.setBackground(Color.black);
        back.addActionListener(this);
        panel.add(back );

        setUndecorated(true);
        setLocation(500,200);
        setLayout(null);
        setSize(700,580);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== add){
            String Q = "Select * from Room where bed_type = '"+choice.getSelectedItem()+"'";
            String Q1 = "Select * from Room where availability = 'Avialable' and bed_type = '"+choice.getSelectedItem()+"'";

            try {
                con c = new con();
                ResultSet resultSet = c.statement.executeQuery(Q);
                table.setModel(DbUtils.resultSetToTableModel(resultSet));

                if(checkBox.isSelected()){
                    ResultSet resultSet1 = c.statement.executeQuery(Q1);
                    table.setModel(DbUtils.resultSetToTableModel(resultSet1));

                }
            }catch (Exception E){
                E.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        new SerachRoom();
    }
}
