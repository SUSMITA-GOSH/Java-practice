interface StringFun {
    String Fun(String s);
}

class MyString {
    // Method to reverse a string
    static String reverse(String str) {
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }
        return result;
    }
}

public class LamdaAsArgument {

    // Method that accepts a lambda expression as an argument
    static String stringOp(StringFun sf, String s) {
        return sf.Fun(s);
    }

    public static void main(String[] args) {
        String instr = "lambdas Added to java";
        // Using method reference for MyString::reverse
        String outstr = stringOp(MyString::reverse, instr);
        System.out.println("Original String: " + instr);
        System.out.println("Reversed String: " + outstr);
    }
}
