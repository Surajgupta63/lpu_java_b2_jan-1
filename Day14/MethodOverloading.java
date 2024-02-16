public class MethodOverloading {

    // public static int sum(int a, int b){
    //     return a + b;
    // }
    // public static int sum(int a, int b, int c){
    //     return a + b + c;
    // }
    // public static double sum(int a, double b){
    //     return a + b;
    // }
    // public static double sum(double a, double b, double c){
    //     return a + b + c;
    // }
    // public static int sum(int a, int b, int c, int d){
    //     return a + b + c + d;
    // }

    public static int max(int a, int b){
        return a>b ? a : b;
    }
    public static int max(int a, int b, int c){
        return (a > b && a > c) ? a : (b > c && b > a) ? b : c;
    }
    public static int max(int a, int b, int c, int d){
        return (a > b && a > c && a > d) ? a : (b > a && b > c && b > d) ? b : (c > a && c > b && c > d) ? c : d;
    }

    public static void main(String[] args) {
        int ans1 = max(2, 3);
        int ans2 = max(2, 8, 5);
        int ans3 = max(2, 8, 5, 20);
        
        System.out.println(ans1);
        System.out.println(ans2);
        System.out.println(ans3);
    }
}
