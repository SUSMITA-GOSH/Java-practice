public class Pattern1 {
     public static void main(String[] args) {
        int n=Integer.parseInt(args[0]);
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                  // System.out.print("* ");
                
                 // System.out.print((char)(j+65)+" ");
                  if((i+j)%2==0)
                  System.out.print("0 ");
                  else
                  System.out.print("1 ");

            }
            System.out.println();
        }
     }
}
