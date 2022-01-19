public class Encape {

    private String name;
    private int rollno;
    private int age ;
    private String schoolname;
    private String mothername;
    private String fathername;

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSchoolname() {
        return schoolname;
    }

    public void setSchoolname(String schoolname) {
        this.schoolname = schoolname;
    }

    public String getMothername() {
        return mothername;
    }

    public void setMothername(String mothername) {
        this.mothername = mothername;
    }

    public String getFathername() {
        return fathername;
    }

    public void setFathername(String fathername) {
        this.fathername = fathername;
    }

    public static void main(String[] args) {
        Encape air = new Encape();
        air.setName("Himanshu");
        air.setRollno(21);
        air.setAge(15);
        air.setSchoolname("SBV");
        air.setFathername("Mahender singh");
        air.setMothername("Vijaylaxmi");

        System.out.println(air.getName());
        System.out.println(air.getRollno());
        System.out.println(air.getAge());
        System.out.println(air.getSchoolname());
        System.out.println(air.getFathername());
        System.out.println(air.getMothername());

    }
}
