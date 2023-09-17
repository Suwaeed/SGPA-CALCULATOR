
package sgpa_calculator;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
//import javax.swing.JTextField;

public class Output extends JFrame {
    private Container c;
private JLabel title,bottom;
private Font f1,f2;

//private JTextField tf_1,tf_2,tf_3,tf_4;

private JButton exitbutton,d;
private Cursor cursor;
private JTable table;
private DefaultTableModel model;
private JScrollPane scroll;
private String[] column={"ID","Name","Session","Semester","SGPA"};
private String[] row=new String[5];

//private static String id,name,semister,session;

    Output(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600,500);
        this.setLocationRelativeTo(null);
        this.setTitle(" Output Page");
        
  c=this.getContentPane();
  c.setLayout(null);
  c.setBackground(Color.green);
  
  f1=new Font("Arial",Font.BOLD,22);
f2=new Font("Calibari",Font.BOLD,14);

cursor=new Cursor(Cursor.HAND_CURSOR);

title=new JLabel();
title.setText(" Student Table");
title.setBounds(200,15,170,40);
title.setFont(f1);
title.setForeground(Color.BLACK);
title.setOpaque(true);
title.setBackground(Color.GREEN);
c.add(title);

bottom=new JLabel();
bottom.setText(" Copyright @ 2023  All Rights Reserved");
bottom.setBounds(140,390,320,40);
bottom.setFont(f2);
bottom.setForeground(Color.red);
bottom.setOpaque(true);
bottom.setBackground(Color.GREEN);
c.add(bottom);

  
  table=new JTable();
  model=new DefaultTableModel();
  model.setColumnIdentifiers(column);
  table.setModel(model);
  table.setSelectionBackground(Color.orange);
  table.setCursor(cursor);
  table.setBackground(Color.white);
  table.setRowHeight(35);
  //table.setBounds(50,65,420,420);
  //c.add(table);
  
  scroll=new JScrollPane(table);
  scroll.setBounds(50,80,500,150);
  c.add(scroll);
  
  exitbutton=new JButton("Exit");
exitbutton.setBounds(320,320,100,40);
exitbutton.setFont(f1);
exitbutton.setBackground(Color.red);
exitbutton.setCursor(cursor);
c.add(exitbutton);

d=new JButton("Result");
d.setBounds(120,320,120,40);
d.setFont(f1);
d.setBackground(Color.yellow);
d.setCursor(cursor);
c.add(d);

exitbutton.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent e)
    {
        dispose();
    int choice=JOptionPane.showConfirmDialog(null,"Are you sure you want to exit?"," QUIT",JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE);
        if(choice==JOptionPane.YES_OPTION)
        {
            JOptionPane.showMessageDialog(null,"        Thanks to Visit our Software"," Message",JOptionPane.PLAIN_MESSAGE);
           System.exit(0); 
        }
        else
        {
            Sgpa_calculator frame=new Sgpa_calculator();
            frame.setVisible(true);
        }
    }
});

d.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent e)
    {
        row[0]=Sgpa_calculator.id;
        row[1]=Sgpa_calculator.name;
        row[2]=Sgpa_calculator.session;
        row[3]=Sgpa_calculator.semester;
        row[4]=NewClass_out.s;
        model.addRow(row);
        
    }
        });
    }
    public static void main(String[] args) {
        Output fr=new Output();
        fr.setVisible(true);
    }
}
