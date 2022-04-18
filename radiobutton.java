import javax.swing.*;
import java.awt.*;
class radiobutton
{
 JFrame f;
 JPanel p;
 JComboBox cb;
 JRadioButton rb1,rb2;
 JLabel l1,l2,l3;
 JButton b1,b2;
 JTextField t;

  radiobutton()
  {
   f=new JFrame("LOGIN FORM");
   p=new JPanel();
   String c[]={"BIHAR","UTTARAKHAND","UTTAR PRADESH","TAMILNADU","KERELA","JHARKHAND"};
   cb=new JComboBox(c);
   rb1=new JRadioButton("13-18 years");
   rb2=new JRadioButton("19 years and above");
   l1=new JLabel("LOGIN YOURSELF HERE");
   l2=new JLabel("already logged in?");
   l3=new JLabel("ENTER YOUR NAME HERE");
   b1=new JButton("LOGIN");
   b2=new JButton("LOGOUT");
   t=new JTextField("give your name");
   t.setBackground(Color.BLACK);
 
  p.add(l1);
  p.add(l3);
  p.add(t);
  p.add(rb1);
  p.add(rb2);
  p.add(cb);
  p.add(b1);
  p.add(l2);
  p.add(b2);
  f.add(p);
  f.setSize(300,300);
  f.setVisible(true);
  f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 }
 public static void main(String ar[])
  {
   radiobutton rb=new radiobutton();
  }
}
  
   
   
