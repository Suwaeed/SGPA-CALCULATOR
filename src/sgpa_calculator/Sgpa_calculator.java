package sgpa_calculator;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Sgpa_calculator extends JFrame{
private ImageIcon icon;
private Container c;
private JLabel t_label,p_label,u_label,ses_label,sem_label;
private Font f,f2;
private JTextField tf_1,tf_2,tf_3,tf_4;
private JButton b_1,b_2;
private Cursor cursor;
//private Scanner sc;
public static int num;
Sgpa_calculator()
        {
    initComponents();
}
public void initComponents()
{
  c=this.getContentPane();
  c.setLayout(null);
  c.setBackground(Color.orange);
    icon=new ImageIcon(getClass().getResource("BSFMSTU Logo.PNG"));
this.setIconImage(icon.getImage());

f=new Font("Arial",Font.BOLD,14);
f2=new Font("Arial",Font.BOLD,18);

cursor=new Cursor(Cursor.HAND_CURSOR);

t_label=new JLabel();
t_label.setText(" STUDENT INFORMATION ");
t_label.setBounds(150,15,160,40);
t_label.setFont(f2);
t_label.setForeground(Color.red);
t_label.setOpaque(true);
t_label.setBackground(Color.green);
//p_label.setCursor(cursor);
c.add(t_label);

p_label=new JLabel();
p_label.setText(" Enter your Student ID: ");
p_label.setBounds(50,75,160,40);
p_label.setFont(f);
p_label.setForeground(Color.red);
p_label.setOpaque(true);
p_label.setBackground(Color.white);
//p_label.setCursor(cursor);
c.add(p_label);

u_label=new JLabel();
u_label.setText(" Enter your Full Name: ");
u_label.setBounds(50,125,160,40);
u_label.setFont(f);
u_label.setForeground(Color.red);
u_label.setOpaque(true);
u_label.setBackground(Color.white);
//u_label.setCursor(cursor);
c.add(u_label);

ses_label=new JLabel();
ses_label.setText(" Enter your Session: ");
ses_label.setBounds(50,175,160,40);
ses_label.setFont(f);
ses_label.setForeground(Color.red);
ses_label.setOpaque(true);
ses_label.setBackground(Color.white);
//ses_label.setCursor(cursor);
c.add(ses_label);

sem_label=new JLabel();
sem_label.setText(" Enter your Semester: ");
sem_label.setBounds(50,225,160,40);
sem_label.setFont(f);
sem_label.setForeground(Color.red);
sem_label.setOpaque(true);
sem_label.setBackground(Color.white);
//sem_label.setCursor(cursor);
c.add(sem_label);

tf_1=new JTextField("03");
tf_1.setBounds(220,15,200,40);
tf_1.setFont(f);
c.add(tf_1);

tf_2=new JTextField("Suwaeed Ul Islam");
tf_2.setBounds(220,65,200,40);
tf_2.setFont(f);
c.add(tf_2);

tf_3=new JTextField("2019-2020");
tf_3.setBounds(220,115,200,40);
tf_3.setFont(f);
c.add(tf_3);

tf_4=new JTextField("22");
tf_4.setBounds(220,165,200,40);
tf_4.setFont(f);
c.add(tf_4);

b_1=new JButton("Submit");
b_1.setBounds(70,250,100,40);
b_1.setFont(f);
b_1.setCursor(cursor);
c.add(b_1);

b_2=new JButton("Cancel");
b_2.setBounds(220,250,100,40);
b_2.setFont(f);
b_2.setCursor(cursor);
c.add(b_2);

b_1.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent e)
    {
        String id=tf_1.getText();
        String name=tf_2.getText();
        String session=tf_3.getText();
        String semester=tf_4.getText();
        //String n=JOptionPane.showInputDialog(null,"Enter number of Courses:","05");
        //num=Integer.parseInt(n);
        //System.out.println(num);
        dispose();
       //for(int i=0;i<num;i++){
        NewClass_out frame=new NewClass_out();
        frame.setVisible(true);
        //}
    }
});

b_2.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent e)
    {
        tf_1.setText("");
        tf_2.setText("");
        tf_3.setText("");
        tf_4.setText("");
    }
});
}
    public static void main(String[] args) {
        Sgpa_calculator frame=new Sgpa_calculator();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(550, 400);
        frame.setLocationRelativeTo(null);
        frame.setTitle("Fill up this information");
       
    }
    
}
