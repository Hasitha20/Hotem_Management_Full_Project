package Hotel_Mangement_System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Reception extends JFrame {
    Reception(){
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(280,5,1230,820);
        panel.setBackground(new Color(3,45,48));
        add(panel);

        JPanel panel1 = new JPanel();
        panel1.setLayout(null);
        panel1.setBounds(5,5,270,820);
        panel1.setBackground(new Color(3,45,48));
        add(panel1);


        ImageIcon i111 = new ImageIcon(ClassLoader.getSystemResource("icon/cccc.gif"));
        Image i22 = i111.getImage().getScaledInstance(800,805,Image.SCALE_DEFAULT);
        ImageIcon imageIcon111 = new ImageIcon(i22);
        JLabel label11 = new JLabel(imageIcon111);
        label11.setBounds(300,20,800,800);
        panel.add(label11);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/login.gif"));
        Image i2 = i1.getImage().getScaledInstance(250,250,Image.SCALE_DEFAULT);
        ImageIcon imageIcon11 = new ImageIcon(i2);
        JLabel label1 = new JLabel(imageIcon11);
        label1.setBounds(5,530,250,250);
        panel1.add(label1);

        JButton btnNCF = new JButton("New CCustomer Found");
        btnNCF.setBounds(30,30,200,30);
        btnNCF.setBackground(Color.black);
        btnNCF.setForeground(Color.white);
        panel1.add(btnNCF);
        btnNCF.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {

                } catch (Exception E) {
                    E.printStackTrace();
                }
             }
        });

        JButton btnRoom = new JButton("Room");
        btnRoom.setBounds(30,70,200,30);
        btnRoom.setBackground(Color.black);
        btnRoom.setForeground(Color.white);
        panel1.add(btnRoom);
        btnRoom.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    new Room();
                } catch (Exception E) {
                    E.printStackTrace();
                }
            }
        });


        JButton btnDepartment = new JButton("Department");
        btnDepartment.setBounds(30,110,200,30);
        btnDepartment.setBackground(Color.black);
        btnDepartment.setForeground(Color.white);
        panel1.add(btnDepartment);
        btnDepartment.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    new Department();
                } catch (Exception E) {
                    E.printStackTrace();
                }
            }
        });


        JButton btnAEI = new JButton("All Employee Info");
        btnAEI.setBounds(30,150,200,30);
        btnAEI.setBackground(Color.black);
        btnAEI.setForeground(Color.white);
        panel1.add(btnAEI);
        btnAEI.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    new Employee();
                } catch (Exception E) {
                    E.printStackTrace();
                }
            }
        });

        JButton btnCI = new JButton("Customer Info");
        btnCI.setBounds(30,190,200,30);
        btnCI.setBackground(Color.black);
        btnCI.setForeground(Color.white);
        panel1.add(btnCI);
        btnCI.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    new CustomerInfo();
                } catch (Exception E) {
                    E.printStackTrace();
                }
            }
        });

        JButton btnMI = new JButton("Manager Info");
        btnMI.setBounds(30,230,200,30);
        btnMI.setBackground(Color.black);
        btnMI.setForeground(Color.white);
        panel1.add(btnMI);
        btnMI.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    new Manager();
                } catch (Exception E) {
                    E.printStackTrace();
                }
            }
        });


        JButton btnCO = new JButton("Check Out");
        btnCO.setBounds(30,270,200,30);
        btnCO.setBackground(Color.black);
        btnCO.setForeground(Color.white);
        panel1.add(btnCO);
        btnCO.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    new CheckOut();
                } catch (Exception E) {
                    E.printStackTrace();
                }
            }
        });

        JButton btnUCD = new JButton("Update Check -in Details");
        btnUCD.setBounds(30,310,200,30);
        btnUCD.setBackground(Color.black);
        btnUCD.setForeground(Color.white);
        panel1.add(btnUCD);
        btnUCD.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    new UpdateCheck();
                } catch (Exception E) {
                    E.printStackTrace();
                }
            }
        });

        JButton btnURS = new JButton("Update Room Status  ");
        btnURS.setBounds(30,350,200,30);
        btnURS.setBackground(Color.black);
        btnURS.setForeground(Color.white);
        panel1.add(btnURS);
        btnURS.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    new UpdateRoom();
                } catch (Exception E) {
                    E.printStackTrace();
                }
            }
        });

        JButton btnPIS = new JButton("Pick Up Service  ");
        btnPIS.setBounds(30,390,200,30);
        btnPIS.setBackground(Color.black);
        btnPIS.setForeground(Color.white);
        panel1.add(btnPIS);
        btnPIS.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    new pickUp();
                } catch (Exception E) {
                    E.printStackTrace();
                }
            }
        });

        JButton btnSR = new JButton("Search Room");
        btnSR.setBounds(30,430,200,30);
        btnSR.setBackground(Color.black);
        btnSR.setForeground(Color.white);
        panel1.add(btnSR);
        btnSR.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    new SerachRoom();
                } catch (Exception E) {
                    E.printStackTrace();
                }
            }
        });

        JButton logOut = new JButton("Logout");
        logOut.setBounds(30,470,95,30);
        logOut.setBackground(Color.black);
        logOut.setForeground(Color.white);
        panel1.add(logOut);
        logOut.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    System.exit(500);
                } catch (Exception E) {
                    E.printStackTrace();
                }
            }
        });

        JButton back = new JButton("Back");
        back.setBounds(140,470,95,30);
        back.setBackground(Color.black);
        back.setForeground(Color.white);
        panel1.add(back);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    setVisible(false);
                    new Dashboard();
                } catch (Exception E) {
                    E.printStackTrace();
                }
            }
        });

        getContentPane().setBackground(Color.white);
        setLayout(null);
        setSize(1950,1090);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Reception();
    }
}
