 abstract class Shape {
     String colour;

    public Shape(String colour) {
        this.colour = colour;
    }

    public abstract double area();

    public abstract double drawshape();

    public final String getcolour() {
        return this.colour;
    }
}
 class Circle extends Shape {
     double radius;

    public Circle(String colour, double radius) {
        super(colour); // Call the constructor of the superclass Shape
        this.radius = radius; // Initialize the radius
    }

    @Override
    public double area() {
        // Calculate and return the area of the circle
        return Math.PI* radius * radius;
    }

    @Override
    public double drawshape() {
        // Print the drawing details and return the area
        double area = area();
        System.out.println("Circle with " + getcolour() + " color, " + radius + " radius and " + area + " area drawn in the Canvas.");
        return area;
    }
}
public class Practice3 {
    public static void main(String[] args) {
        System.out.println("Main Application Started.");

        Circle redCircle = new Circle("Red", 50.0);
        System.out.println("Circle Color = " + redCircle.getcolour());
        System.out.println("Circle Area = " + redCircle.area());

        Circle greenCircle = new Circle("Green", 33.0);
        greenCircle.drawshape();

        System.out.println("Main Application Ended.");
    }
}
