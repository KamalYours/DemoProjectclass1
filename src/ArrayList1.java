import java.util.ArrayList;

public class ArrayList1 {

    public void demo(){
        ArrayList<String> list = new ArrayList<String>();
        list.add("Manoj");
        list.add("Kanishk");
        list.add("Anjali");

        for (String var:list){
            System.out.println("Print the name ,,,"+var);
        }
    }
    public void demo2(){
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        list2.add(21);
        list2.add(54);
        list2.add(85);

        for (Integer var:list2){
            System.out.println("Print the int,,,"+var);
        }
    }

    public static void main(String[] args) {
        ArrayList1 air = new ArrayList1();
        air.demo();
        air.demo2();
    }
}
