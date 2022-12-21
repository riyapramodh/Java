class RHM extends Thread {
    public void run() {
        for (int i = 1; i < 100; i++) {
            System.out.println("Goodmorning");
        }
    }
}
class MHR extends Thread {
        public void run() {
            try{
                Thread.sleep(200);
            }
            catch(Exception e){
                System.out.println(e);
            }
            for (int i = 1; i < 100; i++) {
                System.out.println("Welcome");
            }
        }

    }

    public class thread2{
        public static void main(String[] args) {
            RHM r = new RHM();
            MHR m = new MHR();
            r.start();
            m.start();
        }
    }
