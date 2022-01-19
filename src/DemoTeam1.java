public class DemoTeam1 {

    public String name(String name){
        String msg ="This method is related to name ..."+name;
        //System.out.println(name);
        return name;
    }

    public int age(int age){
        String msg = "This method is related to age..."+age;
        //System.out.println(age);
        return age;
    }


    public static void main(String[] args) {
        DemoTeam1 air = new DemoTeam1();
       String obj= air.name("Komal");
        System.out.println("Print the string obj.."+obj);
        int var=air.age(25);
        System.out.println("Print the age.."+var);
    }
}
