public class StrudentDate {

    int rollNumber;
    String name;

    public StrudentDate(int rollNumber, String name) {
        this.rollNumber = rollNumber;
        this.name = name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        StrudentDate air = new StrudentDate(11,"Rahul");
        System.out.println(air.getRollNumber());
        System.out.println(air.getName());

    }
}
