interface I
{
  void get();
 }
class Interface implements I
{
 public void get()
  {
   System.out.println("Body of get method in interface I");
   }
  public static void main(String ar[])
  {
   Interface i=new Interface();
   i.get();
  }
} 