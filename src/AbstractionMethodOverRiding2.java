public class AbstractionMethodOverRiding2 extends AbstractionDemo2{

    @Override
    public void m1() {
        System.out.println("m1 method is implemented..");
    }
    public void m2(){
        System.out.println("m2 is not implemented...");
    }
    public void m3(){
        System.out.println("m3 is also not implemented...");
    }

    public static void main(String[] args) {
        AbstractionMethodOverRiding2 air = new AbstractionMethodOverRiding2();
        air.m1();
        air.m2();
        air.m3();
    }
}