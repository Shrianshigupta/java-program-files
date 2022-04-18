class S
{ 
  int x=10;
 }
class Super extends S
{ 
 void get()
  { 
   System.out.println(super.x);
   System.out.println("Use of Super");
  }
  public static void main(String ar[])
  {
    Super s=new Super();
    s.get();
  }
}