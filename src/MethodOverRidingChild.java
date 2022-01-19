public class MethodOverRidingChild extends MethodOverRidingParent{

    public void m1(){
        System.out.println("I am in m1 child loop");
    }
    public void  m2(){
        System.out.println("I am in m2 child loop..");
    }
    public void m3(){
        System.out.println("I am inn m3 child loop...");
    }

    public static void main(String[] args) {
        MethodOverRidingChild air = new MethodOverRidingChild();
        air.m1();
        air.m2();
        air.m3();

        MethodOverRidingParent air2 = new MethodOverRidingParent();
        air2.m1();
        air2.m2();
        air2.m3();

        MethodOverRidingParent air3 = new MethodOverRidingChild();
        air3.m1();
        air3.m2();
        air3.m3();


    }

}