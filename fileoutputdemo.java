import java.io.*;
 public class fileoutputdemo
 {
  public static void main(String ar[])
  {
   try
    {
     FileOutputStream fo=new FileOutputStream("E:\\CSE 2nd yr.txt");
     fo.write(70);
     fo.close();
     System.out.println("GO AND SIT ON A CACTUS....");
    }
  catch(Exception e)
    {
     System.out.println(e);
    }
  }
}