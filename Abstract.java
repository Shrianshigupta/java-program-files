abstract class A
{  
 abstract void show();
 
 void get()
  {
   System.out.println("MY WORLD");
  }
}
class Abstract extends A
{
 void show()
  {
   System.out.println("WELCOME TO");
  }
 public static void main(String ar[])
 {
   Abstract a=new Abstract();
   a.show();
   a.get();
  }
}