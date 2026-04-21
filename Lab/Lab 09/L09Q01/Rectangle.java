public class Rectangle extends Shape {
    float length;
    float width;

    Rectangle(float length, float width) {
        super("Rectangle",
                2 * (length + width),
                length * width);
        this.length = length;
        this.width = width;
    }

    public float calculatePerimeter(float length, float width) {
        return 2 * (length + width);
    }

    public float calculateArea(float length, float width) {
        return length * width;
    }

}