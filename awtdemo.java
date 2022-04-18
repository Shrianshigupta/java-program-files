import java.awt.*;
class awtdemo extends Frame
{
 awtdemo()
  {
   Frame f=new Frame("LOGIN HERE");
   Panel p=new Panel();
   p.setBounds(30,30,200,200);
   p.setBackground(Color.gray);

   Label l1=new Label("ENTER USERNAME");
   l.setBounds(30,50,100,80);
   
   TextField t=new TextField();
   t.setBounds(30,70,100,100);
  
   Label l2=new Label("ENTER PASSWORD");
   l.setBounds(30,90,100,100);

   PasswordField p=new PasswordField();
   p.setBounds(30,90,100,100
   
   Button b=new Button("LOGIN");
   b.setBounds(30,100,100,100);
   p.add(l1);
   p.add(t);
   p.add(l2);
   p.add(p);
   p.add(b);
   f.add(p);
   f.setSize(300,300);
   f.setLayout(new GridLayout(5,1));
   f.setVisible(true);
  }
 public static void main(String ar[])
  {
   awtdemo aw=new awtdemo();
  }
 }