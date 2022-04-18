class Static
{
 static int x=10;
 Static()
 {
  x++;
  System.out.println(x);
 }
public static void main(String ar[])
 { 
  Static s1=new Static();
  Static s2=new Static();
  Static s3=new Static();
 }
}