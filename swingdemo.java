import javax.swing.*;
class swingdemo
{
 JFrame f;
 JPanel p;
 JLabel l1,l2;
 JButton b1,b2;
 JChoice c;
 JCheckbox c1,c2;
 JTextfeild t1;
 JPasswordFeild t2; 
 
 swingdemo()
 {
  f=new Frame("demo");
  p=new Panel();
  l1=new Label("Email id");
  l2=new Label("password");
  b1=new JButton("LOGIN");
  b2=new JButton("LOGOUT");
  c=new JChoice("state");
  c1=new JCheckbox("10-14 years");
  c2=new JCheckbox("15 years and above");
  t1=new JTextfeild("ENTER EMAILID");
  t2=new JPasswordFeild("ENTER PASSWORD");
  
  c.add("BIHAR");
  c.add("JHARKHAND");
  c.add("UTTARAKHAND");
  c.add("UTTAR PRADESH");
  p.add(c);
  p.add(l1);
  p.add(l2);
  p.add(b1);
  p.add(b2);
  p.add(c1);
  p.add(c2);
  p.add(t1);
  p.add(t2);
  f.add(p);
  
  f.setSize(500,500);
  f.setVisible(true);
  f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 }
 public static void main(String ar[])
  {
   swingdemo sw=new swingdemo();
   }
  } 