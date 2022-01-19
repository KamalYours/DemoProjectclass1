public class Excersice1 {

    public void sum (int a , int b , int c){
        //int a = 25;
         //int b = 25;
          //int c = 25;
          int result = a+b+c;
        System.out.println("Print the sum .."+result);
    }

    public void sub(int a , int b , int c){
        //int a = 25;
         //int b = 25;
          //int c = 25'
    int result = a-b-c;
        System.out.println("Print the subtraction..="+result);
    }

    public void mul(int a , int b , int c){
        //int a = 25;
         //int b = 25;
          //int c = 25;
          int result = a*b*c;
        System.out.println("Print the multiply..="+result);
    }

    public static void main(String[] args) {
Excersice1 air = new Excersice1();
        air.sum(25,25,25);
        air.sub(25,10,1);
        air.mul(25,25,25);
    }
}
