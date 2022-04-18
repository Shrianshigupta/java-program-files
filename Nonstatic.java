class Nonstatic
{
 int x=0;
 Nonstatic()
 {
  x++;
  System.out.println(x);
 }
 public static void main(String ar[])
 {
  Nonstatic ns1=new Nonstatic();
  Nonstatic ns2=new Nonstatic();
  Nonstatic ns3=new Nonstatic();
 }
} 