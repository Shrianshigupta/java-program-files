import java.util.*;
class queuedemo2
{
 public static void main(String ar[])
 {
   PriorityQueue<String> pq=new PriorityQueue<String>();
   pq.add("SHRIANSHI");
   pq.add("KOMAL");
   pq.add("PANKHUDI");
   pq.add("AKASH");  
   Iterator itr=pq.iterator();
   while(itr.hasNext())
   {
    System.out.println(itr.next());
   }
 }
}