 class Switch
   {
    public static void main(String ar[])
     { 
       int x=10,y=20;
       String choose="minus";
       switch(choose)
        {
          case"plus":
          {
           System.out.println(x+y);
           break;
          }
         case"minus":
          { 
           System.out.println(x-y);
           break;           
          }
        }
     }
  }            