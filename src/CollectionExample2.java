import java.util.ArrayList;

public class CollectionExample2 {

    public void displayList(){
        ArrayList list = new ArrayList();
        list.add("Maths");
        list.add("Science");
        list.add("English");
        list.add("Hindi");

        for (Object var: list){
            System.out.println("Print the subject...="+var);
        }

    }

    public void displayListWithGenerics(){
        ArrayList<Integer> generic_list = new ArrayList<Integer>();
        generic_list.add(25);
        generic_list.add(54);
        generic_list.add(59);
        generic_list.add(87);
        generic_list.add(83);

        for (Integer var :generic_list){
            System.out.println("Print the integer...="+var);
        }
    }

    public void displayListWithGenerics2(){
       ArrayList<String> generic_list2 = new ArrayList<String>();
       generic_list2.add("Pankaj Adwani");
       generic_list2.add("Monalika Adwani");
       generic_list2.add("Shashi Adwani");

       for (String var:generic_list2){
           System.out.println("Print all Adwani family...="+var);
       }

    }


    public static void main(String[] args) {
        CollectionExample2 air = new CollectionExample2();
        air.displayList();
        air.displayListWithGenerics();
        air.displayListWithGenerics2();
    }
}
