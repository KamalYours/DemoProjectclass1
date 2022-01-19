import javax.naming.Name;

public class ArrayDemo4 {

    public void demo(){
        int marksArray[]={52,54,56,58};
        for (int i=0;i<marksArray.length;i++){
            System.out.println("Marks..."+marksArray[i]);
        }
    }

    public void demo2(){
        String nameArray[]={"Komal","Kamla","Mansi"};;
        for (int i=0;i<nameArray.length;i++){
            System.out.println("Name..."+nameArray[i]);
        }
    }

    public static void main(String[] args) {
        ArrayDemo4 air = new ArrayDemo4();
        air.demo();
        air.demo2();
    }
}
