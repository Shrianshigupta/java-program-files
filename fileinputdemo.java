import java.io.*;
class fileinputdemo
{
 public static void main(String ar[])throws IOException
 {
  FileInputStream fis=new FileInputStream("Shrianshi.txt");
  int i=0;
  while((i=fis.read())!=-1)
   {  
    System.out.println((char)i);
   }
  fis.close();
 }
}