class Stats<T extends Number> {
    T[] nums;

    Stats(T[] ob) {
        nums = ob;
    }

    double average() {
        double sum = 0.0; // Use double to accommodate the sum of double values
        for (int i = 0; i < nums.length; i++) { // Start loop from 0 and go up to nums.length - 1
            sum += nums[i].doubleValue(); // Accumulate double values
        }
        return sum / nums.length; // Return the average directly
    }
    boolean isSameAvg(Stats<?>ob)
    {
        if(average()==ob.average())
        return true;
        return false;
    }
    {

    }
}

/**
 * LearnGeneric
 */
class LearnGeneric {
    public static void main(String[] args) {
        Integer[] inums = {1, 2, 3, 4, 5, 5, 6, 6, 7};
        Stats<Integer> iob = new Stats<Integer>(inums);
        double t = iob.average();
        System.out.println(t);

        Double[] dobs = {1.3, 1.5, 1.9, 6.7, 8.4};
        Stats<Double> iob1 = new Stats<Double>(dobs);
        double t1 = iob1.average();
        System.out.println(t1);
        if(iob.isSameAvg(iob1))
        System.out.println("same same");
        else
        System.out.println("same same but diffelent ");
    }
}










