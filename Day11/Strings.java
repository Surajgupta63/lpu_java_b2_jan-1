package Day11;
public class Strings {
    public static void main(String[] args) {
        // String is Immutable once it is created it will not modified 
        // and all the method which is applied on it that return new String  
        // String name = "Suraj";
        // name = name.toLowerCase();
        // System.out.println(name);

        // String s = "Suraj"; // name and s reffering same string pool or same memmoery addresses
        // String s1 = new String("SURAJ");
        // if(name == s1){ // this is compare addresses of that
        //     System.out.println("same same");
        // }
        // else{
        //     System.out.println("same same but different");
        // }
        // if(name.equals(s1)){ // this is compare values of that
        //     System.out.println("same same");
        // }
        // else{
        //     System.out.println("same same but different");
        // }
        // if(name.equalsIgnoreCase(s1)){ // this is compare values of that ignoring case sensitivity
        //     System.out.println("same same");
        // }
        // else{
        //     System.out.println("same same but different");
        // }

        StringBuilder str1 = new StringBuilder("Suraj");
        str1.append(" Gupta");
        System.out.println(str1);
        StringBuffer str2 = new StringBuffer("Suraj");
        str2.append("Gupta");
        System.out.println(str2);
    }
}
