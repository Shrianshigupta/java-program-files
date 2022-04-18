class Overloading
{
 int get(int x,int y)
 { 
  return x+y;
 }
 double get(int a,int b,double c)
 {
  return (a+b)-c;
 }
 public static void main(String ar[])
 {
  Overloading ol=new Overloading();
  System.out.println(ol.get(3,5));
  System.out.println(ol.get(4,5,4.7));
 }
} 
  