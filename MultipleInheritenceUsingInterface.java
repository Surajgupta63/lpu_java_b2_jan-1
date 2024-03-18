
interface M{
    int x = 10;
    void fun();
}

interface N{
    int x = 20;
    void fun();
}

class A implements M, N{ // Multiple Inheritence in Java
    public void fun(){
        System.out.println("Hello, I'm in A");
        System.out.println(M.x); // Ambiguity resolved using fully qualified name
        System.out.println(N.x); // Ambiguity resolved using fully qualified name
        System.out.println(M.super.hashCode());
    }
}

interface O extends M, N{
    int x = 30;
    void fun();
}

class B implements O{ // Multiple inheritence using interface
    public void fun(){
        System.out.println("Hello, I'm in B");
    }
}

public class MultipleInheritenceUsingInterface {
    public static void main(String[] args) {
        A a = new A();
        a.fun();

        B b = new B();
        b.fun();
    }
}
