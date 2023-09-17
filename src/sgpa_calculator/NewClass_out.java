
package sgpa_calculator;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class NewClass_out extends JFrame {
    private Container c;
    private JLabel label_0,label_1,label_2,label_3,label_4;
private Font f,f2;
private JTextField t_1,t_2,t_3,t_4;
private JButton bt_1,bt_2,bt_3;
private Cursor cursor;
public static String s;
//private Scanner sc;

public static float ca=0;
 public static float exam_marks=0;
  public static float total_marks=0;

    // Declare arrays to store grade points and credit hours
   public static float grade_points=0;
   public static float credit_Hours=0;

   public float total_credit=0;
   public float totalGradePoints = 0;
   public float totalCreditHours = 0;
   public static float sgpa = 0;
   
    NewClass_out()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600,450);
        this.setLocationRelativeTo(null);
        this.setTitle(" Fill up this information");
        
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.green);
        cursor=new Cursor(Cursor.HAND_CURSOR);
        f=new Font("Arial",Font.BOLD,14);
        f2=new Font("Arial",Font.BOLD,22);

label_0=new JLabel();
label_0.setText(" SGPA CALCULATOR ");
label_0.setBounds(150,15,260,50);
label_0.setFont(f2);
label_0.setForeground(Color.black);
label_0.setOpaque(true);
label_0.setBackground(Color.green);
//label_0.setCursor(cursor);
c.add(label_0);

label_1=new JLabel();
label_1.setText(" Enter Course Code: ");
label_1.setBounds(100,90,150,40);
label_1.setFont(f);
label_1.setForeground(Color.red);
label_1.setOpaque(true);
label_1.setBackground(Color.white);
//label_1.setCursor(cursor);
c.add(label_1);

label_2=new JLabel();
label_2.setText(" Enter Credit: ");
label_2.setBounds(100,140,150,40);
label_2.setFont(f);
label_2.setForeground(Color.red);
label_2.setOpaque(true);
label_2.setBackground(Color.white);
//label_2.setCursor(cursor);
c.add(label_2);

label_3=new JLabel();
label_3.setText(" Enter CA Marks: ");
label_3.setBounds(100,190,150,40);
label_3.setFont(f);
label_3.setForeground(Color.red);
label_3.setOpaque(true);
label_3.setBackground(Color.white);
//label_3.setCursor(cursor);
c.add(label_3);

label_4=new JLabel();
label_4.setText(" Enter Exam Marks: ");
label_4.setBounds(100,240,150,40);
label_4.setFont(f);
label_4.setForeground(Color.red);
label_4.setOpaque(true);
label_4.setBackground(Color.white);
//label_4.setCursor(cursor);
c.add(label_4);

t_1=new JTextField();
t_1.setBounds(262,90,100,40);
t_1.setFont(f);
t_1.setHorizontalAlignment(JTextField.CENTER);
c.add(t_1);

t_2=new JTextField();
t_2.setBounds(262,140,100,40);
t_2.setFont(f);
t_2.setHorizontalAlignment(JTextField.CENTER);
c.add(t_2);

t_3=new JTextField();
t_3.setBounds(262,190,100,40);
t_3.setFont(f);
t_3.setHorizontalAlignment(JTextField.CENTER);
c.add(t_3);

t_4=new JTextField();
t_4.setBounds(262,240,100,40);
t_4.setFont(f);
t_4.setHorizontalAlignment(JTextField.CENTER);
c.add(t_4);

bt_1=new JButton("Submit");
bt_1.setBounds(70,330,100,40);
bt_1.setFont(f);
bt_1.setCursor(cursor);
c.add(bt_1);

bt_2=new JButton("Clear");
bt_2.setBounds(210,330,100,40);
bt_2.setFont(f);
bt_2.setCursor(cursor);
c.add(bt_2);

bt_3=new JButton("Calculate");
bt_3.setBounds(350,330,115,40);
bt_3.setFont(f);
bt_3.setCursor(cursor);
c.add(bt_3);

