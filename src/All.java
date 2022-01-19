public class All {

    String name;
    int age;
    String cityname;

    public All(String name, int age, String cityname) {
        this.name = name;
        this.age = age;
        this.cityname = cityname;

    }

    public static void main(String[] args) {
        All obj = new All("Kanishk",21,"Delhi");
        System.out.println("Print the name..."+obj.name);
        System.out.println("Print the city..."+obj.age);
        System.out.println("Print the cityname..."+obj.cityname);
    }
}