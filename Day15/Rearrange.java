package Day15;
public class Rearrange {
    public static void main(String[] args) {
        int arr[] = {1, 2, -1, 5, -6, -11};

        int temp1[] = new int[arr.length];
        int temp2[] = new int[arr.length];

        int ans[] = new int[arr.length];

        int k = 0;
        int l = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] > 0){
                temp1[k++] = arr[i];
            }
            else{
                temp2[l++] = arr[i];
            }
        }

        k = 0;
        l = 0;
        for(int i=0; i<ans.length; i++){
            if(i % 2 == 0){
                ans[i] = temp1[k++];
            }
            else{
                ans[i] = temp2[l++];
            }
        }

        for(int i=0; i<ans.length; i++){
            System.out.print(ans[i]+" ");
        }
        System.out.println();

    }
}
 