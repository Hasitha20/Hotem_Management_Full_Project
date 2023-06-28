package Hotel_Mangement_System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddEmployee extends JFrame implements ActionListener {
    JTextField nameText,ageText,salaryText,phoneText, aadCharText,emailText;
    JRadioButton radioButtonM, radioButtonF;
    JComboBox comboBox;
    JButton add,back;

    AddEmployee(){

        JPanel panel = new JPanel();
        panel.setBounds(5,5,890,490);
        panel.setBackground(new Color(3, 45, 48));
        panel.setLayout(null);
        add(panel);

        JLabel name = new JLabel("NAME");
        name.setBounds(60,30,150,27);
        name.setFont(new Font("serif", Font.BOLD, 22));
        name.setForeground(Color.white);
        panel.add(name);
        nameText = new JTextField();
        nameText.setBounds(200,30,150,27);
        nameText.setBackground(new Color(16, 108, 115));
        nameText.setFont(new Font("serif", Font.BOLD, 14));
        nameText.setForeground(Color.white);
        panel.add(nameText);

        JLabel age = new JLabel("AGE");
        age.setBounds(60,80,150,27);
        age.setFont(new Font("serif", Font.BOLD, 22));
        age.setForeground(Color.white);
        panel.add(age);
        ageText = new JTextField();
        ageText.setBounds(200,80,150,27);
        ageText.setBackground(new Color(16, 108, 115));
        ageText.setFont(new Font("serif", Font.BOLD, 14));
        ageText.setForeground(Color.white);
        panel.add(ageText);

        JLabel gender = new JLabel("GENDER");
        gender.setBounds(60,120,150,27);
        gender.setFont(new Font("serif", Font.BOLD, 22));
        gender.setForeground(Color.white);
        panel.add(gender);

        radioButtonM = new JRadioButton("MALE");
        radioButtonM.setBounds(200,120,70,27);
        radioButtonM.setForeground(Color.white);
        radioButtonM.setFont(new Font("Tahoma", Font.BOLD, 14));
        radioButtonM.setBackground(new Color(3,45,48));
        panel.add(radioButtonM);

        radioButtonF = new JRadioButton("FEMALE");
        radioButtonF.setBounds(280,120,100,27);
        radioButtonF.setForeground(Color.white);
        radioButtonF.setFont(new Font("Tahoma", Font.BOLD, 14));
        radioButtonF.setBackground(new Color(3,45,48));
        panel.add(radioButtonF);

        JLabel job = new JLabel("JOB");
        job.setBounds(60,170,150,27);
        job.setFont(new Font("serif", Font.BOLD, 22));
        job.setForeground(Color.white);
        panel.add(job);
        comboBox = new JComboBox(new String[]{"Front Desk", "HouseKeeping", "Kitchen Staff", "RoomService","Manager","Accountant","Chef"});
        comboBox.setBounds(200,170,150,30);
        comboBox.setBackground(new Color(16, 108, 115));
        comboBox.setFont(new Font("serif", Font.BOLD, 22));
        comboBox.setForeground(Color.white);
        panel.add(comboBox);

        JLabel salary = new JLabel("SALARY");
        salary.setBounds(60,220,150,27);
        salary.setFont(new Font("serif", Font.BOLD, 20));
        salary.setForeground(Color.white);
        panel.add(salary);
        salaryText = new JTextField();
        salaryText.setBounds(200,220,150,27);
        salaryText.setBackground(new Color(16, 108, 115));
        salaryText.setFont(new Font("serif", Font.BOLD, 14));
        salaryText.setForeground(Color.white);
        panel.add(salaryText);

        JLabel phone = new JLabel("PHONE");
        phone.setBounds(60,270,150,27);
        phone.setFont(new Font("serif", Font.BOLD, 20));
        phone.setForeground(Color.white);
        panel.add(phone);
        phoneText = new JTextField();
        phoneText.setBounds(200,270,150,27);
        phoneText.setBackground(new Color(16, 108, 115));
        phoneText.setFont(new Font("serif", Font.BOLD, 14));
        phoneText.setForeground(Color.white);
        panel.add(phoneText);


        JLabel addChr = new JLabel("AADHAR");
        addChr.setBounds(60,320,150,27);
        addChr.setFont(new Font("serif", Font.BOLD, 20));
        addChr.setForeground(Color.white);
        panel.add(addChr);
        aadCharText = new JTextField();
        aadCharText.setBounds(200,320,150,27);
        aadCharText.setBackground(new Color(16, 108, 115));
        aadCharText.setFont(new Font("serif", Font.BOLD, 14));
        aadCharText.setForeground(Color.white);
        panel.add(aadCharText);

        JLabel email = new JLabel("EMAIL");
        email.setBounds(60,370,150,27);
        email.setFont(new Font("serif", Font.BOLD, 20));
        email.setForeground(Color.white);
        panel.add(email);
        emailText = new JTextField();
        emailText.setBounds(200,370,150,27);
        emailText.setBackground(new Color(16, 108, 115));
        emailText.setFont(new Font("serif", Font.BOLD, 14));
        emailText.setForeground(Color.white);
        panel.add(emailText);

        JLabel AED = new JLabel("ADD EMPLOYEE DETAILS");
        AED.setBounds(450,24,445,35);
        AED.setFont(new Font("Tahoma", Font.BOLD, 31));
        AED.setForeground(Color.white);
        panel.add(AED);

        add = new JButton("ADD");
        add.setBounds(80,420,100,30);
        add.setForeground(Color.white);
        add.setBackground(Color.black);
        add.addActionListener(this);
        panel.add(add);

        back = new JButton("BACK");
        back.setBounds(200,420,100,30);
        back.setForeground(Color.white);
        back.setBackground(Color.black);
        back.addActionListener(this);
        panel.add(back);

        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icon/addemp.png"));
        Image image = imageIcon.getImage().getScaledInstance(300,300,Image.SCALE_DEFAULT);
        ImageIcon imageIcon1 = new ImageIcon(image);
        JLabel label = new JLabel(imageIcon1);
        label.setBounds(500,100,300,300);
        panel.add(label);

        setUndecorated(true);
        setLocation(60,160);
        setLayout(null);
        setSize(900,500);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == add){
            String name = nameText.getText();
            String age = ageText.getText();
            String salary = salaryText.getText();
            String phone = phoneText.getText();
            String email = emailText.getText();
            String aadChr = aadCharText.getText();
            String job = (String) comboBox.getSelectedItem();
            String gender = null;
            if(radioButtonM.isSelected()){
                gender = "Male";
            }else if (radioButtonF.isSelected()){
                gender ="Female";
         }
//            else {
//                JOptionPane.showMessageDialog(null, "ERROR PLEASE SELECT GENDER");
//                setVisible(false);
//            }

            try{
                con c = new con();
                String q = "insert into employee values('"+name+"', '"+age+"', '"+gender+"','"+job+"','"+salary+"', '"+phone+"', '"+email+"', '"+aadChr+"')";
                c.statement.executeUpdate(q);

                JOptionPane.showMessageDialog(null, "Employee Successfully Added");
                setVisible(false);

            }catch (Exception E){
                E.printStackTrace();
            }

        }else {
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new AddEmployee();
    }
}
