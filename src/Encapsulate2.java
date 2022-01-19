public class Encapsulate2 {

    private int id ;
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
        Encapsulate2 air2 = new Encapsulate2();
        air2.setId(101);
        air2.setName("Mukesh");
        air2.setRollno(22);
        System.out.println(air2.id);
        System.out.println(air2.name);
        System.out.println(air2.rollno);
    }
}
