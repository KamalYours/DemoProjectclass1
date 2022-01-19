import com.sun.org.apache.bcel.internal.generic.ArithmeticInstruction;

public class FinallyException {
    public static void main(String[] args) {
        try {
            System.out.println("inside the try block");

            int data =25/0;
            System.out.println(data);

        }
        catch (ArithmeticException e){
            System.out.println("Exception Handled");
            System.out.println(e);
        }
        finally {
            System.out.println("Finally block is always executed");
        }
        System.out.println("rest of the code");
    }
}