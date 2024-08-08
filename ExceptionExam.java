class ExceptionGenerator{


static void a()
{
    throw new ArithmeticException();
}
static  void b()
{
    throw new NullPointerException();
}
static  void c()
{
    throw new ArrayIndexOutOfBoundsException() ;
    
}
static void d()
{
    System.out.println("Null value exception :Null value ");
}


}
class NullValueException extends Exception{
    int n;
    public  NullValueException(int n)
    {
        this.n=n;
    }
    public String toString()
    {
        return "Null value Exception : NullvalueException"+ " "+n;
    }

}





public class ExceptionExam {

    public static void main(String[] args) {
        int n = args.length;
        System.out.println("total Exception=" + n);
        try {
            if (n == 0)
                ExceptionGenerator.a();
            if (n == 1)
                ExceptionGenerator.b();
            try {
                if (n == 2)
                    ExceptionGenerator.c();
                if (n == 3)
                    ExceptionGenerator.d();
                else
                    throw new NullValueException(n);

            } catch (ArrayIndexOutOfBoundsException ex) {
                System.out.println("Exception is=" + " " + ex);
            }
        } catch (ArithmeticException | NullPointerException ex) {
            System.out.println("Exeption is=" + " " + ex);
        } catch (NullValueException ex) {
            System.out.println(ex);
        } catch (Exception ex) {
            System.out.println(ex);
        }
        System.out.println("Exam Ended");
    }

} 