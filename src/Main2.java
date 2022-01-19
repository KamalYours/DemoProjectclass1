public class Main2 {

    public static String reverse(String str){
        return  new StringBuilder(str).reverse().toString();

    }

    public static void main(String[] args) {
        String str = "Kamaljeet";
        str=reverse(str);
        System.out.println("The reverse of that,,,"+str);
    }
}
