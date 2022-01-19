import com.sun.org.apache.xpath.internal.objects.XObject;

public class StudentObject2 {

    String name;
    int age;
    String cityname;

    public StudentObject2() {

    }

    public StudentObject2(String name, int age, String cityname) {
        this.name = name;
        this.age = age;
        this.cityname = cityname;
    }

    public StudentObject2 createObject(){
        StudentObject2 obj = new StudentObject2("Lokender",36,"Delhi");
        return obj;
    }

    public static void main(String[] args) {
        StudentObject2 obj = new StudentObject2("Lokender",36,"Delhi");
        obj=obj.createObject();
        System.out.println("Print data..."+obj.name);
        System.out.println("Print data..."+obj.age);
        System.out.println("Print data..."+obj.cityname);
    }
}
