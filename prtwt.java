import java.io.*;
class prtwt
{
 public static void main(String ar[])throws IOException
 {
  PrintWriter pw=new PrintWriter(new File("Shrianshi.txt"));
  pw.write("HOW ARE YOU DOING NOWADAYS");
  pw.close();
 }
}