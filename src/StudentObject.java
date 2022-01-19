public class StudentObject {

    String name;
     int age;
     String cityname;

    public StudentObject() {

    }

    public StudentObject(String name, int age, String cityname) {
        this.name = name;
        this.age = age;
        this.cityname = cityname;
    }


    public StudentObject createObject(){
        StudentObject air = new StudentObject("Minakshi",26,"Mumbai");
        return air;
    }

    public static void main(String[] args) {
        StudentObject air = new StudentObject();
        air=air.createObject();
        System.out.println("Print the name.."+air.name);
        System.out.println("Print the name.."+air.age);
        System.out.println("Print the name.."+air.cityname);

    }
}
