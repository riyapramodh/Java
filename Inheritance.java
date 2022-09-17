class dog{
    int legs;
    int tail;
    int head;
    public void setLeg(int l){
        legs = l;
    }
    public int getLeg(){
        return this.legs;
    }
    public void setTail(int t){
        this.tail = t;
    }
    public int setTail(){
        return this.tail;
    }

    public int getTail() {
        return tail;
    }

    public int getHead() {
        return head;
    }

    public void setHead(int h) {
        this.head = h;
    }
}
class retriever extends dog{
    int age;

    public int getAge() {
        return age;
    }

    public void setAge(int a) {
        this.age = a;
    }
}

public class Inheritance {
    public static void main(String[] args) {
        retriever r = new retriever();
        r.setLeg(4);
        System.out.println("no of legs : "+r.getLeg());
        r.setTail(1);
        System.out.println("no of tail : "+r.getTail());
        r.setHead(1);
        System.out.println("no of head : "+r.getHead());
        r.setAge(12);
        System.out.println("the age : "+r.getAge());
    }
}
