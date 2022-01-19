public class Demo2 {


    String name;
    int age;

    public Demo2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        Demo2 air = new Demo2("Sachin",52);
        System.out.println("Print the name..."+air.name);
        System.out.println("Print the name..."+air.age);

    }
}