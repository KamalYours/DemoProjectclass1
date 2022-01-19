public class Bike extends Vehicle {

    void run(){
        System.out.println("Bike is running safely");
    }

    public static void main(String[] args) {
        Bike air = new Bike();
        air.run();
        Vehicle air2 = new Bike();
        air2.run();
        Vehicle air3 = new Vehicle();
        air3.run();
    }

}
