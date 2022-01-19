public class ExceptionDemo2 {

    public int sum(int a , int b){
        int result = a+b;
        return result;
    }
    public int divide(int a , int b){
        int result=a/b;
        return result;
    }

    public float sub(float a , float b){
        float result = a-b;
        return result;

    }


    public static void main(String[] args) {
        ExceptionDemo2 air = new ExceptionDemo2();
       int obj= air.sum(25,54);
        System.out.println("Print the sum..."+obj);
        int output=air.divide(52,4);
        System.out.println("Print the divide..."+output);
        float var=air.sub(5456.23f,5284.26f);
        System.out.println("Print the subtraction of these float numbers.."+var);

    }
}
