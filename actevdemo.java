import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class actevdemo implements ActionListener
{
 JFrame f;
 JPanel p;
 JButton b1,b2;
 JTextField t1,t2,t3;
 JLabel l1,l2,l3;

 actevdemo()
 {
  f=new JFrame("Simple calculator");
  p=new JPanel();
  b1=new JButton("+");
  b2=new JButton("-");
  t1=new JTextField("     ");
  t2=new JTextField("     ");
  t3=new JTextField("     ");
  l1=new JLabel("ENTER FIRST NO.");
  l2=new JLabel("ENTER SECOND NO.");
  l3=new JLabel("RESULT");
  p.add(l1);
  p.add(t1);
  p.add(l2);
  p.add(t2);
  p.add(l3);
  p.add(t3);
  p.add(b1);
  p.add(b2);
  f.add(p);

  b1.addActionListener(this);
  b2.addActionListener(this);
  f.pack();
  f.setVisible(true);
  
 }
 public void actionPerformed(ActionEvent ae)
 {
  String s1=t1.getText();
  String s2=t2.getText();
  int a=Integer.parseInt(s1);
  int b=Integer.parseInt(s2);
  String m=ae.getActionCommand();
  if(m.equals("+"))
  {
   int c=a+b;
   String p=String.valueOf(c);
   t3.setText(p);
  }
  else
  {
   int d=a-b;
   String p=String.valueOf(d);
   t3.setText(p);
  }
 }
 public static void main(String ar[])
 {
  actevdemo ad=new actevdemo();
 }
}  
  