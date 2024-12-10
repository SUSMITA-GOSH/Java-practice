
class ThrowsDemo {
    // Method that throws an IllegalAccessException
    static void throwOne() throws IllegalAccessException {
        System.out.println("inside throwOne");
        throw new IllegalAccessException("Demo Exception");
    }

    public static void main(String[] args) {
        try {
            throwOne();
        } catch (IllegalAccessException e) {
            System.out.println("Caught: " + e);
        }
    }
}







