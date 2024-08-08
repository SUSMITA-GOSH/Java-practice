public class Patt2 {
    public static void main(String[] args) {
       // int n=Integer.parseInt(args[0]);
        //for(int i=n;i>=1;i--)
        int n=4;
        for(int i=1;i<=n;i++)
        {
            //for(j=1;j<=n-i;j++)
            for(int j=n-i;j>=1;j--)
            {
                  // System.out.print("* ");
                 // System.out.print((char)(j+65));
                 System.out.print("  ");


            }
            for(int j=1;j<i;j++)
            {
                //System.out.print("* ");
                if(j==1||i==n)
                System.out.print((char)(j+64)+" ");
               else System.out.print("  ");
            }
            for(int j=1;j<=i;j++)
            {
                //System.out.print("* ");
                if(j==i||i==n)
                System.out.print((char)(j+64)+" ");
                else
                System.out.print("  ");

            }
            System.out.println();
        }
     }
}
