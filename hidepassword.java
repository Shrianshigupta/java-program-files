import java.io.*;
class hidepassword
{
 public static void main(String ar[])
 {
  Console c=System.console();
  System.out.println("password is :");
  char ch[]=c.readPassword();
  for(char j:ch)
   {
    System.out.print(j);
   }
  }
 }