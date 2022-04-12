package com.project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

class MainForm
        extends JFrame
        implements ActionListener {
    //Components of the form.

    private final JTextField first_name;
    private final JTextField middle_name;
    private final JTextField last_name;
    private final JComboBox genderComboBox;
    private final JTextField date1;
//    private final JComboBox date;
//    private final JComboBox month;
//    private final JComboBox year;
    private final JTextField taadhar;
    private final JTextArea tadd;
    private final JCheckBox term;
    private final JButton sub;
    private final JButton reset;
    private final JTextArea tout;
    private final JLabel res;
    private final JTextArea resadd;
    private final JTextField email;
    private final JTextField mno;
    private final JComboBox takenornot;

    private String dates[]
            = { "1", "2", "3", "4", "5",
            "6", "7", "8", "9", "10",
            "11", "12", "13", "14", "15",
            "16", "17", "18", "19", "20",
            "21", "22", "23", "24", "25",
            "26", "27", "28", "29", "30",
            "31" };
    private String months[]
            = { "Jan", "Feb", "Mar", "Apr",
            "May", "Jun", "July", "Aug",
            "Sep", "Oct", "Nov", "Dec" };
    private String years[]
            = { "1995", "1996", "1997", "1998",
            "1999", "2000", "2001", "2002",
            "2003", "2004", "2005", "2006",
            "2007", "2008", "2009", "2010",
            "2011", "2012", "2013", "2014",
            "2015", "2016", "2017", "2018",
            "2019","2020","2021","2022"};

    public MainForm() {
        final Container c;
        final JLabel subheading;
        final JLabel title;
        final JLabel pehlanaam;
        JLabel baapkanaam;
        final JLabel aakhrinaam;
        final JLabel gender;
        this.setTitle("COVID-19 Vaccination Form");
        this.setBounds(150, 5, 900, 680);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);

        c = getContentPane();
        c.setLayout(null);
        title = new JLabel("Registration Form");
        title.setFont(new Font("Times New Roman", Font.BOLD, 25));
        title.setSize(300, 30);
        title.setLocation(370, 17);
        c.add(title);

//        ImageIcon image = new ImageIcon("index.png"); //create an image icon
//        c.add(setIconImage());

        subheading = new JLabel("Please enter the patient's details");
        subheading.setFont(new Font("Times New Roman", Font.BOLD,15));
        subheading.setSize(250,28);
        subheading.setLocation(20,22);
        subheading.setFocusable(false);
        c.add(subheading);

        pehlanaam = new JLabel("First Name:");
        pehlanaam.setFont(new Font("Times New Roman",Font.PLAIN,15));
        pehlanaam.setSize(110,20);
        pehlanaam.setLocation(40,70);
        c.add(pehlanaam);

        baapkanaam = baapkanaam = new JLabel("Middle Name: ");
        baapkanaam.setFont(new Font("Times New Roman",Font.PLAIN,15));
        baapkanaam.setSize(110,20);
        baapkanaam.setLocation(38,110);
        c.add(baapkanaam);

        aakhrinaam = new JLabel("Last Name: ");
        aakhrinaam.setFont(new Font("Times New Roman",Font.PLAIN,15));
        aakhrinaam.setSize(100,20);
        aakhrinaam.setLocation(38,150);
        c.add(aakhrinaam);

        gender = new JLabel("Gender");
        gender.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        gender.setSize(120, 20);
        gender.setLocation(38, 192);
        c.add(gender);

        first_name = new JTextField();
        first_name.setFont(new Font("Times New Roman",Font.PLAIN,15));
        first_name.setSize(135,28);
        first_name.setLocation(180, 72);
        c.add(first_name);

        middle_name = new JTextField();
        middle_name.setFont((new Font("Times New Roman", Font.PLAIN,15)));
        middle_name.setSize(135,28);
        middle_name.setLocation(180,110);
        c.add(middle_name);

        last_name = new JTextField();
        last_name.setFont((new Font("Times New Roman", Font.PLAIN,15)));
        last_name.setSize(135,28);
        last_name.setLocation(180,152);
        c.add(last_name);

        String[] sgender ={"Male","Female"};
       genderComboBox = new JComboBox(sgender);
        genderComboBox.setLocation(180, 192);
        genderComboBox.setSize(75, 20);
        c.add(genderComboBox);

        final JLabel dob;
        dob = new JLabel("Date of Birth");
        dob.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        dob.setSize(120, 20);
        dob.setLocation(38, 235);
        c.add(dob);

        date1 = new JTextField();
        date1.setFont((new Font("Times New Roman",Font.PLAIN,15)));
        date1.setSize(120,28);
        date1.setLocation(220,235);
        c.add(date1);

        final JLabel date_condn;
        date_condn = new JLabel("*The Date format is DD/MM/YYYY");
        date_condn.setFont(new Font("Times New Roman",Font.PLAIN,12));
        date_condn.setSize(190,28);
        date_condn.setLocation(17,245);
        c.add(date_condn);


//        date = new JComboBox(dates);
//        date.setFont(new Font("Times New Roman", Font.PLAIN, 15));
//        date.setSize(50, 20);
//        date.setLocation(170, 235);
//        c.add(date);
//
//        month = new JComboBox(months);
//        month.setFont(new Font("Times New Roman", Font.PLAIN, 15));
//        month.setSize(60, 20);
//        month.setLocation(220, 235);
//        c.add(month);
//
//        year = new JComboBox(years);
//        year.setFont(new Font("Times New Roman", Font.PLAIN, 15));
//        year.setSize(60, 20);
//        year.setLocation(280, 235);
//        c.add(year);

        final JLabel aadhar;
        aadhar = new JLabel("Aadhar Card number:");
        aadhar.setFont(new Font("Times New Roman",Font.PLAIN,15));
        aadhar.setSize(180,20);
        aadhar.setLocation(34,280);
        c.add(aadhar);

        taadhar = new JTextField();
        taadhar.setFont(new Font("Times New Roman",Font.PLAIN, 15));
        taadhar.setSize(170,28);
        taadhar.setLocation(200,280);
        c.add(taadhar);

        final JLabel add;
        add = new JLabel("Address:");
        add.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        add.setSize(100, 20);
        add.setLocation(36, 328);
        c.add(add);

        tadd = new JTextArea();
        tadd.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        tadd.setSize(200, 78);
        tadd.setLocation(170, 328);
        tadd.setLineWrap(true);
        c.add(tadd);

        final JLabel hamale;
        hamale = new JLabel("Email Address");
        hamale.setFont(new Font("Times New Roman",Font.PLAIN,15));
        hamale.setSize(100,20);
        hamale.setLocation(36,420);
        c.add(hamale);

        email = new JTextField();
        email.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        email.setSize(200, 28);
        email.setLocation(170,420);
        tadd.setLineWrap(true);
        c.add(email);

        final JLabel durdvani;
        durdvani = new JLabel("Mobile Number:");
        durdvani.setFont((new Font("Times New Roman",Font.PLAIN, 15)));
        durdvani.setSize(140,20);
        durdvani.setLocation(36,450);
        c.add(durdvani);

        mno = new JTextField();
        mno.setFont((new Font("Times New Roman", Font.PLAIN, 15)));
        mno.setSize(200,28);
        mno.setLocation(170, 450);
        c.add(mno);

        final JLabel vaccine;
        vaccine = new JLabel("Which dose of vaccine you are applying for?");
        vaccine.setFont(new Font("Times New Roman",Font.PLAIN,15));
        vaccine.setLocation(45,495);
        vaccine.setSize(300,22);
        c.add(vaccine);

       String[] doseno = {"First Dose", "Second Dose" };
        takenornot = new JComboBox(doseno);
        takenornot.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        takenornot.setFocusable(false);
        takenornot.setSize(120, 20);
        takenornot.setLocation(75, 525);
        c.add(takenornot);

        term = new JCheckBox("Accept Terms And Conditions.");
        term.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        term.setSize(250, 20);
        term.setLocation(150, 580);
        term.setFocusable(false);
        c.add(term);

        sub = new JButton("Submit");
        sub.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        sub.setSize(100, 26);
        sub.setLocation(150, 600);
        sub.setForeground(Color.white);
        sub.setBackground(new Color(123,50,250));
        sub.setFocusable(false);
        sub.setBorder(BorderFactory.createEtchedBorder());
        sub.addActionListener(this);
        c.add(sub);

        reset = new JButton("Reset");
        reset.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        reset.setSize(100, 26);
        reset.setLocation(270, 600);
        reset.setFocusable(false);
        reset.setForeground(Color.white);
        reset.setBackground(new Color(123,50,250));
        reset.setBorder(BorderFactory.createEtchedBorder());
        reset.addActionListener(this);
        c.add(reset);

        tout = new JTextArea();
        tout.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        tout.setSize(300, 400);
        tout.setLocation(500, 100);
        tout.setLineWrap(true);
        tout.setEditable(false);
        c.add(tout);

        res = new JLabel("");
        res.setFont(new Font("Times New Roman", Font.BOLD, 20));
        res.setSize(500, 25);
        res.setLocation(100, 557);
        c.add(res);

        resadd = new JTextArea();
        resadd.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        resadd.setSize(200, 75);
        resadd.setLocation(600, 200);
        resadd.setLineWrap(true);
        c.add(resadd);
        setVisible(true);
    }
    // method actionPerformed()
    // to get the action performed
    // by the user and act accordingly
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == sub) {
            if (term.isSelected()) {
                String data
                        = "First Name : "
                        + first_name.getText() + "\n"
                        + "Middle Name : "
                        + middle_name.getText() + "\n"
                        + "Last Name : "
                        + last_name.getText() + "\n"
                        + "Mobile : "
                        + mno.getText() + "\n"
                        + "Email Address: "
                        + email.getText() + "\n"
                        + "Aadhar Card Number: "
                        + taadhar.getText() + "\n"
                        + "Date of Birth: "
                        + date1.getText() + "\n";
                    String data1 = "Gender: "
                        + (String) genderComboBox.getSelectedItem() +
                        "\n";
//                String data2
//                        = "DOB : "
//                        + (String) date.getSelectedItem()
//                        + "/" + (String) month.getSelectedItem()
//                        + "/" + (String) year.getSelectedItem()
//                        + "\n";

                String data3 = "Address : " + tadd.getText() + "\n";
                String data4 = "Which Dose: " +
                        (String) takenornot.getSelectedItem()
                        + "\n" + "\n" + "Thank you for registering with us. Please take a Snapshot of this page for future references.";
                tout.setText(data + data1 + data3 + data4);
                tout.setEditable(false);
                res.setText("Registration Successfully..");
            } else {
                tout.setText("");
                resadd.setText("");
                res.setText("Please accept the"
                        + " terms & conditions..");
            }
        }
        if (e.getSource() == sub) {
            if(term.isSelected()) {
                try {
                    //Creating Connection object
                    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/vaccinationform", "root", "@#vishR1");
                    PreparedStatement Pstatement = connection.prepareStatement("INSERT INTO details VALUES(?,?,?,?,?,?,?,?,?,?)");

                    //Specifying the values of its parameter
                    Pstatement.setString(1, first_name.getText());
                    Pstatement.setString(2, middle_name.getText());
                    Pstatement.setString(3, last_name.getText());
                    Pstatement.setString(4, genderComboBox.getSelectedItem().toString());
                    Pstatement.setString(5, date1.getText());
                    Pstatement.setString(6, mno.getText());
                    Pstatement.setString(7, email.getText());
                    Pstatement.setString(8, taadhar.getText());
                    Pstatement.setString(9, tadd.getText());
                    Pstatement.setString(10, takenornot.getSelectedItem().toString());
                    Pstatement.executeUpdate();
                    JOptionPane.showMessageDialog(null, "You have registered");
                } catch (SQLException e1) {
                    e1.printStackTrace();
                }
            }
        }

        if (e.getSource() == reset) {
            String def = "";
            first_name.setText(def);
            middle_name.setText(def);
            last_name.setText(def);
            tadd.setText(def);
            mno.setText(def);
            date1.setText(def);
            res.setText(def);
            tout.setText(def);
            genderComboBox.setSelectedItem("Male");
            takenornot.setSelectedItem("First Dose");
            term.setSelected(false);
//            date.setSelectedIndex(0);
//            month.setSelectedIndex(0);
//            year.setSelectedIndex(0);
            resadd.setText(def);
            email.setText(def);
            taadhar.setText(def);
        }
    }
}
