import com.sun.javaws.exceptions.FailedDownloadingResourceException;
import javafx.util.Pair;

class ArraysDemo {

    public void demo() {
        int marksArray[] = {25, 26, 24, 48, 86};
        for (int i = 0; i < marksArray.length; i++) {
            System.out.println("Print the marks..=" + marksArray[i]);
        }
        String name[]={"Manoj","Kajal","Akash","Sonal"};
        for (int i=0;i<name.length;i++){
            System.out.println("Print the name ...="+name[i]);
        }
        for (int var:marksArray){
            System.out.println("In the index of the loop.."+var);
        }

        for (String var:name){
            System.out.println("Inside the advance of the loop...="+var);
        }

        long mobileNumber[]={9211022336l,9211223344l,9877665544l,};
        for (long var:mobileNumber){
            System.out.println("Print the mobile number ..="+var);
        }
    }



    public static void main(String[] args) {
        ArraysDemo air = new ArraysDemo();
        air.demo();
    }
}

