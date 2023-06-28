package Hotel_Mangement_System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddDriver extends JFrame implements ActionListener {

    JTextField driverText,driverageText,carCText,carNText,locText;
    JComboBox comboBox,comboBox1;
    JButton add,back;
    AddDriver(){

        JPanel panel = new JPanel();
        panel.setBounds(5,5,890,490);
        panel.setBackground(new Color(3, 45, 48));
        panel.setLayout(null);
        add(panel);

        JLabel label = new JLabel("ADD DRIVERS");
        label.setBounds(194,10,200,22);
        label.setFont(new Font("Tahoma", Font.BOLD, 22));
        label.setForeground(Color.white);
        panel.add(label);

        JLabel name = new JLabel("NAME");
        name.setBounds(64,70,102,22);
        name.setFont(new Font("Tahoma", Font.BOLD, 14));
        name.setForeground(Color.white);
        panel.add(name);
        driverText = new JTextField();
        driverText.setBounds(174,70,156,22);
        driverText.setBackground(new Color(16, 108, 115));
        driverText.setFont(new Font("serif", Font.BOLD, 14));
        driverText.setForeground(Color.white);
        panel.add(driverText);

        JLabel age = new JLabel("AGE");
        age.setBounds(64,110,102,22);
        age.setFont(new Font("Tahoma", Font.BOLD, 14));
        age.setForeground(Color.white);
        panel.add(age);
        driverageText = new JTextField();
        driverageText.setBounds(174,110,156,22);
        driverageText.setBackground(new Color(16, 108, 115));
        driverageText.setFont(new Font("serif", Font.BOLD, 14));
        driverageText.setForeground(Color.white);
        panel.add(driverageText);

        JLabel gender = new JLabel("GENDER");
        gender.setBounds(64,150,102,22);
        gender.setFont(new Font("Tahoma", Font.BOLD, 14));
        gender.setForeground(Color.white);
        panel.add(gender);

        comboBox = new JComboBox(new String[]{"Male", "Female"});
        comboBox.setBounds(176,150,154,20);
        comboBox.setBackground(new Color(16, 108, 115));
        comboBox.setForeground(Color.white);
        comboBox.setFont(new Font("serif", Font.BOLD, 14));
        panel.add(comboBox);

        JLabel carC = new JLabel("CAR COMPANY");
        carC.setBounds(64,190,110,22);
        carC.setFont(new Font("Tahoma", Font.BOLD, 14));
        carC.setForeground(Color.white);
        panel.add(carC);
        carCText = new JTextField();
        carCText.setBounds(174,190,156,22);
        carCText.setBackground(new Color(16, 108, 115));
        carCText.setFont(new Font("serif", Font.BOLD, 14));
        carCText.setForeground(Color.white);
        panel.add(carCText);

        JLabel carN = new JLabel("CAR NAME");
        carN.setBounds(64,230,102,22);
        carN.setFont(new Font("Tahoma", Font.BOLD, 14));
        carN.setForeground(Color.white);
        panel.add(carN);
        carNText = new JTextField();
        carNText.setBounds(174,230,156,22);
        carNText.setBackground(new Color(16, 108, 115));
        carNText.setFont(new Font("serif", Font.BOLD, 14));
        carNText.setForeground(Color.white);
        panel.add(carNText);

        JLabel avialble = new JLabel("AVAILABLE");
        avialble.setBounds(64,270,102,22);
        avialble.setFont(new Font("Tahoma", Font.BOLD, 14));
        avialble.setForeground(Color.white);
        panel.add(avialble);

        comboBox1 = new JComboBox(new String[]{"Available", "Not Available"});
        comboBox1.setBounds(176,270,154,20);
        comboBox1.setBackground(new Color(16, 108, 115));
        comboBox1.setForeground(Color.white);
        comboBox1.setFont(new Font("serif", Font.BOLD, 14));
        panel.add(comboBox1);

        JLabel loc = new JLabel("Location");
        loc.setBounds(64,310,102,22);
        loc.setFont(new Font("Tahoma", Font.BOLD, 14));
        loc.setForeground(Color.white);
        panel.add(loc);
        locText = new JTextField();
        locText.setBounds(174,310,156,22);
        locText.setBackground(new Color(16, 108, 115));
        locText.setFont(new Font("serif", Font.BOLD, 14));
        locText.setForeground(Color.white);
        panel.add(locText);

        add = new JButton("ADD");
        add.setBounds(64,380,111,33);
        add.setForeground(Color.white);
        add.setBackground(Color.black);
        add.addActionListener(this);
        panel.add(add);

        back = new JButton("BACK");
        back.setBounds(198,380,111,30);
        back.setForeground(Color.white);
        back.setBackground(Color.black);
        back.addActionListener(this);
        panel.add(back);

        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icon/license.png"));
        Image image = imageIcon.getImage().getScaledInstance(300,300,Image.SCALE_DEFAULT);
        ImageIcon imageIcon1 = new ImageIcon(image);
        JLabel label1 = new JLabel(imageIcon1);
        label1.setBounds(500,100,300,300);
        panel.add(label1);

        setUndecorated(true);
        setLocation(20,200);
        setLayout(null);
        setSize(900,500);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == add){
            String name = driverText.getText();
            String age = driverageText.getText();
            String gender = (String) comboBox.getSelectedItem();
            String company = carCText.getText();
            String carname = carNText.getText();
            String available = (String) comboBox1.getSelectedItem();
            String location = locText.getText();

            try  {
                con c =new con();
                String q = "insert into driver values('"+name+"','"+age+"','"+gender+"','"+company+"','"+carname+"','"+available+"','"+location+"')";
                c.statement.executeUpdate(q);

                JOptionPane.showMessageDialog(null, "Driver Successfully Added");
                setVisible(false);

            } catch (Exception E){
                E.printStackTrace();
            }
        } else {
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new AddDriver();
    }
}
