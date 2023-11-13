public class Cube extends Box{
    public Cube(double side) {
        super(side);
    }

//    private double side;

    @Override
    public void setLength(double length) {
        if (super.getLength() != length) {
            super.setLength(length);

        }
    }

    @Override
    public void setWidth(double width) {
        if (super.getWidth() != width) {
            super.setWidth(width);

        }
    }

    @Override
    public void setHeight(double height) {
        if (super.getHeight() != height) {
            super.setHeight(height);

        }
    }
    public void setSide(double side) {
        if (side > 0){
            super.setLength(side);
            super.setWidth(side);
            super.setHeight(side);

        } else {
            System.err.println("Please enter value higher than 0");
        }
    }
    public double getSide() {

        return super.getHeight();
    }



}
