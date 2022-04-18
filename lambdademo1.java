interface onevarlambda
{
 void get(String name);
}
class lambdademo1
{
 public static void main(String ar[])
 {
  onevarlambda ol=(Name)->{
    System.out.println("ONE VARIABLE LAMBDA EXPRESSION");
   };
  ol.get("SHRIANSHI");
 }
}