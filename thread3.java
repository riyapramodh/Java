class piku extends Thread{
    public void run(){
        for(int i = 1; i<10; i++){
            System.out.println("PIIKKUU");
        }
    }
        }
class boo extends Thread{
    //public void run(){
     //   for(int i = 0;i<10;i++){
     //       System.out.println("PEEKKAABBOO");
     //   }
    //}
}

public class thread3 {
    public static void main(String[] args) {
        piku p = new piku();
        boo b = new boo();
        p.start();
        b.start();
        b.setPriority(2);
        p.setPriority(10);
        System.out.println(b.getPriority());
        System.out.println(p.getPriority());
        System.out.println(p.getState());
    }
}
