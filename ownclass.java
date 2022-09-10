class Employee{
    int id;
    String name;
    int salary;
    public void getDetails(){
        System.out.print("MY NAME IS " +name);
        System.out.println(" AND MY ID IS "+id);
    }
    public int getSalary(){
        System.out.println("M SALARY IS "+salary);
        return salary;
    }
}

public class ownclass {
    public static void main(String[] arg){
        Employee Riya = new Employee();
        Employee Pramod = new Employee();

        Riya.id = 20049;
        Riya.name ="RIYA PRAMODH";
        Riya.salary = 100000;
        Pramod.id = 20050;
        Pramod.name = "SAI PRAMOD VVNS";
        Pramod.salary = 100000;
        Riya.getDetails();
        Riya.getSalary();
        Pramod.getDetails();
        Pramod.getSalary();

    }
}
