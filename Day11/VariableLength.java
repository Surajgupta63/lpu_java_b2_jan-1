package Day11;
public class VariableLength {

    int Max(int... v){
        int maxi = -1;
        // for(int e: v){
        //     maxi = Math.max(maxi, e);
        // }
        for(int i=0; i<v.length; i++){
            maxi = Math.max(maxi, v[i]);
        }
        return maxi;
    }
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        int c = 4;
        int d = 1;
        VariableLength obj = new VariableLength()
;       int maxi = obj.Max(a,b,c,d);
        System.out.println(maxi);
    }
}
