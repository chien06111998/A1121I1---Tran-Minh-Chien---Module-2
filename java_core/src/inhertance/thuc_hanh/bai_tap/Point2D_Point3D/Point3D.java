package inhertance.thuc_hanh.bai_tap.Point2D_Point3D;

public class Point3D extends Point2D{
    private float z = 0.0f;

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

    public void setXYZ (float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public String getXYZ() {
        return "[" + super.getX() + ", " + super.getY() + ", " + z + "]";
    }

    @Override
    public String toString() {
        return "Point 3D : z = " + z + ", Array of = " + getXYZ();
    }
}
