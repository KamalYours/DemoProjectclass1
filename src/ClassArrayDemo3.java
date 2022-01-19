public class ClassArrayDemo3{

    public void demo(){
        int marksArray[]={52,21,36,47,89};
       // for (int i = 0; i<marksArray.length;i++){
         //   System.out.println("Print the marks....."+marksArray[i]);
       // }

        for (int var:marksArray){
            System.out.println("Print the name..."+var);
        }

        String nameArray[]={"Santosh","Akash","Manoj"};
        //for (int i=0;i<nameArray.length;i++){
          //  System.out.println("Print the name.."+nameArray[i]);
        //}

        for (String var:nameArray){
            System.out.println("Print the name..."+var);
        }
    }

    public static void main(String[] args) {
        ClassArrayDemo3 air = new ClassArrayDemo3();
        air.demo();
    }
}