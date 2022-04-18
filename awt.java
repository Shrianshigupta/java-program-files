import java.awt.*;
class awt
{
 awt()
  {
   Frame f=new Frame("awt");
   Label l=new Label("FAVORITES");
   l.setBounds(100,200,600,600);
   l.setBackground(Color.magenta);
   
   Choice c=new Choice();
   c.setBounds(100,300,800,800);
   c.setBackground(Color.blue);
  
   Checkbox c1=new Checkbox("MOUNTAINS");
   c1.setBounds(100,400,800,800);
   c1.setBackground(Color.yellow);
  
   Checkbox c2=new Checkbox("BEACHES");
   c2.setBounds(100,500,800,800);
   c2.setBackground(Color.red);
   
   Panel p=new Panel();
   p.setBounds(100,100,500,500);
   p.setBackground(Color.black);
  
   c.add("BLACK");
   c.add("MAGENTA");
   c.add("CYAN");
   c.add("PURPLE");
   p.add(c);
   p.add(l);
   p.add(c1);
   p.add(c2);
   f.add(p);
   f.setSize(700,700);
   f.setLayout(null);
   f.setVisible(true);
  }
 public static void main(String ar[])
  {
   awt aw=new awt();
  }
}   
   