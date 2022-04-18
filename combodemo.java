import javax.swing.*;
import java.awt.*;
class combodemo
{
 JFrame f;
 JPanel p;
 JComboBox cb;
 JLabel l;
 JButton b;
 JCheckBox ch1,ch2;
  combodemo()
   {
    f=new JFrame("combo");
    p=new JPanel();
    l=new JLabel("HOW ARE YOU");
    b=new JButton("CLICK HERE");
    b.setBackground(Color.red);
    String c[]={"BLUEBERRY","IPHONE","ONEPLUS","REDMI"};
    cb=new JComboBox(c);
    cb.setBackground(Color.yellow);
    ch1=new JCheckBox("ANDROID");
    ch1.setBackground(Color.cyan);
    ch2=new JCheckBox("IPHONE");
    ch2.setBackground(Color.magenta);
    
    p.add(l);
    p.add(cb);
    p.add(b);
    p.add(ch1);
    p.add(ch2);
    p.setBackground(Color.orange);
    f.add(p);
    f.setSize(500,500);
    f.setVisible(true);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
 public static void main(String ar[])
   {
    combodemo cd=new combodemo();
   }
 }