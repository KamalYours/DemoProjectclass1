public class MethodOverloadingMainMethod {

    public static void main(String[] args) {
        System.out.println("hello");
    }

    public static void main(String args) {
        System.out.println("hello");
    }

    public static void main() {
        System.out.println("hello");
    }
}
