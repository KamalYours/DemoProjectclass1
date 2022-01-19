public class Student6 {

    int id;
    String name;
    static String college;

      static void change(){
        college="BBDIT";
    }

    public Student6(int id, String name) {
        this.id = id;
        this.name = name;
    }
    void display(){
        System.out.println(id);
        System.out.println(name);
        System.out.println(college);
    }

    public static void main(String[] args) {
        Student6.change();
        Student6 air = new Student6(101,"Jiya");
        air.display();
    }
}