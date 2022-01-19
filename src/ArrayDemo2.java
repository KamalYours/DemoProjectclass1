import java.util.ArrayList;

public class ArrayDemo2 {

    public void demo(){
        int marksArray[]={54,25,36};
        for (int i=0;i<marksArray.length;i++){
            System.out.println(marksArray[i]);
        }
    }
    public void demo2(){
        String nameArray[]={"Anshi","Kamal"};
        for (String var:nameArray){
            System.out.println(var);
        }
    }

    public void demo3(){
        float amtArray[]={125.2f,54.23f,53.29f};
        for (float var:amtArray){
            System.out.println(var);
        }
    }

    public void demo4(){
        long acc_noArray[]={1215136,41215463,52145214};
        for (long var:acc_noArray){
            System.out.println(var);
        }
    }

    public static void main(String[] args) {
        ArrayDemo2 air = new ArrayDemo2();
        air.demo();
        air.demo2();
        air.demo3();
        air.demo4();
    }
}

