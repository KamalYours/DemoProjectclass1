public class ClassA {

    public void m(){
        System.out.println("Hello M");
    }
    public void n(){
        System.out.println("Hello N");
    }

    public static void main(String[] args) {
        ClassA a = new ClassA();
        ClassA a1 = new ClassA();
        a.m();
        a1.n();


    }
}
