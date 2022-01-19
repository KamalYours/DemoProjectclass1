public class MethodOverLoading {

    int id;
     String name;
     int age;

    public MethodOverLoading(int id, String name ) {
        this.id = id;
        this.name = name;

    }

    public MethodOverLoading(int id, int age) {
        this.id = id;
        this.age = age;
    }

    void display(){
        System.out.println(id);
        System.out.println(name);
    }

    void display2(){
        System.out.println(id);
        System.out.println(age);
    }

    public static void main(String[] args) {
        MethodOverLoading o1= new MethodOverLoading(101,"Naval Kishor");
        MethodOverLoading o2= new MethodOverLoading(10,56);
        o1.display();
        o2.display2();

    }
}
