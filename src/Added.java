public class Added {

    int add(int a , int b){
        return a+b;
    }
    int add(int a , int b , int c){
        return a+b+c;

    }

    double add(double a , double b ){
        return a+b;
    }
    double add(double a, double b , double c){
        return a+b+c;
    }

    public static void main(String[] args) {
        Added air = new Added();
        System.out.println(air.add(25,5));
        System.out.println(air.add(54,56,58));
        System.out.println(air.add(23.2,25.15));
        System.out.println(air.add(52.26,48.26,54.3));
    }
}
