public class Counter2 {

    int id;
    String name;
    static String college="ITS";

    static void change(){
        college="BBDIT";
    }

    public Counter2(int id, String name) {
        this.id = id;
        this.name = name;

    }

    void display(){
        System.out.println(id+"   "+name+"   "+college);
    }

    public static void main(String[] args) {
        Counter2 air = new Counter2(101,"Karan");
        Counter2 air2 = new Counter2(102,"Komal");
        Counter2 air3 = new Counter2(103,"Anamika");
        air.display();
        air2.display();
        air3.display();


    }
}


