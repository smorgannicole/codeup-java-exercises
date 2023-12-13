package shapes;

public abstract class Quadrilateral extends Shape implements Measurable {
    protected int length;
    protected int width;
    public Quadrilateral (int length, int width) {
        this.length = length;
        this.width = width;
    }
    @Override
    public double getArea() {
        return length * width;
    }
    @Override
    public double getPerimeter() {
        return (length * 2) + (width * 2);
    }
    public abstract double setLength();
    public abstract double setWidth();
}
