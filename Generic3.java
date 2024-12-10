 class GenCons{
     double val;
    <T extends Number> GenCons(T arg)
    {
        val=(double) arg;
    }
    void show(){
        System.out.println("val  "+val);
    }
 }
 
 ;
 
 
 
 
 
 
 class Generic3 {
    static<T extends Comparable<T> ,v extends T> boolean isIn(T x, v[] y){
    
    for(int i=0;i<y.length;i++)
    {
        if(x.equals(y[i]))
        return true;
    }
    return false;
    
    }

    public static void main(String[] args) {
        Integer[] num={4,6,8,9,9};
        if(isIn(2, num))
        System.out.println("found");
        else
        System.out.println("not found");
        String[] inum={"two","one"};
        if(isIn("two", inum))
        System.out.println("found");
        GenCons val1=new GenCons(100);
         val1.show();
         GenCons val2=new GenCons(100.5F);
         val2.show();
    }

}
