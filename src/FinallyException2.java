public class FinallyException2 {
    public static void main(String[] args) {
        try{
            System.out.println("inside the try block");
            int data = 25/0;
            System.out.println(data);
            int sum=25+63;
            System.out.println(sum);
        }
        catch (ArithmeticException e){
            System.out.println("exception handled");
            System.out.println(e);
        }
        finally {
            System.out.println("Finally block is always executed");
        }
        System.out.println("rest of the code");
    }
}
