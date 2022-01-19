import java.util.ArrayList;

public class CollectionExample3 {

    public void displayList(){
        ArrayList list = new ArrayList();
        list.add("Maths");
        list.add("English");
        list.add("Hindi");
        for (Object var:list){
            System.out.println("Print the list.."+var);
        }
    }

    public void displayListWithGenerics(){
        ArrayList<Integer> generic_list = new ArrayList<Integer>();
        generic_list.add(25);
        generic_list.add(46);
        generic_list.add(42);
        for (Integer var:generic_list){
            System.out.println("Print the numbers.."+var);
        }

    }

    public static void main(String[] args) {
        CollectionExample3 air = new CollectionExample3();
        air.displayList();
        air.displayListWithGenerics();
    }

}
