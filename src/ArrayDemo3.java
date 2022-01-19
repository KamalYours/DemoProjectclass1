public class ArrayDemo3 {

    public void demo(){
        int markArray[]={21,23,25,26};
        for (int i=0;i<markArray.length;i++){
            System.out.println(markArray[i]);
        }
    }
    public void demo2(){
        String nameArray[]={"Komal","Akash","Ajana"};
        for ( int i=0;i<nameArray.length;i++){
            System.out.println(nameArray[i]);
        }
    }

    public static void main(String[] args) {
        ArrayDemo3 air = new ArrayDemo3();
        air.demo();
        air.demo2();
    }
}
