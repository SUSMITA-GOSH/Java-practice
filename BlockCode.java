interface numaric{
    int test(int n);
}
public class BlockCode {
    public static void main(String[] args) {
        numaric num= (n) ->
        {
            int sum=1;
            for(int i=1;i<=n;i++)
            {
                sum=sum*i;

            }
            return sum;
        };
        System.out.println(num.test(5));
        System.out.println(num.test(8));
    }
    
}
