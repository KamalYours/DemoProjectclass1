public class Operation1 {

     int data = 20;

    void change(int data){
        data = data+100;
        int result = 120;
    }

    public static void main(String[] args) {
        Operation1 air = new Operation1();
        System.out.println("Before change.."+ air.data);
        air.change(20);
        System.out.println("After change.."+air.data);
    }

}
