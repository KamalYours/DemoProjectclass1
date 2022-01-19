public class MethodOverRidingChild1 extends MethodOverRidingParent{

    public void m1(){
        System.out.println("I am  in the loop of m1 child class....");
    }
    public void m2(){
        System.out.println("I am in the loop of  m2 class....");
    }

    public void m3(){
        int a = 54;
         int b = 9;
         int result = a*b;
        System.out.println("Print the multiple of these numbers....."+result);
    }



    public static void main(String[] args) {
        MethodOverRidingParents1 air = new MethodOverRidingParents1();
        air.m1();
        air.m2();
        air.m3();

        MethodOverRidingChild1 air2 = new MethodOverRidingChild1();
        air2.m1();
        air2.m2();
        air2.m3();



    }
}
