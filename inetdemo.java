import java.net.*;
class inetdemo
{
 public static void main(String ar[])
 {
 try
 {
  InetAddress in=InetAddress.getByName("www.google.com");
  System.out.println("IP Address->"+in.getHostAddress());
  System.out.println("Host Name->"+in.getHostName());
 }
 catch(Exception e)
 {
  System.out.println(e);
 }
 }
}