public class B1 implements A1 {


    @Override
    public void a() {
        System.out.println("A is overrided");
    }

    @Override
    public void b() {
        System.out.println("B is also overrided..");
    }

    @Override
    public void c() {
        System.out.println("C is also overrided");
    }

    @Override
    public void d() {
        System.out.println(" D is also overrided...");
    }

    public static void main(String[] args) {
        B1 air = new B1();
        air.a();
        air.b();
        air.c();
        air.d();
    }
}
