public class DemoTeam {

    public void name(String name){
        String msg="This cell is related to name..."+name;
        System.out.println(name);
    }
    public void age(int age){
        String msg="This cell is related to age..."+age;
        System.out.println(age);
    }

    public void num(Float num){
        String msg="This cell is related to num..."+num;
        System.out.println(num);
    }

    public static void main(String[] args) {
        DemoTeam air = new DemoTeam();
        air.name("Anamika");
        air.age(21);
        air.num(25.23f);
    }
}
