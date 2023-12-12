package shapes;

public class Square extends Rectangle {
    public Square(int side) {
        super(side, side);
        Rectangle squareRectangle = new Rectangle(side, side);
    }
    public int getArea() {
        return length * length;
    }
    public int getPerimeter() {
        return 4 * length;
    }
}
