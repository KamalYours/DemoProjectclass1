import java.util.concurrent.Callable;

public class ClassArrayDemo2 {

    public void demo2(){
        int markArray[]={52,53,56,59,58,57,54,51,};
       // for (int i=0;i<markArray.length;i++){
         //   System.out.println("Print the marks..."+markArray[i]);
        //}

        for (int var: markArray){
            System.out.println("In the advance of the loop..."+var);
        }
        String nameArray[]={"Santosh","Himanshi","Manoj","Ashish"};
       // for (int i =0;i<nameArray.length;i++){
         //   System.out.println("Print the name of all person..."+nameArray[i]);
        //}

        for (String var:nameArray){
            System.out.println("Print the advance loop in the index.."+var);
        }
    }

    public static void main(String[] args) {
        ClassArrayDemo2 air = new ClassArrayDemo2();
        air.demo2();
    }
}