import java.util.*;

public class prac1{
    public static void main(String[] Args){
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>(2);
        l1.add(12);
        l1.add(13);
        l2.add(22);
        l2.add(23);
        l2.add(24);
        l1.add(0,13);
        l1.add(0,10);
        l1.addAll(0,l2);
        l1.remove(2);
        System.out.println(l1.contains(99));
        System.out.println(l2.contains(11));
        System.out.println(l2.contains(22));
        System.out.println(l1.indexOf(13));
        System.out.println(l2.indexOf(13));
        ArrayList<Integer>l4 = new ArrayList<>(Arrays.asList(1,2,3));
        //ArrayList<Integer> l4 = new ArrayList<>(l2);
        l4.addAll(1,l2);

        for(int i = 0;i<l1.size(); i++){
            System.out.print(l4.get(i));
            System.out.print(", ");

        }
    }
}
