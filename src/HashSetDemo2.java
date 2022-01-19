import java.util.HashSet;

public class HashSetDemo2 {

    public void demo (){
        HashSet<String> stringHashSet = new HashSet<String>();
        stringHashSet.add("Loki");
        stringHashSet.add("Pawan");
        stringHashSet.add("Loki");

        for (String var:stringHashSet){
            System.out.println("Print the name...."+var);
        }
    }

    public void demo2(){
        HashSet<Integer> integerHashSet = new HashSet<Integer>();
        integerHashSet.add(52);
        integerHashSet.add(96);
        integerHashSet.add(45);
        integerHashSet.add(84);
        integerHashSet.add(42);
        integerHashSet.add(96);

        for (Integer var : integerHashSet){

            System.out.println("Print the integer ..."+var);
        }
    }

    public void demo3(){
        HashSet<Float> floatHashSet = new HashSet<Float>();
        floatHashSet.add(52.23f);
        floatHashSet.add(54.26f);
        floatHashSet.add(52.23f);
        floatHashSet.add(54.23f);
        for (Float var:floatHashSet){
            System.out.println("Print the float..."+var);
        }
    }

    public static void main(String[] args) {
        HashSetDemo2 air = new HashSetDemo2();
        air.demo();
        air.demo2();
        air.demo3();
    }
}