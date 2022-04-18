import java.net.*;
import java.io.*;
class serverside
{
 public static void main(String ar[])
 {
 try
  {
   ServerSocket ss=new ServerSocket(3000);
   Socket s=ss.accept();
   DataInputStream dis=new DataInputStream(s.getInputStream());
   String str=dis.readUTF();
   System.out.println("CLIENT MSG::"+str);
   ss.close();
  }
  catch(Exception e)
  {
   System.out.println(e);
  }
 }
}
   