public class TestPolyMorphism extends Shape {
    public static void main(String[] args) {
        Shape s;
        s= new Circle();
        s.draw();

        s= new Triangle();
        s.draw();

        s = new Rectangle();
        s.draw();

        s= new Shape();
         s.draw();


    }
}
