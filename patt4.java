public class patt4 {
    public static void main(String[] args) {
        int n=Integer.parseInt(args[0]);
        //for(int i=n;i>=1;i--)
        int num=1;
        for(int i=1;i<=n;i++)

        {
            for(int j=1;j<=n-i;j++)
            {
                  // System.out.print("* ");
                  //System.out.print((char)(j+65));
                 System.out.print(" ");

            }/* */
            for(int j=1;j<=i;j++)
            {
                //System.out.print(" "+(char)(j+64));
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
     }
}
