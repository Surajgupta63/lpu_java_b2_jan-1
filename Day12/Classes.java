package Day12;
class Person{
    String name;
    int age;
    char gender;

    public String toString(){
        return name+" "+age+" "+gender;
    }
}

public class Classes {
    public static void main(String[] args) {
        Person p = new Person();
        p.name = "Suraj Gupta";
        p.age = 20;
        p.gender = 'M';
        System.out.println(p.toString());
    }
}
