public class Point3D extends  Point2D {
    private float z;

    public Point3D() {
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
    public void setXYZ(float x, float y, float z){
        super.setX(x);
        super.setY(y);
        this.z = z;
    }
    public float[] getXYZ(){
        float[] xyz = new float[3];
        xyz[0]= getX();
        xyz[1] = getY();
        xyz[2] = getZ();
        return xyz;
    }
    @Override
    public String toString (){
        return "A point with (x,y,z)= (" + super.getX() +","+ super.getY()+", "+ this.z+")";
    }
}
class TestPoint3D{
    public static void main(String[] args) {
        Point3D point3D = new Point3D();
        point3D = new Point3D(2,3,4);
        System.out.println(point3D);
    }
}
