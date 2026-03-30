import java.lang.Math;

public class Circle extends Shape {
    float diameter;
    float radius;

    Circle(float diameter) {
        super("Circle",
                (float)(2 * Math.PI * (diameter / 2)),
                (float)(Math.PI * Math.pow(diameter / 2, 2)));
        this.diameter = diameter;
        this.radius = diameter / 2;
    }

    public float calculatePerimeter(float diameter) {
        return (float)(2 * Math.PI * radius);
    }

    public float calculateArea(float diameter) {
        return (float)(Math.PI * Math.pow(radius, 2));
    }
}