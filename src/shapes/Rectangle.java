package shapes;

public class Rectangle extends Quadrilateral implements Measurable {
    public Rectangle(int length, int width) {
        super(length, width);
    }

    @Override
    public double setLength() {
        return 0;
    }

    @Override
    public double setWidth() {
        return 0;
    }
}
