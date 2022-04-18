class Super
{
 int get(int x,int y)
 {
  return x+y;
 }
}
class Override extends Super
{
 int get(int a,int b)
 {
  return a+b;
 }
public static void main(String ar[])
 {
  Override or=new Override();
  System.out.println(or.get(3,7));
 }
}