bt_1.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent e)
    {
        try{
            String course=t_1.getText();
        credit_Hours=Float.parseFloat(t_2.getText());
        ca=Float.parseFloat(t_3.getText());
        exam_marks=Float.parseFloat(t_4.getText());
        
        //System.out.println(credit_Hours);
        //System.out.println(ca);
        //System.out.println(exam_marks);
        
        total_marks=ca+exam_marks;
        if(credit_Hours==3)
        {
            grade_points=theorygp(total_marks);
        }
        else if(credit_Hours==1.5)
        {
            grade_points=labgp(total_marks);
        }
        
        //System.out.print("\nGrade points of subject "+(i+1)+"="+grade_points[i]+"\n");
        
        totalGradePoints += grade_points * credit_Hours;
        totalCreditHours += credit_Hours;
        
        t_1.setText("");
        t_2.setText("");
        t_3.setText("");
        t_4.setText("");
        
    // Calculate the SGPA
    sgpa = totalGradePoints / totalCreditHours;
            //System.out.println("SGPA="+sgpa);
        }catch(NumberFormatException ex){
         //JOptionPane.showMessageDialog(rootPane, ex);
        } 
        
    }
  
});

bt_2.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent e)
    {
        t_1.setText("");
        t_2.setText("");
        t_3.setText("");
        t_4.setText("");
    }
});

bt_3.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent e)
    {
        dispose();
        s=String.format("%.3f",sgpa);
        
        if(sgpa==4.00)
        {
           JOptionPane.showMessageDialog(null,"Extraordinary,Keep it up! you passed and your SGPA is "+s,"RESULT",JOptionPane.PLAIN_MESSAGE); 
        }
        else if(sgpa>=3.75)
                {
                    JOptionPane.showMessageDialog(null,"Outstanding,Keep it up! you passed and your SGPA is "+s,"RESULT",JOptionPane.PLAIN_MESSAGE);
                }
        else if(sgpa>=3.50)
                {
          JOptionPane.showMessageDialog(null,"Very Good,Keep it up! you passed and your SGPA is "+s,"RESULT",JOptionPane.PLAIN_MESSAGE);
      }
        else if(sgpa>=3.25)
        {
            JOptionPane.showMessageDialog(null,"Well done! you passed and your SGPA is "+s,"RESULT",JOptionPane.PLAIN_MESSAGE);
        }
        else if(sgpa>=3.00)
        {
            JOptionPane.showMessageDialog(null,"Good! you passed and your SGPA is "+s,"RESULT",JOptionPane.PLAIN_MESSAGE);
        }
        else if(sgpa<3.00 && sgpa>=2.00)
        {
            JOptionPane.showMessageDialog(null,"Not So Good! you passed and your SGPA is "+s,"RESULT",JOptionPane.PLAIN_MESSAGE);
        }
      else{
          JOptionPane.showMessageDialog(null,"Sorry! you failed and your SGPA is "+s,"RESULT",JOptionPane.WARNING_MESSAGE);
      }
        
        Output fr=new Output();
        fr.setVisible(true);
    }
});
        
    }
    
    public static float theorygp(float marks){
    if(marks>=79.5 && marks<=100)
    {
        return 4.00f;
    }
    else if(marks>=74.5 && marks<=79)
    {
        return 3.75f;
    }
    else if(marks>=69.5 && marks<=74)
    {
        return 3.50f;
    }
    else if(marks>=64.5 && marks<=79)
    {
        return 3.25f;
    }
    else if(marks>=59.5 && marks<=64)
    {
        return 3.00f;
    }
    else if(marks>=54.5 && marks<=59)
    {
        return 2.75f;
    }
    else if(marks>=49.5 && marks<=54)
    {
        return 2.50f;
    }
    else if(marks>=44.5 && marks<=49)
    {
        return 2.25f;
    }
    else if(marks>=39.5 && marks<=44)
    {
        return 2.00f;
    }
    else
    {
        return 0.00f;
    }
}
    
public static float labgp(float marks){
    if(marks>=40 && marks<=50)
    {
        return 4.00f;
    }
    else if(marks>=37.5 && marks<=39)
    {
        return 3.75f;
    }
    else if(marks>=35 && marks<=37)
    {

        return 3.50f;
    }
    else if(marks>=32.5 && marks<=34.5)
    {
        return 3.25f;
    }
    else if(marks>=30 && marks<=32)
    {
        return 3.00f;
    }
    else if(marks>=27.5 && marks<=29.5)
    {
        return 2.75f;
    }
    else if(marks>=25 && marks<=27)
    {
        return 2.50f;
    }
    else
    {
        return 0.00f;
    }
}
    
    public static void main(String[] args) {
        NewClass_out fr=new NewClass_out();
        fr.setVisible(true);
    }
 
}
