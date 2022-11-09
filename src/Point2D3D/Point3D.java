package Point2D3D;

public class Point3D extends Point2D {
    private float z = 0.0f;

    public Point3D() {
    }

    public Point3D(float z) {
        this.z = z;
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    @Override
    public String toString() {
        return "Tọa độ x, y, z là: " + getX() + ", " + getY() + ", " + getZ();
    }

    public static class Point3DTest {
        public static void main(String[] args) {
            Point3D point3D = new Point3D(10,12,20);
            System.out.println(point3D);
        }
    }
}
