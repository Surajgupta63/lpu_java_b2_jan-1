package Day12;


public class StringBulider {
    public static void main(String[] args) {
        StringBuilder str1 = new StringBuilder("Suraj");
        StringBuilder str2 = new StringBuilder("Suraj");
        // if(str1 == str2){
        //     System.out.println("same");
        // }
        // else{
        //     System.out.println("not same");
        // }
        if(str1.compareTo(str2) == 0){  // str1 == str => 0 , str1 > str2 => +ve , str1 < str2 => -ve
            System.out.println("same");
        }
        else{
            System.out.println("not same");
        }
        // if(str1.toString().equals(str2.toString())){
        //     System.out.println("same");
        // }
        // else{
        //     System.out.println("not same");
        // }
        // if(str1.equals(str2)){
        //     System.out.println("same");
        // }
        // else{
        //     System.out.println("not same");
        // }
    }
}
