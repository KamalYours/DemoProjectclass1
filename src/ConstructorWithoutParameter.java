public class ConstructorWithoutParameter {

    int id;
    String name;

    void display(){
        System.out.println("Id .."+id);
        System.out.println("String name.."+name);
    }

    public static void main(String[] args) {
        ConstructorWithoutParameter air = new ConstructorWithoutParameter();
        ConstructorWithoutParameter air2 = new ConstructorWithoutParameter();
            air.display();
            air2.display();

    }
}
