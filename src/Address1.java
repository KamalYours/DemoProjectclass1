public class Address1{
    int id;
    String name;
    String address;

    public Address1(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }
    void display(){
        System.out.println(id);
        System.out.println(name);
        System.out.println(address);
    }

    public static void main(String[] args) {
        Address1 air = new Address1(101,"Komal","UP");
        air.display();
    }
}
