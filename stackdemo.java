import java.util.*;
class stackdemo
{
 public static void main(String ar[])
 {
   Stack<String> s=new Stack<String>();
   s.push("SHRIANSHI");
   s.push("KOMAL");
   s.push("PANKHUDI");
   s.push("AKASH");  
   s.pop();
   System.out.println(s);
   System.out.println("TOP ELEMENT IN STACK IS "+s.peek());
 }
}