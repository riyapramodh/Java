class Phone{
    public void start(){
        System.out.println("starting the phone");
    }
    public void welcome(){
        System.out.println("welcome to the phone");
    }
}
class smartPhone extends Phone{
    public void on(){
        System.out.println("the smart phone is switching on");
    }
    public void welcome(){
        System.out.println("welcome to the smart phone");
    }
}

public class dynamic_method {
    public static void main(String[] args) {
        Phone obj = new smartPhone();
        obj.start();
        obj.welcome();
        // using dynamic method, we get to print the overwritten value of a similar named method stored in Smartphone
        //and not prints the value in Phone since it is the reference,and it stores the object smartPhone
        //other methods in smartPhone cant be run by this method but only the method overwritten ones
    }


}
