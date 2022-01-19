import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo {

    public static void main(String[] args) {
        ConcurrentHashMap<Integer,String> m = new ConcurrentHashMap<>();
        m.put(101,"Kamal");
        m.put(102,"Pooja");
        m.put(103,"Aarti");

        m.putIfAbsent(101,"Kamal");
        m.remove(103,"Aarti");


    }

}
