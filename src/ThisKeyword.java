public class ThisKeyword {
    int rollno;
    String name;
    float fee;

    public ThisKeyword(int r, String n, float f) {
        rollno = r;
        name = n;
        fee = f;
    }
    void display(){
        System.out.println(rollno);
        System.out.println(name);
        System.out.println(fee);
    }

    public static void main(String[] args) {
        ThisKeyword air = new ThisKeyword(102,"Santosh",5000f);
        air.display();
    }
}
