package Day7;
import java.util.Scanner;

public class ArrayTut {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            System.out.println("Enter value: ");
            int x = sc.nextInt();
            arr[i] = x;
        }
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
        }
        double avg = sum/arr.length;
        System.out.println(avg);
        sc.close();
    }
}
