import java.io.*;
class bufferdemo
{
 public static void main(String ar[])throws IOException
 {
  FileOutputStream fo=new FileOutputStream("Shrianshi.txt");
  BufferedOutputStream bo=new BufferedOutputStream(fo);
  String s="WELCOME TO MY FILE";
  byte b[]=s.getBytes();
  bo.write(b);
  bo.close();
  fo.close();
System.out.println("WRITING DONE");
 }
}