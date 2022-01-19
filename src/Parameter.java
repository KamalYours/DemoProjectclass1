public class Parameter {

    public void writeBook(int a){
        int result = a;
        System.out.println("Print="+result);
    }

    public void readBook(int a , int b){
        int result = a/b;
        System.out.println("Print the divide..."+a/b);
    }

    public static void main(String[] args) {

        Parameter air = new Parameter();
        air.writeBook(22);
        air.readBook(52,4);
    }
}
