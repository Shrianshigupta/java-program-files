class This
{
 int x;
 String n;
 This()
 {
 System.out.println("Int and String");
 }
 This(int x,String n)
  {
   this();
   this.x=x;
   this.n=n;
  }
 void show()
  {
   System.out.println(x+" "+n);
  }
 public static void main(String ar[])
 {
  This t=new This(20,"SHRIANSHI");
  t.show();
 }
}