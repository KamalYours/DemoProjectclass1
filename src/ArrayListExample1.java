import java.util.ArrayList;

public class ArrayListExample1 {

    public void demo(){
        ArrayList<String> list = new ArrayList<String>();
        list.add("Komal");
        list.add("Kanta");
        list.add("Shanta");
        list.add("Manta");
        list.add("Hanta");

        for (String var:list){
            System.out.println("Print the name of all the employees..."+var);
        }
    }

    public void demo2(){
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        list2.add(54);
        list2.add(21);
        list2.add(53);
        list2.add(85);

        for (Integer var:list2){
            System.out.println("Prin the marks of all the students...."+var);
        }
    }

    public static void main(String[] args) {
        ArrayListExample1 air = new ArrayListExample1();
        air.demo();
        air.demo2();
    }

}
