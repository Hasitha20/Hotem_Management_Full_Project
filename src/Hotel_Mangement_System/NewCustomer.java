package Hotel_Mangement_System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

public class NewCustomer extends JFrame implements ActionListener {

    JComboBox comboBox;
    JTextField textFieldNumber,textFieldName,textCountry,textDeposite;

    Choice c1;

    JRadioButton r1,r2;

    JLabel date;

    JButton add,back;
    NewCustomer(){

        JPanel panel = new JPanel();
        panel.setBounds(5,5,840,540);
        panel.setBackground(new Color(3, 45, 48));
        panel.setLayout(null);
        add(panel);

        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icon/customer.png"));
        Image image = imageIcon.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
        ImageIcon imageIcon1 = new ImageIcon(image);
        JLabel label1 = new JLabel(imageIcon1);
        label1.setBounds(550,150,200,200);
        panel.add(label1);

        JLabel name = new JLabel("NEW CUSTOMER FORM:");
        name.setBounds(118,11,260,53);
        name.setForeground(Color.white);
        name.setFont(new Font("Tahoma", Font.BOLD,20));
        panel.add(name);

        JLabel labelID = new JLabel("ID");
        labelID.setBounds(35,76,200,14);
        labelID.setForeground(Color.white);
        labelID.setFont(new Font("Tahoma", Font.PLAIN,14));
        panel.add(labelID);

        comboBox = new JComboBox(new String[] {"Passport", "Aadhar Card", "Voter Id", "Driving License"});
        comboBox.setBounds(271,73,150,20);
        comboBox.setBackground(new Color(3, 45, 48));
        comboBox.setForeground(Color.white);
        comboBox.setFont(new Font("Tahoma", Font.PLAIN,14));
        panel.add(comboBox);

        JLabel labelNumber = new JLabel("Number :");
        labelNumber.setBounds(35,111,200,14);
        labelNumber.setForeground(Color.white);
        labelNumber.setFont(new Font("Tahoma", Font.PLAIN,14));
        panel.add(labelNumber);
        textFieldNumber = new JTextField();
        textFieldNumber.setBounds(271,111,150,20);
        panel.add(textFieldNumber);

        JLabel labelName = new JLabel("Name :");
        labelName.setBounds(35,151,200,14);
        labelName.setForeground(Color.white);
        labelName.setFont(new Font("Tahoma", Font.PLAIN,14));
        panel.add(labelName);
        textFieldName = new JTextField();
        textFieldName.setBounds(271,151,150,20);
        panel.add(textFieldName);

        JLabel gender = new JLabel("Gender :");
        gender.setBounds(35,191,200,14);
        gender.setForeground(Color.white);
        gender.setFont(new Font("Tahoma", Font.PLAIN,14));
        panel.add(gender);

        r1= new JRadioButton("Male");
        r1.setFont(new Font("Tahoma", Font.BOLD,14));
        r1.setForeground(Color.white);
        r1.setBackground(new Color(3, 45, 48));
        r1.setBounds(271,191,80,14);
        panel.add(r1);

        r2= new JRadioButton("FeMale");
        r2.setFont(new Font("Tahoma", Font.BOLD,14));
        r2.setForeground(Color.white);
        r2.setBackground(new Color(3, 45, 48));
        r2.setBounds(350,191,200,14);
        panel.add(r2);

        JLabel labelCountry = new JLabel("Country :");
        labelCountry.setBounds(35,231,200,14);
        labelCountry.setForeground(Color.white);
        labelCountry.setFont(new Font("Tahoma", Font.PLAIN,14));
        panel.add(labelCountry);
        textCountry = new JTextField();
        textCountry.setBounds(271,231,150,20);
        panel.add(textCountry);

        JLabel labelRoom = new JLabel("Allocated Room Number :");
        labelRoom.setBounds(35,274,200,14);
        labelRoom.setForeground(Color.white);
        labelRoom.setFont(new Font("Tahoma", Font.PLAIN,14));
        panel.add(labelRoom);

        c1 = new Choice();
        try {
            con c = new con();
            ResultSet resultSet = c.statement.executeQuery("select * from room");
            while (resultSet.next()){
                c1.add(resultSet.getString("roomnumber"));
            }

        }catch(Exception e) {
            e.printStackTrace();
        }
        c1.setBounds(271,274,150,20);
        c1.setFont(new Font("Tahoma", Font.BOLD,14));
        c1.setForeground(Color.white);
        c1.setBackground(new Color(3, 45, 48));
        panel.add(c1);

        JLabel lableCIS = new JLabel("Checked In :");
        lableCIS.setBounds(35,316,200,14);
        lableCIS.setForeground(Color.white);
        lableCIS.setFont(new Font("Tahoma", Font.PLAIN,14));
        panel.add(lableCIS);

        Date date1 = new Date();

        date = new JLabel(""+date1+"");
        date.setBounds(271,316,200,14);
        date.setForeground(Color.white);
        date.setFont(new Font("Tahoma", Font.PLAIN,14));
        panel.add(date);

        JLabel labelDeposite = new JLabel("Deposite :");
        labelDeposite.setBounds(35,359,200,14);
        labelDeposite.setForeground(Color.white);
        labelDeposite.setFont(new Font("Tahoma", Font.PLAIN,14));
        panel.add(labelDeposite);
        textDeposite = new JTextField();
        textDeposite.setBounds(271,359,150,20);
        panel.add(textDeposite);

        add = new JButton("ADD");
        add.setBounds(100,430,120,30);
        add.setForeground(Color.white);
        add.setBackground(Color.black);
        add.addActionListener(this);
        panel.add(add);

        back = new JButton("BACK");
        back.setBounds(260,430,121,30);
        back.setForeground(Color.white);
        back.setBackground(Color.black);
        back.addActionListener(this);
        panel.add(back);

        setLocation(500,150);
        setLayout(null);
        setSize(850,550);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == add){
            String radioBTn = null;
            if(r1.isSelected()){
                radioBTn = "Male";
            }else if (r2.isSelected()){
                radioBTn = "Female";
            }

            String s1 = (String) comboBox.getSelectedItem();
            String s2 = textFieldNumber.getText();
            String s3 = textFieldName.getText();
            String s4 = radioBTn;
            String s5 = textCountry.getText();
            String s6 = c1.getSelectedItem();
            String s7 = date.getText();
            String s8 = textDeposite.getText();

            try  {
                con c =new con();
                String q = "insert into customer values('"+s1+"','"+s2+"','"+s3+"','"+s4+"','"+s5+"','"+s6+"','"+s7+"','"+s8+"')";
                String q1 = "update room set availability = 'Occupied' where roomnumber = "+s6;
                c.statement.executeUpdate(q);
                c.statement.executeUpdate(q1);

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
        new NewCustomer();
    }
}
