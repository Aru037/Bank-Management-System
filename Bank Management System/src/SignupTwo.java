import javax.swing.*;
import java.awt.*;
import  java.awt.event.*;

public class SignupTwo extends JFrame implements ActionListener{

    JTextField aadharTextField,panTextField;
    JButton next;
    JRadioButton eyes,eno,syes,sno;
    JComboBox<String> income_box,religion_box,category_box,education_box,occupation_box;
    String form_no;

    SignupTwo(String form_no){

        this.form_no = form_no;
        setLayout(null);

        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");

        JLabel additional_details = new JLabel("Page 2: Additional Details");
        additional_details.setFont(new Font("Raleway", Font.BOLD, 22));
        additional_details.setBounds(290, 80,400,30);
        add(additional_details);

        JLabel religion = new JLabel("Religion:");
        religion.setFont(new Font("Raleway", Font.BOLD, 20));
        religion.setBounds(100, 140,100,30);
        add(religion);

        String[] valReligion = {"Hindu","Muslim","Sikh","Christian","Other"};
        religion_box = new JComboBox<>(valReligion);
        religion_box.setBounds(300,140,400,30);
        religion_box.setBackground(Color.WHITE);
        add(religion_box);


        JLabel category = new JLabel("Category:");
        category.setFont(new Font("Raleway", Font.BOLD, 20));
        category.setBounds(100, 190,200,30);
        add(category);

        String[] valcategory = {"General","OBC","SC","ST","Other"};
        category_box = new JComboBox<>(valcategory);
        category_box.setBounds(300,190,400,30);
        category_box.setBackground(Color.WHITE);
        add(category_box);

        JLabel income = new JLabel("Income:");
        income.setFont(new Font("Raleway", Font.BOLD, 20));
        income.setBounds(100, 240,200,30);
        add(income);

        String[] incomecategory = {"Null","< 1,50,000","< 2,50,000","< 5,00,000","Upto 10,00,000"};
        income_box = new JComboBox<>(incomecategory);
        income_box.setBounds(300,240,400,30);
        income_box.setBackground(Color.WHITE);
        add(income_box);


        JLabel education = new JLabel("Educational");
        education.setFont(new Font("Raleway", Font.BOLD, 20));
        education.setBounds(100, 290,200,30);
        add(education);

        JLabel qualification = new JLabel("Qualification:");
        qualification.setFont(new Font("Raleway", Font.BOLD, 20));
        qualification.setBounds(100, 315,200,30);
        add(qualification);

        String[] educationalValues = {"Non Graduation","Graduate","Post Graduation","Doctrate","Others"};
        education_box = new JComboBox<>(educationalValues);
        education_box.setBounds(300,315,400,30);
        education_box.setBackground(Color.WHITE);
        add(education_box);


        JLabel occupation = new JLabel("Occupation:");
        occupation.setFont(new Font("Raleway", Font.BOLD, 20));
        occupation.setBounds(100, 390,200,30);
        add(occupation);

        String[] occupationValues = {"Salaried","Self-Employed","Business","Retired","Others"};
        occupation_box = new JComboBox<>(occupationValues);
        occupation_box.setBounds(300,390,400,30);
        occupation_box.setBackground(Color.WHITE);
        add(occupation_box);


        JLabel pan = new JLabel("PAN Number:");
        pan.setFont(new Font("Raleway", Font.BOLD, 20));
        pan.setBounds(100, 440,200,30);
        add(pan);

        panTextField = new JTextField();
        panTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        panTextField.setBounds(300,440,400,30);
        add(panTextField);

        JLabel aadhar = new JLabel("Aadhar Number:");
        aadhar.setFont(new Font("Raleway", Font.BOLD, 20));
        aadhar.setBounds(100, 490,200,30);
        add(aadhar);

        aadharTextField = new JTextField();
        aadharTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        aadharTextField.setBounds(300,490,400,30);
        add(aadharTextField);

        JLabel seniorcitizen = new JLabel("Senior Citizen:");
        seniorcitizen.setFont(new Font("Raleway", Font.BOLD, 20));
        seniorcitizen.setBounds(100, 540,200,30);
        add(seniorcitizen);

        syes = new JRadioButton("YES");
        syes.setBounds(300,540,100,30);
        syes.setBackground(Color.WHITE);
        add(syes);

        sno = new JRadioButton("NO");
        sno.setBounds(450,540,100,30);
        sno.setBackground(Color.WHITE);
        add(sno);

        ButtonGroup seniorcitizen_group = new ButtonGroup();
        seniorcitizen_group.add(syes);
        seniorcitizen_group.add(sno);

        JLabel exisistingacc = new JLabel("Exisiting Account:");
        exisistingacc.setFont(new Font("Raleway", Font.BOLD, 20));
        exisistingacc.setBounds(100, 590,200,30);
        add(exisistingacc);

        eyes = new JRadioButton("YES");
        eyes.setBounds(300,590,100,30);
        eyes.setBackground(Color.WHITE);
        add(eyes);

        eno = new JRadioButton("NO");
        eno.setBounds(450,590,100,30);
        eno.setBackground(Color.WHITE);
        add(eno);

        ButtonGroup accountgroup = new ButtonGroup();
        accountgroup.add(eyes);
        accountgroup.add(eno);

        next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setBounds(620,660,80,30);
        next.addActionListener(this);
        add(next);

        getContentPane().setBackground(Color.WHITE);

        setSize(850,800);
        setLocation(350,10);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){
        String religion = (String) religion_box.getSelectedItem();
        String category = (String) category_box.getSelectedItem();
        String income = (String) income_box.getSelectedItem();
        String education = (String) education_box.getSelectedItem();
        String occupation = (String) occupation_box.getSelectedItem();
        String seniorcitizen = null;
        if (syes.isSelected()){
            seniorcitizen = "YES";
        }else if(sno.isSelected()){
            seniorcitizen = "NO";
        }

        String exisistingacc = null;

        if (eyes.isSelected()){
            exisistingacc = "YES";
        }else if(eno.isSelected()){
            exisistingacc = "NO";
        }

        String pan = panTextField.getText();
        String aadhar = aadharTextField.getText();
        try{

                Conn c = new Conn();
                String query = "insert into signuptwo values('"+ form_no +"','"+ religion +"','"+category+"'," +
                        "'"+income+"','"+education+"','"+occupation+"','"+pan+"','"+aadhar+"','"+seniorcitizen+"','"+exisistingacc+"')";
                c.s.executeUpdate(query);

                setVisible(false);
                new SignupThree(form_no).setVisible(true);
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public static void main(String[] args) {
        new SignupTwo("");
    }
}
