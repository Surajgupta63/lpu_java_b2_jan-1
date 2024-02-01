
import java.util.*;

public class Duplicate {

    public static boolean check(int arr[], int n){
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i] == arr[j]){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0 ;i<n; i++){
            arr[i] = sc.nextInt();
        }

        if(check(arr, n)){
            System.out.println("Yes Duplicate");
        }
        else{
            System.out.println("No Duplicate");
        }
        sc.close();
        

    }
}
