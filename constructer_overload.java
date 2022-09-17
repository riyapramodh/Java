import java.sql.SQLOutput;

class details{
    private String name;
    private int salary;
    public void setName(String n){
        name  = n ;
    }
    public String getName(){
        return this.name;
    }
    public void setSalary(int s){
        salary = s;
    }
    public int getSalary(){
        return this.salary;
    }
    public details(String myName){
        name = myName;
    }
    public details(int mySalary){
        salary = mySalary;
    }
    public details(String myName, int mySalary){
        name = myName;
        salary = mySalary;
    }
}

public class constructer_overload {
    public static void main(String[] args) {
        details info1 = new details("DIANA");
        System.out.println(info1.getName());
        details info2 = new details(200000);
        System.out.println(info2.getSalary());
        details info3 = new details("ROSE", 2300000);
        System.out.println(info3.getName());
        System.out.println(info3.getSalary());
    }
}
