public class ThisKeyword2 {
    int rollno;
    String name;
    float fee;

    public ThisKeyword2(int rollno, String name, float fee) {
        this.rollno = rollno;
        this.name = name;
        this.fee = fee;
    }
    void display(){
        System.out.println(rollno);
        System.out.println(name);
        System.out.println(fee);
    }

    public static void main(String[] args) {
        ThisKeyword2 air = new ThisKeyword2(101,"Lela",6000f);
        ThisKeyword2 air2 = new ThisKeyword2(102,"Aakash",10000f);
        air.display();
        air2.display();
    }
}
