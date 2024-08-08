class Shape {
    int getArea() {
        return 0;
    }
}

class Rectangle extends Shape {
    int length;
    int width;

    Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    @Override
    int getArea() {
        return length * width;
    }
}

class Box extends Rectangle {
    int height;

    Box(int length, int width, int height) {
        super(length, width);
        this.height = height;
    }

    @Override
    int getArea() {
        // If the method returns the volume instead, you should consider a different name, like getVolume.
        return length * width * height;
    }
}

public class Practice2 {
    public static void main(String[] args) {
        Shape a = new Shape();
        System.out.println("Area of shape: " + a.getArea());

        Rectangle r = new Rectangle(9, 8);
        System.out.println("Area of rectangle: " + r.getArea());

        Box b = new Box(8, 9, 10);
        System.out.println("Volume of box: " + b.getArea());
    }
}





