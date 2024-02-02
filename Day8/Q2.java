package Day8;


import java.util.Scanner;
// Given an integer array of size 'n' with elements ranging from [1, n]. 
// Due to an error, one element got repeated, and another got erased. 
// Print the repeated element and the erased element.

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // 1st Approach
        /* 
        int r = 0;
        int m = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    r = arr[i];
                    break;
                }
            }
            if (r != 0) {
                break;
            }
        }

        for (int i = 1; i <= n; i++) {
            boolean f = false;
            for (int j = 0; j < n; j++) {
                if (i == arr[j]) {
                    f = true;
                    break;
                }

            }
            if (f == false) {
                m = i;
                break;
            }
        }

        System.out.println("Repeated Number = " + r + " Missing Number = " + m);
        */

        // 2nd Approach
        
        int freq[] = new int[n+1];
        int rep = 0;
        for(int i=0; i<n; i++){
            freq[arr[i]]++;
            if(freq[arr[i]] == 2){
                rep = arr[i];
            }
        }

        int mis = 0;
        for(int i=1; i<freq.length; i++){
            if(freq[i] == 0){
                mis = i;
                break;
            }
        }

        System.out.println("Repeated Number = " + rep + " Missing Number = " + mis);

        sc.close();

    }


    
}
