class method{
    int Salary;
    String name;
    String new_name;
    public int getSalary(){
        System.out.println("MY SALARY IS : "+Salary);
    return Salary;}

    public void changeName(){
        name = new_name;
        System.out.println("MY NEW NAME IS :"+name);
    }

    public String getName(){
        System.out.println("MY NAME IS : "+name);

   return name; }
}


public class prop_meth {
    public static void main(String[] args) {
        method riya = new method();
        riya.Salary = 200000;
        riya.name = "KIM TAEHYUNG";
        riya.new_name = "V";
        riya.getName();
        riya.getSalary();
        riya.changeName();

    }
}
