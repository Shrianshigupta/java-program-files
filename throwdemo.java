class throwdemo
{
 void get(int n)
 {
  if(n<15)
   {
    throw new ArithmeticException("Not valid");
   }
 }
 public static void main(String ar[])
  { 
   throwdemo td=new throwdemo();
   td.get(10);
  }
 }