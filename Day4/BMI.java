import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double weight = scan.nextDouble();
        double height = scan.nextDouble();
        double bmi = weight/(height*height);

        String result = (bmi < 25 || bmi > 18) ? "Healthy" : "Not Healthy";
        System.out.println(result);

        // if(bmi < 25 && bmi > 18){
        //     System.out.println("Healthy");
        // }
        // else if(bmi > 25 && bmi < 30){
        //     System.out.println("Overweight");
        // }
        // else if(bmi > 30){
        //     System.out.println("Obiesity");
        // }
        // else if(bmi < 18){
        //     System.out.println("UnderWait");
        // }
    }
}
