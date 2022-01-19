public class Student5 {

    private int id;
    private String name;
    private int rollno;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public static void main(String[] args) {
        Student5 air = new Student5();
        air.setId(101);
        air.setName("Kamal");
        air.setRollno(21);
        System.out.println(air.getId());
        System.out.println(air.getName());
        System.out.println(air.getRollno());
    }
}
