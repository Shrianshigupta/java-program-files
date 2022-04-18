import java.util.*;
class queuedemo
{
 public static void main(String ar[])
 {
   PriorityQueue<String> pq=new PriorityQueue<String>();
   pq.add("SHRIANSHI");
   pq.add("KOMAL");
   pq.add("PANKHUDI");
   pq.add("AKASH");  
   System.out.println(pq);
   System.out.println("TOP ELEMENT IN QUEUE IS "+pq.peek());
   System.out.println("TOP ELEMENT TO BE REMOVED FROM QUEUE IS "+pq.poll());
}
}