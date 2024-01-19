import java.util.Scanner;

public class EvenAndOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        String result = (num & 1) != 0 ? "Number is odd" : "Number is even";
        System.out.println(result);
        sc.close();
        
    }
}
