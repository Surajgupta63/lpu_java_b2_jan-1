package Day25;

interface Increment{
    int incr(int x);
}

public class  lamda implements Runnable {
    public void run(){
        System.out.println("Run Runnable Thread");
    }
    public static void main(String[] args) {
        Thread t = new Thread(new lamda());
        t.start();
        System.out.println("Main Runnable Thread");

    }
    
}
// public class  lamda extends Thread {
//     public void run(){
//         System.out.println("Run Thread");
//     }
//     public static void main(String[] args) {
//         Thread t = new Thread(new lamda());
//         t.start();
//         System.out.println("Main Thread");

//     }
    
// }


// public class lamda implements Increment{
//     public static void main(String[] args) {
//         Increment obj = (int x) -> (x+1); //this is lamda expression
//         System.out.println(obj.incr(34));
//     }
// }
