import java.io.*;
class charreader
{
 public static void main(String ar[])throws IOException
 {
  char c[]={'H','O','W',' ','A','R','E',' ','Y','O','U'};
  CharArrayReader ch=new CharArrayReader(c);
  int i=0;
  while((i=ch.read())!=-1)
  {
   System.out.print((char)i+"=");
   System.out.println(i);
  }
 }
}