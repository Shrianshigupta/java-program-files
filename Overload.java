class Overload
{
 int sum(int x,int y)
 {
  return x+y;
 }
 float sum(float x,int y)
 {
  return x+y;
 }
public static void main(String ar[])
 {
  Overload ol=new Overload();
  System.out.println(ol.sum(3,4));
  System.out.println(ol.sum(545,4));
 }
}