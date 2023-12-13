package shapes;

public class Square extends Quadrilateral {
    public Square(int side) {
        super(side, side);
    }
    @Override
    public double getArea() {
        return length * length;
    }
    @Override
    public double getPerimeter() {
        return 4 * length;
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
