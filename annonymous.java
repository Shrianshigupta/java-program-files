abstract class annonymousdemo
{
 abstract void get();
}
class annonymous
{
 public static void main(String ar[])
 {
  annonymousdemo ad=new annonymousdemo(){
   public void get()
   {
    System.out.println("Get Method");
   }
  };
 ad.get();
 }
}
 
  