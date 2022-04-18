import java.io.*;
class fileoutputdemo
{
 public static void main(String ar[])throws IOException
 {
  FileOutputStream fos=new FileOutputStream("Shrianshi.txt");
  fos.write(65);
  fos.close();
  System.out.println("writing done...");
}
}