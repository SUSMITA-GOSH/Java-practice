class test{
    public static void main(String[] args) {
        String p1=args[0];
          
         int a=Integer.parseInt(p1) ;
         System.out.println(a);
         for(int i=1;i<=a;i++)
         {
            for(int j=a-i;j>=1;j--)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=5;j++)
            {
                if(i==1||i==a||j==1||j==a)
                System.out.print("*");
                else
                System.out.print(" ");
            }
            System.out.println();
         }
        
    }    }
