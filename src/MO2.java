public class MO2 {

    int add(int a , int b){
        return a+b;
    }
    double add(double a,double b){
        return a+b;
    }

    public static void main(String[] args) {
        MO2 m2=new MO2();
        System.out.println(m2.add(25,25));
        System.out.println(m2.add(52.23,54.26));
    }
}
