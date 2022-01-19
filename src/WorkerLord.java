public class WorkerLord extends Worker{
    int bonus=10000;


    void display(){
        System.out.println(salary);
        System.out.println(bonus);
    }

    public static void main(String[] args) {
        WorkerLord air = new WorkerLord();
        air.display();
    }
}
