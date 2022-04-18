class localinnerdemo
{
 private int x=20;
 void set()
 {
   class inner
  {
  void get()
   {
   System.out.println(x);
   }
  }
 inner i=new inner();
 i.get();
}
 public static void main(String ar[])
 {
  localinnerdemo ld=new localinnerdemo();
  ld.set();
 }
}