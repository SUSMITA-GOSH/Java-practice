class stats<T extends Number>
{
    T[] val;
    stats(T[] o)
    {
         val=o;
    }
    double avg()
    {
        double sum=0.0;
        for(int i=0;i<val.length;i++)
        {
            sum +=val[i].doubleValue();
        }
        return sum/val.length;
    }
    boolean issameavg(stats<?>ob)
    {
        if(avg()==ob.avg())
        return true;
        return false;
    }

}


public class Generic {
    public static void main(String[] args) {
        Integer[] inums={1,2,3,4,5,7,8,9};
        stats<Integer> ion=new stats<Integer>(inums);
        double v=ion.avg();
        System.out.println(v);
        Double[] dums={4.4,5.5,7.7,8.7,8.9};
        stats<Double> ion1=new stats<Double>(dums);
        double v1=ion1.avg();
        System.out.println(v1);
        if(ion.issameavg(ion1))
        System.out.println("Average are same");
        if(!ion.issameavg(ion1))
        System.out.println("Average are not same");
        
    }
    
}
