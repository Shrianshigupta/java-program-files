class Final 
{
 public void get()
 {
  System.out.println("HAVE A GOOD DAY");
 }
}
class Finalmeth extends Final
{
 public void get()
 {
  System.out.println("HAVE A NICE DAY");
 }
public static void main(String ar[])
 {
  Finalmeth fm=new Finalmeth();
  fm.get();
 }
}