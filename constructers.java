class info{
    private String name;
    private int age;
    private int height;
    public void setName(String n){
        this.name = n;
    }
    public String getName(){
        return this.name;
    }
    public void setAge(int a){
        this.age = a;
    }
    public int getAge(){
        return this.age;
    }
    public void setHeight(int h){
        this.height = h;
    }
    public int getHeight(){
        return this.height;
    }
    public info(String x, int y, int z){
        name = x;
        age = y;
        height = z;
    }
}

public class constructers {
    public static void main(String[] args) {
        info details = new info("daisy", 20, 157 );
        System.out.println(details.getName());
        System.out.println(details.getAge());
        System.out.println(details.getHeight());
    }
}
