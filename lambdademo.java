interface lambda
{
 void get();
}
class lambdademo
{
 public static void main(String ar[])
 {
  lambda l=()->{
   System.out.println("NO ARGUMENT LAMBDA EXPRESSION DEMO");
  };
 l.get();
 }
}