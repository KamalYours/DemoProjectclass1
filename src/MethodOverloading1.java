public class MethodOverloading1 {

    int id;
    String name;
    int age;

    public MethodOverloading1(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public MethodOverloading1(int id, int age) {
        this.id = id;
        this.age = age;
    }

    public void display(){
        System.out.println(id);
        System.out.println(name);
    }

    public void display2(){
        System.out.println(id);
        System.out.println(age);
    }

    public static void main(String[] args) {
        MethodOverloading1 air = new MethodOverloading1(101,"Komal");
        MethodOverloading1 air2 = new MethodOverloading1(101,25);

        air.display();
        air2.display2();
    }
}
