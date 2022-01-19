public class Student2 {

    int id;
    String name;
    static String college = "ITS";

    static  void change(){
      college = "BBDIT";

    }

    public Student2(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display(){
        System.out.println(id);
        System.out.println(name);
        System.out.println(college);
    }

    public static void main(String[] args) {
        Student2.change();
        Student2 air = new Student2(101,"Lalita");
        air.display();
    }
}
