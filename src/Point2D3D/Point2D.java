package Point2D3D;

public class Point2D {
    private float x = 0.0f;
    private float y = 0.0f;

    public Point2D() {
    }

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Tọa độ x, y lần lượt là: " + getX() + ", " + getY();
    }

    public static class Point2DTest {
        public static void main(String[] args) {
            Point2D point2D = new Point2D();
            System.out.println(point2D);

            point2D = new Point2D(10,12);
            System.out.println(point2D);
        }
    }
}
