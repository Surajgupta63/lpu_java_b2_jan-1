package Day8;
import java.util.Scanner;


public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0 ;i<n; i++){
            arr[i] = sc.nextInt();
        }

        int r = 0;
        int m = 0;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i] == arr[j]){
                    r = arr[i];
                    break;
                }
            }
            if( r != 0){
                break;
            }
        }

        
        for(int i=1; i<=n; i++){
            boolean f = false;
            for(int j=0; j<n; j++){
                if(i == arr[j]){
                    f = true;
                    break;
                }
                
            }
            if(f == false){
                m = i;
                break;
            }
        }

        System.out.println("Repeated Number = " + r + " Missing Number = " + m);
        sc.close();
    }
}
