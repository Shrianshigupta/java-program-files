import java.util.*;
class treedemo
{
 public static void main(String ar[])
 {
  TreeSet<String> ts=new TreeSet<String>();
  ts.add("Shrianshi");
  ts.add("Komal");
  ts.add("Akash");
  ts.add("Pankhudi");
  System.out.println(ts);  
  System.out.println("Reverse Tree"+ts.descendingSet());
  System.out.println("The first element to remove "+ts.pollFirst());
  System.out.println("The last element to remove "+ts.pollLast());
 }
}