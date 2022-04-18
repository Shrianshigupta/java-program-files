 class Sum
   {
     int r;
     void get(int p,int q)
     {
      r=p+q;
      System.out.println("The sum is"+r);      
     }
   public static void main(String ar[])
     {
        Sum s=new Sum();
        s.get(10,20);
     }
}