public class EvenOdd{

    public void sum(int a , int b , int c){
        int result = a+b+c;
        System.out.println("Print the sum..."+result);
    }

    public void sub(int a , int b , int c ){
        int result1 = a-b-c;
        System.out.println("Print the subtraction..."+result1);
    }

    public void mul(int a ,  int b , int c ){
        int result3 = a*b*c;
        System.out.println("Print the multiple of these  numbers ...."+result3);
    }

    public static void main(String[] args) {
        EvenOdd air = new EvenOdd();
        air.sum(54,54,66);
        air.sub(82,52,1);
        air.mul(52,52,52);
    }
}