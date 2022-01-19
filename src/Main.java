public class Main {

    public static String reverse(String str){
        return new StringBuilder(str).reverse().toString();
    }

    public static void main(String[] args) {
        String str="Techie Delight";
        str = reverse(str);
        System.out.println("The reverse of the give string is "+str);
    }
}
