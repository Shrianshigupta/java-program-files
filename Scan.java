import java.util.Scanner;
class Scan
{
 public static void main(String ar[])
{
 Scanner sc=new Scanner(System.in);
 System.out.println("ENTER FIRST NUMBER");
 int a= sc.nextInt();
 System.out.println("ENTER SECOND NUMBER");
 int b= sc.nextInt();
 int c=a+b;
 System.out.println("THE SUM IS "+c);
 }
}