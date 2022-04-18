import java.net.*;
import java.io.*;
class clientside
{
 public static void main(String ar[])
 {
try
 {
 Socket s=new Socket("127.0.0.1",3000);
 DataOutputStream dos=new DataOutputStream(s.getOutputStream());
 dos.writeUTF("HELLO SERVER");
 dos.flush();
 dos.close();
 s.close();
 }
catch(Exception e)
 {
  System.out.println(e);
 }
}
}