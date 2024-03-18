
interface Shape{
    int x = 10; // by Default public, static and final

    double getSquare(double r); // by default public and abtstract
}

class Circle implements Shape{

    public double getSquare(double r){
        return r*r;
    }

    void fun(){
        System.out.println("Hello Interface..");
    }
}

public class InterfacesClass {
    public static void main(String[] args) {
        Circle c = new Circle();
        System.out.println(c.getSquare(5));
        c.fun();
    }
}
