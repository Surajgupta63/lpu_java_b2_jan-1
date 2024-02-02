package Day9;
import java.util.Scanner;

public class QS {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows:");
        int r = sc.nextInt();
        System.out.println("Enter number of columns:");
        int c = sc.nextInt();

        int arr[][] = new int[r][c];

        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        boolean[] zeroRows = new boolean[r];
        boolean[] zeroCols = new boolean[c];

        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                if(arr[i][j] == 0){
                    zeroRows[i] = true;
                    zeroCols[j] = true;
                }
            }
            
        }

        for(int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++) {
                if(zeroRows[i] || zeroCols[j]) {
                    arr[i][j] = 0;
                }
            }
        }

        System.out.println("Updated Matrix: ");
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
        
    }
}
