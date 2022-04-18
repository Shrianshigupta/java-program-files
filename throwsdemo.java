import java.io.*;
class throwsdemo
{
 void get(int n)throws IOException
 {
  if (n<15)
  {
   throw new IOException("NOT VALID");
  }
 }
 public static void main(String ar[])throws IOException
  {
   throwsdemo ts=new throwsdemo();
   ts.get(11);
  }
} 
