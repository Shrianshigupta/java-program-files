interface twovarlambda
{
 void get(int x,int y);
}
class lambdademo2
{
 public static void main(String ar[])
 {
  twovarlambda tl=(a,b)->{
    System.out.println("TWO VARIABLE LAMBDA EXPRESSION");
   };
  tl.get(20,30);
 }
}