package oop.polymorphism;

public class Point3D extends  Point2D {
    private float z=-1f;

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }
    public Point3D(float z){
        this.z = z;
    }

    public Point3D(Point2D point2D){
        super(point2D);
        if (point2D instanceof Point3D){
            this.z = ((Point3D) point2D).getZ();
        }
    }

//    public Point3D (Point3D point3D){
//        super(point3D);
//        this.z = point3D.z ;
//    }

    public Point3D(){
        super(0, 0);
    }

    public void setZ(float z) {
        this.z = z;
    }

    public float getZ() {

        return this.z;
    }
    public void setXYZ(float x, float y, float z){
        super.setXY(x,y);
        setZ(z);
    }
    public float[] getXYZ(){
        float []arr= new float[3];
        arr[0]=super.getX();
        arr[1]=super.getY();
        arr[2]= this.z;
        return  arr;
    }

    @Override
    public String toString() {
        return super.toString() +
                "z=" + z +
                '}';
    }

    public static void main(String[] args) {
        Point2D point2D = new Point2D(1,2);
        System.out.println(point2D);

        Point3D point3D = new Point3D(point2D);
        System.out.println(point3D);

        Point3D point3D1 = new Point3D(point3D);
        System.out.println(point3D1);


    }
}


