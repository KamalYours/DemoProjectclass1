public class BaseChildClass extends BaseClass{
    @Override
    public void showl() {
        System.out.println("Overriding the abstract methof of parent class");
    }
    public void showl2(){
        System.out.println("Overring the concrete method of parent class");
    }

    public static void main(String[] args) {
        BaseChildClass air = new BaseChildClass();
        air.showl();
        air.showl2();
        BaseClass air2 = new BaseChildClass();
        air2.showl();
        air2.showl2();
    }
}
