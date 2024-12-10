public class exception {

    static void demo(){
        try {
            throw new NullPointerException("demo");
        } catch (NullPointerException e) {
            System.out.println("caught exception ");
            throw e;
        }
    }
    public static void main(String[] args) {
        try {
            demo();
        } catch (NullPointerException e) {
            System.out.println("recought:"+e);
        }
    }
    
}
