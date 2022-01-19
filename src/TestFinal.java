public class TestFinal extends DemoFinal{
    void m1(){
        System.out.println("I am in testfinal");
    }

    public static void main(String[] args) {
        TestFinal t = new TestFinal();
        t.m1();
        DemoFinal d = new DemoFinal();
        d.m1();
        DemoFinal air =  new TestFinal();
        air.m1();
    }
}
