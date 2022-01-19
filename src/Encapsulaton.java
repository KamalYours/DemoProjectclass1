public class Encapsulaton {
    private String name;
    private int id;
    private String cityname;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityname() {
        return cityname;
    }

    public void setCityname(String cityname) {
        this.cityname = cityname;
    }

    public static void main(String[] args) {
        Encapsulaton air = new Encapsulaton();
        air.setId(102);
        air.setName("Alok");
        air.setCityname("UP");

        System.out.println(air.getId());
        System.out.println(air.getName());
        System.out.println(air.getCityname());
    }

}
