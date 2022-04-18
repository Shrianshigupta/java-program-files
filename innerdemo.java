class innerdemo
{
 private int x=20;
 class inner
 {
  void get()
  {
   System.out.println(x);
  }
 }
 public static void main(String ar[])
 {
  innerdemo id=new innerdemo();
  innerdemo.inner i=id.new inner();
  i.get();
 }
}