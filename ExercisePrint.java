import static java.lang.System.out;

public class ExercisePrint {
    public static void main(String[] args) {
        Shape[] shape = new Shape[5];
        shape[0] = new Rectangle(10,20,"Blue","Rectangle");
        shape[1] = new Square(20);
        shape[2] = new Cube(30);
        shape[3] = new Box(10,20,30, "Red", "Box");
        shape[4] = new Circle(20,"Red","Circle");

        for (Shape shapes: shape){
            out.println(shapes);
        }
    }
}
