import javax.swing.*;
class swgdemo
{
 JFrame f;
 JPanel p;
 JLabel l1,l2;
 JTextField t1;
 JPasswordField t2;
 JButton b1,b2;
 
 swgdemo()
 {
  f=new JFrame("login form demo");
  p=new JPanel();
  l1=new JLabel("Enter name");
  l2=new JLabel("Enter Password");
  t1=new JTextField(20);
  t2=new JPasswordField(20);
  b1=new JButton("add");
  b2=new JButton("subtract");
  
  p.add(l1);
  p.add(t1);
  p.add(l2);
  p.add(t2);
  p.add(b1);
  p.add(b2);
  f.add(p);
  f.setSize(500,500);
  f.setVisible(true);
  f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
public static void main(String ar[])
{
  swgdemo sw=new swgdemo();
}
}