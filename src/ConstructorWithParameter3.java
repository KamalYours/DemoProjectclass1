public class ConstructorWithParameter3 {

    int id;
     String name;

    public ConstructorWithParameter3(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public void display(){
        System.out.println("Print the id..."+id);
        System.out.println("Print the name..."+name);
    }

    public static void main(String[] args) {
        ConstructorWithParameter3 air = new ConstructorWithParameter3(101,"Rohit");
        ConstructorWithParameter3 air2 = new ConstructorWithParameter3(102,"Rehnika");
           air.display();
           air2.display();
    }

}
