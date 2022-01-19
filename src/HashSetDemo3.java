import java.util.HashSet;

public class HashSetDemo3 {

    public void demo3() {
        HashSet<String> stringHashSet3 = new HashSet<String>();
        stringHashSet3.add("Manoj");
        stringHashSet3.add("Kamal");
        stringHashSet3.add("Nitish");
        stringHashSet3.add("Manoj");
        stringHashSet3.add("Nitish");

        for (String var : stringHashSet3) {
            System.out.println("Print the string name....=" + var);
        }
    }

    public void demo2(){

        HashSet<Integer> integerHashSet = new HashSet<Integer>();
        integerHashSet.add(21);
        integerHashSet.add(54);
        integerHashSet.add(21);

        for (Integer var:integerHashSet){
            System.out.println("Print the integers...="+var);
        }
    }

    public static void main(String[] args) {
        HashSetDemo3 air = new HashSetDemo3();
        air.demo3();
        air.demo2();
    }
}