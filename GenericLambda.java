interface MaxIF<T extends Comparable<T>> {
    T max();
}

 class MyGenClass<T extends Comparable<T>> implements MaxIF<T> {
    T[] nums;

    MyGenClass(T[] o) {
        nums = o;
    }

    void showTypes() {
        System.out.println("Type of T is " + nums.getClass().getComponentType().getName());
    }

    @Override
    public T max() {
        T val = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i].compareTo(val) > 0) {
                val = nums[i];
            }
        }
        return val;
    }
}







public class GenericLambda {
   public static void main(String[] args) {
       Integer[] inums = {3, 6, 2, 8, 6};
       Character[] chs = {'b', 'r', 'p', 'w'};

       MyGenClass<Integer> iob = new MyGenClass<>(inums);
       iob.showTypes();

       MyGenClass<Character> cob = new MyGenClass<>(chs);
       cob.showTypes();

       MaxIF<Integer> maxInt = iob;
       System.out.println("Max value in inums: " + maxInt.max());

       MaxIF<Character> maxChr = cob;
       System.out.println("Max value in chs: " + maxChr.max());
   }
}

