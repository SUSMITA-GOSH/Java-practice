class BlockExam {
    // Instance initializer block
    {
        System.out.println("B1: First Block!");
    }

    int a;
    static int s = 11; // Static variable

    BlockExam(int a) {
        this.a = a;
        System.out.println("B2: Constructor: a = " + a + ", s = " + s);}
       {a = 22;
        s = 33;}
       { System.out.println("B3: a = " + a + ", s = " + s);
       {s+=55;}
    }

    static {
        System.out.println("B4: s = " + s);
      
    }

    public static void main(String args[]) {
        System.out.println("Starting Exam!");
        new BlockExam(30);
        new BlockExam(74);}

       //{ System.out.println("s= "+s );s++;}
       {System.out.println("B5: a="+a+",s="+s);s++;}
        static{
         System.out.println("B6: s = " + s);}
    
}
