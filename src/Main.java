import org.locationtech.jts.algorithm.CGAlgorithms3D;
import org.locationtech.jts.geom.Coordinate;
import org.locationtech.jts.noding.SegmentIntersectionDetector;
import org.locationtech.jts.triangulate.Segment;


public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Coordinate p1 = new Coordinate(1, 2, 3);
        Coordinate p2 = new Coordinate(3, 4, 5);
        
        Coordinate p3 = new Coordinate(1, 2, 3);
        Coordinate p4 = new Coordinate(0, 3, 7);
        double dis = CGAlgorithms3D.distance(p1, p2);
        System.out.println(dis);
        Segment s1 = new Segment(p1, p2);
        Segment s2 = new Segment(p3, p4);
        Coordinate x =  s1.intersection(s2);
        System.out.println((x));
        
    }
}
