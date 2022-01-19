public class Counter {

    static int count = 0;

    public Counter() {
        count++;
        System.out.println(count);
    }


    public static void main(String[] args) {
        Counter air = new Counter();
        Counter air2 = new Counter();
        Counter air3 = new Counter();

    }
}
