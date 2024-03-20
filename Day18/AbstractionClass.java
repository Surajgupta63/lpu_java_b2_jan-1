package Day18;


abstract class Car{ // We can not instantiate an abstarct class, which means we cannot create objects of an abstract class.
    int maxSpeeed;
    abstract void accelerate(); //Only Declared but not implemented - it is wothout a body
    // They are created to force the child classes to implement them before using. We will use them after overriding. 
    abstract void breake();
}

abstract class BMW extends Car{
    void accelerate(){
        System.out.println("The Car is Accelerating...");
    }
}

class BMW2 extends BMW{
    void breake(){
        System.out.println("The Car is Applying Breake");
    }
}

abstract class A{ // An Abstract class can exist without abtract methods.
    // We Simply Mean we will not create the object[intantiate] of this class.
    // This is called non-abstarct class or Concrete class.
    
    int x = 10;
    void func(){
        System.out.println("Hello, I'm a A");
    }
}

public class AbstractionClass {
    public static void main(String[] args) {
        // Car c = new Car(); // We cannot instantiate an abstract class.
        // BMW b = new BMW();
        // b.accelerate();
        BMW2 b2 = new BMW2();
        b2.accelerate();
        b2.breake();
    }

}
