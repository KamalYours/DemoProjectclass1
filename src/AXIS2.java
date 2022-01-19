public class AXIS2 extends Bank2{

    int getRateOfInterest(){
        return 6;
    }

    public static void main(String[] args) {
        SBI2 s = new SBI2();
        System.out.println(s.getRateOfInterest());

        AXIS2 a = new AXIS2();
        System.out.println(a.getRateOfInterest());

        ICICI2 i = new ICICI2();
        System.out.println(i.getRateOfInterest());

        Bank2 b = new Bank2();
        System.out.println(b.getRateOfInterest());

    }
}
