public class Square extends Shape {
    float side;

    Square(float side) {
        super("Square",
                side * 4,
                side * side);
        this.side = side;
    }

    public float calculatePerimeter(float side) {
        return side * 4;
    }

    public float calculateArea(float side) {
        return side * side;
    }
}
