public class MO1 {

    int m1(int a , int b){
        return a+b;

    }

    int m1(int a , int b , int c){
        return a-b-c;

    }

    public static void main(String[] args) {
        MO1 air = new MO1();
        System.out.println("Print m1.."+ air.m1(52,54));
        System.out.println("Print m2..."+ air.m1(87,54,21));
    }
}
