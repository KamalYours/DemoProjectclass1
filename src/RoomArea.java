public class RoomArea {

    public static void main(String[] args) {
    float area;
    Room room1 = new Room();
    room1.getData(52,21);
    area=room1.length*room1.breadth;
        System.out.println("Area of this room..."+area);
    }
}
