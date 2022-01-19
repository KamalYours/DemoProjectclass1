public class AbstractMethodOverRiding extends AbstractionDemo{

    @Override
    public void m1() {
        System.out.println("M1 method is implemented...");
    }
    public void m2(){
        System.out.println("m2 method is not implemented...");
    }
    public void m3(){
        System.out.println("M3 method is also  not implemented....");
    }

    public static void main(String[] args) {
        AbstractMethodOverRiding air = new AbstractMethodOverRiding();
        air.m1();
        air.m2();
        air.m3();

    }

}