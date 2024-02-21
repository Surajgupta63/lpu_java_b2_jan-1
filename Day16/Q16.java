package Day16;

public class Q16 {
    public static void main(String[] args) {
        int arr[] = {1,2, 3, 3,3, 23, 89,89,89, 89,89,89};
        int n = 12;
        int freq[] = new int[100000];

        for(int i=0; i<n; i++){
            freq[arr[i]]++;
        }

        for(int i=0; i<n; i++){
            if(freq[arr[i]] >= n/2){
                System.out.print(arr[i]+" ");
            }
        }

    }
}
