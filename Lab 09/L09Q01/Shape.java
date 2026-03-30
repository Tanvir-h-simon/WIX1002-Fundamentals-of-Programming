public class Shape {
    private String name;
    private float perimeter;
    private float area;

    public Shape(String name, float perimeter, float area) {
        this.name = name;
        this.perimeter = perimeter;
        this.area = area;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public float getArea() {
        return area;
    }

    public void setPerimeter(float perimeter) {
        this.perimeter = perimeter;
    }

    public float getPerimeter() {
        return perimeter;
    }

    public void display() {
        System.out.println("Name: " + name + "\nPerimeter: " + perimeter + "\nArea: " + area + "\n");
    }
}