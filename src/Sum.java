public class Sum {

    public void sum(int a , int b , int c){
        //int a = 25;
        //int b = 45;
         //int c = 52;
        int result=a+b+c;
        System.out.println("Print the sum of all these numbers..."+result);
    }

    public void sub(int a , int b, int c){
        //int a = 23;
         //int b = 45;
          //int c = 563;
          int result=a-b-c;
        System.out.println("Print the sum of all these numbers..."+result);
    }

    public static void main(String[] args) {
        Sum air =  new Sum();
        air.sum(59,21,1);
        air.sub(85,52,21);
    }
}


