

class A{
    int x;
    public void meth1(){
        System.out.println("meth1 of class A");
    }
    public void meth2(){
        System.out.println("meth2 of class A");
    }
}
class B extends A{
    public void meth2(){
        System.out.println("meth2 of class B");
    }
    public void meth3(){
        System.out.println("meth3 of class B");
    }
}


public class overriding {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        a.meth2();
        b.meth2();
    }
}
