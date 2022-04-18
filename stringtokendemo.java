import java.util.*;
class stringtokendemo
{
 public static void main(String ar[])
 {
  StringTokenizer st=new StringTokenizer("ANIMALS ARE BETTER THAN HUMANS");
  while(st.hasMoreTokens())
  {
   System.out.println(st.nextToken());
  }
 }
}