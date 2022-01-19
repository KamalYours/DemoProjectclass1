import java.util.HashMap;
import java.util.Map;

public class PhoneBook {

    void diaplay() {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("Alok", 101);
        map.put("Loki", 102);
        map.put("Harminder", 103);

    }

    public static void main(String[] args) {
        PhoneBook air = new PhoneBook();
        air.diaplay();

    }
}
