interface annonymousdemo
{
 void get();
}
class annonyinterface
{
 public static void main(String ar[])
 {
  annonymousdemo ad=new annonymousdemo(){
   public void get()
   {
     System.out.println("Get method called");
   }
  };
  ad.get();
 }
}