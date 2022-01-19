import java.util.ArrayList;

public class ArrayListWithEmployee2 {

    public void displayListWithEmployee() {
        ArrayList<Employee2> empList = new ArrayList<Employee2>();
        Employee2 emp = new Employee2(101, "Karan", "Delhi", "ITS");
        Employee2 emp1 = new Employee2(102, "Umang", "Dehradun", "ITS");
        Employee2 emp2 = new Employee2(103, "Akash", "MP", "ITS");
        Employee2 emp3 = new Employee2(104, "Rahul", "Mumbai", "ITS");

        empList.add(emp);
        empList.add(emp1);
        empList.add(emp2);
        empList.add(emp3);

        for (Employee2 var:empList){
            System.out.println("Print the details.."+var.id);
            System.out.println("Print the details.."+var.name);
            System.out.println("Print the details.."+var.cityname);
            System.out.println("Print the details.."+var.companyName);

        }
    }

    public static void main(String[] args) {
        ArrayListWithEmployee2 air = new ArrayListWithEmployee2();
        air.displayListWithEmployee();
    }
}
