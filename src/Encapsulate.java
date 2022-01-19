public class Encapsulate {

    private String name;
    private int age;
    private int rollno;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public static void main(String[] args) {
        Encapsulate air = new Encapsulate();
        air.setAge(54);
        air.setName("Aarti");
        air.setRollno(102);
        System.out.println(air.age);
        System.out.println(air.name);
        System.out.println(air.rollno);
    }
}
