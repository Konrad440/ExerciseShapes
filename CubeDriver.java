public class CubeDriver {
    public static void main(String[] args) {
        Cube cube1 = new Cube(5);
        Cube cube2 = new Cube(8);

        System.out.println("The value of height cube1 is " + cube1.getHeight());
        System.out.println("The value of length cube1 is " + cube1.getLength());
        System.out.println("The value of width cube1 is " + cube1.getWidth());
        System.out.println("The value of width cube2 is " + cube2.getWidth());
        System.out.println("The value of length cube2 is " + cube2.getLength());
        System.out.println("The value of height cube2 is " + cube2.getHeight());

        cube1.setLength(20);
        cube1.printBox();
        cube1.setLength(40);
        cube1.printBox();
        cube2.setWidth(-5);
        cube2.printBox();

    }
}
