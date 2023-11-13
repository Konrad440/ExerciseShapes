public class ExerciseShapes {

    public static void main(String[] args) {
        Shape[] shapes = new Shape[8];

        TwoDimensional[] twoDs = new TwoDimensional[3];

        twoDs[0] = new Circle(7.0);
        twoDs[1] = new Rectangle(5.0, 4.0);
        twoDs[2] = new Square(5.67);

        shapes[0] = new Rectangle(5.0, 4.0);
        shapes[1] = new Rectangle(5.0 , 5.0);
        shapes[2] = new Square(5.0);
        shapes[3] = new Square(8.0);
        shapes[4] = new Cube(5.0);
        shapes[5] = new Cube(12.0);
        shapes[6] = new Box(12.0);
        shapes[7] = new Box(3.0);

//        for(Shape shape: shapes){
//            shape.setColor("blue");
//            System.out.println(shape.getColor());
//        }
//        for (Shape shape: shapes) {
//            ThreeDimensional temp = (ThreeDimensional)shape;
//            System.out.println(temp.getVolume());
//        }

        for (TwoDimensional temp: twoDs) {
            System.out.println(temp.getArea());
            System.out.println(temp.getPerimeter());
        }
    }
}
