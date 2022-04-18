import javax.swing.*;
import java.awt.event.*;
class sdevent
{
 JFrame f;
 JPanel p;
 JLabel l1,l2;
 JButton b1,b2;
 JTextField t1,t2;
 sdevent()
 {
  f=new JFrame("SIMPLE CALCULATOR");
  p=new JPanel();
  l1=new JLabel("ENTER FIRST NUMBER");
  t1=new JTextField("                ");
  l2=new JLabel("ENTER SECOND NUMBER");
  t2=new JTextField("               ");
  b1=new JButton("+");
  b2=new JButton("-");
  p.add(l1);
  p.add(t1);
  p.add(l2);
  p.add(t2);
  p.add(b1);
  p.add(b2);
  f.add(p);
  f.pack();
  f.setVisible(true);
  f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 }
 public static void main(String ar[])
 {
  sdevent de=new sdevent();
 }
}