import georegression.struct.line.LineSegment3D_F32;
import georegression.struct.point.Point3D_F32;


public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        
        Point3D_F32 p1 = new Point3D_F32(0, 0, 0);
        Point3D_F32 p2 = new Point3D_F32(2, 0, 0);
        Point3D_F32 p3 = new Point3D_F32(0, 0, 3);
        
        LineSegment3D_F32 s1 = new LineSegment3D_F32(p1, p2);
        LineSegment3D_F32 s2 = new LineSegment3D_F32(p1, p3);
        
        System.out.println(s1.getLength());
    }
}
