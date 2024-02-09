package Day12;
import java.util.Scanner;

public class NonRepeatingString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str = sc.nextLine();

        // Brute Force TC => O(n*n) SC => O(1)
        int index = -1;
        for(int i=0; i<str.length(); i++){
            boolean flag = true;
            for(int j=0; j<str.length(); j++){
                if(i != j && str.charAt(i) == str.charAt(j)){
                    flag = false;
                    break;
                }
            }
            if(flag){
                index = i;
                break;
            }
        }
        System.out.println(index);



        // Optimise Solution TC => O(n) SC => O(1)
        // int countChar[] = new int[256];
        // for(int i=0; i<str.length(); i++){
        //     char ch = str.charAt(i);
        //     countChar[ch]++;
        // }

        // int index = -1;
        // for(int i = 0; i<str.length(); i++){
        //     if(countChar[str.charAt(i)] == 1){
        //         index = i;
        //         break;
        //     }
        // }
        // System.out.println(index);
        sc.close();
    }
}
