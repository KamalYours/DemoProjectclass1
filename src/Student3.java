public class Student3 {

    int rollno;
    String name;
    static String college= "ITS";

    public Student3(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }

    void display(){
        System.out.println(rollno);
        System.out.println(name);
        System.out.println(college);
    }

    public static void main(String[] args) {
        Student3 air = new Student3(111,"Aman");
        Student3 air2 = new Student3(112,"Pratap");
         air.display();
         air2.display();

    }
}
