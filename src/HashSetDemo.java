import java.util.HashSet;

public class HashSetDemo {

    void demo(){
        HashSet<String> stringHashSet = new HashSet<String>();
        stringHashSet.add("Ronak");
        stringHashSet.add("Akash");
        stringHashSet.add("Himanshi");
        stringHashSet.add("Ronak");

        for (String var:stringHashSet){
            System.out.println("Print the name,,,,"+var);
        }
    }

    void demo2(){
        HashSet<Integer> integerHashSet = new HashSet<Integer>();
        integerHashSet.add(54);
        integerHashSet.add(56);
        integerHashSet.add(58);
        integerHashSet.add(54);

        for (Integer var:integerHashSet){
            System.out.println("Print the numbers..."+var);
        }
    }

    void demo3(){
        HashSet<Float> floatHashSet = new HashSet<Float>();
        floatHashSet.add(54.56f);
        floatHashSet.add(56.54f);
        floatHashSet.add(58.52f);
        floatHashSet.add(58.52f);

        for (Float var :floatHashSet){
            System.out.println("Print the float ..."+var);
        }
    }

    void demo4(){
        HashSet<Long> longHashSet = new HashSet<Long>();
        longHashSet.add(321654987l);
        longHashSet.add(789456123l);
        longHashSet.add(789456123l);

        for (Long var : longHashSet){
            System.out.println("Print the long numbers..."+var);
        }
    }

    public static void main(String[] args) {
        HashSetDemo air = new HashSetDemo();
        air.demo();
        air.demo2();
        air.demo3();
        air.demo4();
    }
}
