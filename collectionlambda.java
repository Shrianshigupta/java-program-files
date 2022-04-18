import java.util.*;
class collectionlambda
{
 public static void main(String ar[])
 {
  ArrayList<String> al=new ArrayList<String>();
  al.add("SHRIANSHI");
  al.add("KISSI");
  al.add("CHHOTI");
  al.forEach((x)->System.out.println(x));
 }
}
   