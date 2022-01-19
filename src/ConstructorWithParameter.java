public class ConstructorWithParameter {

    int id;
     String name;

    public ConstructorWithParameter(int id, String name) {
        this.id = id;
        this.name = name;

    }

    void display(){
        System.out.println("Print the id ..."+id);
        System.out.println("Print the  name..."+name);
    }

    public static void main(String[] args) {
        ConstructorWithParameter air = new ConstructorWithParameter(111,"Rahul");
        ConstructorWithParameter air2 = new ConstructorWithParameter(112,"Rajesh");
          air.display();
          air2.display();


    }
}
