package Day9;

public class Rectangle extends Figure {
    private double weidth;
    private double height;

    public Rectangle(String color, double weidth, double height) {
        super(color);
        this.weidth = weidth;
        this.height = height;
    }

    @Override
    public double area() {
        return weidth*height;
    }

    @Override
    public double perimeter() {
        return 2*(weidth+height);
    }
}
