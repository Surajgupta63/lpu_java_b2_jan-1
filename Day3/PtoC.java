package Day3;

class Suraj{
    String name;
    int age;

    Suraj(String name, int age){
        this.name = name;
        this.age = age;
    }
}

public class PtoC {
    public static void main(String[] args) {
        Suraj s = new Suraj("Suraj", 20);
        System.out.println(s.name + " " + s.age);
    }
}
