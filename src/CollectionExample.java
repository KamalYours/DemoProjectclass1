import java.util.ArrayList;
import java.util.List;

public class CollectionExample {

    public void displayList(){
        ArrayList obj = new ArrayList();
        obj.add("Shama suhail");
        obj.add(52);
        obj.add("Kamaljeet");

        for(Object var :obj){
            System.out.println("Print the string ...."+var);
        }
    }

    public void displayListWithGenerics(){
        ArrayList<Integer> obj1 = new ArrayList<Integer>();
        obj1.add(52);
        obj1.add(54);
        obj1.add(545);

        for (Integer var :obj1){
            System.out.println("Print the numbers ..."+var);
        }
    }

    public  void displayListWithGenerics1(){
        ArrayList<Long> obj2 = new ArrayList<Long>();
        obj2.add(9560379735L);
        obj2.add(9211022336L);
        obj2.add(8851290200L);

        for (Long var :obj2){
            System.out.println("Print that phone numbers..."+var);
        }

    }

    public static void main(String[] args) {
        CollectionExample air = new CollectionExample();
        air.displayList();
        air.displayListWithGenerics();
        air.displayListWithGenerics1();
    }
}
