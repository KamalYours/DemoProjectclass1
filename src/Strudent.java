public class Strudent {

    int id ;
     String name;
     static String college="ITS";

    public Strudent(int id, String name) {
        this.id = id;
        this.name = name;
    }
    void display(){
        System.out.println(id);
        System.out.println(name);
        System.out.println(college);
    }

    public static void main(String[] args) {
        Strudent air = new Strudent(101,"Komal");
        air.display();
        Strudent air2 = new Strudent(102,"Aakash");
        air2.display();
    }
}
