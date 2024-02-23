package Day18;

class A{
    int a;
    A(){
        System.out.println("DCA");
    }

    A(int a){
        System.out.println("PCA");
    }
}

class B extends A{
    B(int a){
        super(a);
        System.out.println("PCB");
        this.a = 30;
    }
}

public class Inheritence {

    public static void main(String[] args) {
        B obj = new B(10);
        final int x = 100;
        System.out.println(obj.a);
    }
}
