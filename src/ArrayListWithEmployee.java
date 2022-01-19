import java.util.ArrayList;

public class ArrayListWithEmployee {

    public void displayListWithEmployee(){
        ArrayList<Employee> empList = new ArrayList<Employee>();
       Employee emp = new Employee(101,"Akash","UP","ITS");
       Employee emp2 = new Employee(102,"Rahul","Delhi","ITS");
       empList.add(emp);
       empList.add(emp2);
       for (Employee var:empList){
           System.out.println(var.id);
           System.out.println(var.name);
           System.out.println(var.cityname);
           System.out.println(var.companyname);
       }
    }


    public static void main(String[] args) {
        ArrayListWithEmployee air = new ArrayListWithEmployee();
        air.displayListWithEmployee();
    }
}
