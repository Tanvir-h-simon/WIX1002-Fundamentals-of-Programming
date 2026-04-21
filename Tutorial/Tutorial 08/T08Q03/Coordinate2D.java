public class Coordinate2D {
    private float xCord;
    private float yCord;

    public Coordinate2D(float x, float y) {
        this.xCord = x;
        this.yCord = y;
    }
    public float getX() {
        return xCord;
    }
    public float getY() {
        return yCord;
    }
    public void setX(float x) {
        xCord = x;
    }
    public void setY(float y) {
        yCord = y;
    }
}