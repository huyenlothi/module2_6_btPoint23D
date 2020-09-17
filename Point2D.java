import java.util.ArrayList;

public class Point2D {
    private float x;
    private float y;

    public Point2D(){

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
    public void setXY(float x, float y){
        this.x = x;
        this.y =y;
    }
    public float[] getXY(){
        float[] arr = new float[2];
        arr[0] = this.x;
        arr[1] = this.y;
        return arr;
    }
    @Override
    public String toString (){
        return "A point with (x,y)= (" + this.x +","+ this.y+")";
    }
}
class TestPoint2D{
    public static void main(String[] args) {
        Point2D point1 = new Point2D();
        System.out.println(point1);
        point1 = new Point2D(3,5);
        System.out.println(point1);

    }
}
