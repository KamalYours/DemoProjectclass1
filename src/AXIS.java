public class AXIS  extends Bank{
    float getRateOfInterest(){
        return 9.6f;

    }

    public static void main(String[] args) {
        AXIS air = new AXIS();
        air.getRateOfInterest();
        System.out.println(air.getRateOfInterest());

        SBI air2 = new SBI();
        air2.getRateOfInterest();
        System.out.println(air2.getRateOfInterest());

        ICICI air3 = new ICICI();
        air3.getRateOfInterest();
        System.out.println(air3.getRateOfInterest());
    }
}
