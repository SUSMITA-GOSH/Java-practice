

class Box{
    double width;
    double height;
    double depth=10;
    Box(){
        System.out.println("This is box");
        width=100;
        height=45;
        depth=10;
    }
    Box(double height,double width,double d){
        System.out.println("This is box");
        this.width=width;
        this.height=height;
        d=depth;
    }


    double volume(){
        return width*height*depth;
    }
}

public class ExamP {
    public static void main(String[] args) {
        Box mybox=new Box();
        System.out.println(mybox.volume());
        Box mybox1=new Box(23,54,67);
        System.out.println(mybox1.volume());
    }
    
}
