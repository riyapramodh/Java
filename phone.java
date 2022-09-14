import java.util.Scanner;
class cellPhone{
    public void ringing(){
        System.out.println("ringing");
    }
    public void vibrating(){
        System.out.println("vibrating");
    }
    public void silent(){
        System.out.println("silent");
    }
    public void doNotDisturb(){
        System.out.println("do not disturb");
    }
}

public class phone {
    public static void main(String[] args) {
        System.out.println("THE MODES OF A CELLPHONE ARE:");
        System.out.println("PLEASE PRESS A BUTTON 1 2 3");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        cellPhone apple = new cellPhone();
        if(n==1){
            apple.ringing();
        } else if (n == 2) {
            apple.doNotDisturb();
        }
        else if(n==3){
            apple.silent();
        }
        else if(n==4){
            apple.vibrating();
        }
        else{
            System.out.println("no mode displayed");
        }




    }
}
