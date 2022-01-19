public class B implements A{

    @Override
    public void a() {
        System.out.println("A am overrided....");
    }

    @Override
    public void b() {
        System.out.println("B am also  overrided...");
    }

    @Override
    public void c() {
        System.out.println("C am also overrided....");
    }

    @Override
    public void d() {
        System.out.println("D am also overrided...");
    }

    public static void main(String[] args) {
        A air = new B();
        air.a();
        air.b();
        air.c();
        air.d();
    }
}
