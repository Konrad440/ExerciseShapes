import static java.lang.Math.PI;

public class Circle extends Shape implements TwoDimensional{
    private double radius;
    public Circle(double radius) {
        this(radius, "White", "Unknown");
    }
    public Circle(double radius, String color, String name){
        setColor(color);
        setName(name);
        setRadius(radius);
    }

    @Override
    public double getArea() {
        return PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * PI * radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
