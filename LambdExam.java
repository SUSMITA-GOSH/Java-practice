 interface MyFunc<T> { 
    T func(T t); 
}
 class MyArrayOps {
     static <T> T val(T v) { return v; }
 }
   class LambdaExam {
     static <T> T myOp(MyFunc<T> f, T v) { return f.func(v); }
    public static void main(String[] args) {
        int i= 10;
         MyFunc<String> d = str -> str +str;
         System.out.println(d.func("Lambda"));
        MyFunc<Integer> f = (n) -> { System.out.println(n + i); return n * n*i; };
        System.out.println(f.func(3));
        var value = myOp(MyArrayOps::<Integer>val, 4);
         System.out.println(value);
         System.out.println(myOp(MyArrayOps::<String>val, "Two"));
     }
 }

