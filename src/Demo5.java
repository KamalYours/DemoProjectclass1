public class Demo5 {

    String name;
    int age;

    public Demo5(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        Demo5 obj = new Demo5("Karan",25);
        Demo5 obj2 = new Demo5("Monallika",52);
        System.out.println("Obj..."+obj.name);
        System.out.println("Obj..."+obj.age);
        System.out.println("Obj2..."+obj2.name);
        System.out.println("Obj2..."+obj2.age);

    }
}
