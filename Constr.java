class Constr
 { 
  int x,y;
  
  Constr(int x,int y)
  {
   this.x=x;
   this.y=y;
   System.out.println(x+" "+y);
  }
   public static void main(String ar[])
  {
    Constr c=new Constr(10,20);
  }
} 