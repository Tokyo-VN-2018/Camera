import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import georegression.struct.line.LineSegment3D_F32;
import georegression.struct.plane.PlaneNormal3D_F32;
import georegression.struct.point.Point3D_F32;
import georegression.struct.point.Vector3D_F32;


public class Main {
    public static void main(String[] args) throws Exception {
    	
        String path = args[0];
        
        List<String> strings = new ArrayList<>();
        
        File file = new File(path);
        
		try {
		Scanner scan = new Scanner(file);
		while (scan.hasNextLine()) {
			String scannedline = scan.nextLine();
			strings.add(scannedline);
		}
		scan.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
        
		String stringCoorRoom =  strings.get(0);
		int numOfBlock  = Integer.parseInt(strings.get(1));
		
		List<String> stringCoorBlock = new ArrayList<>();
		for (int i = 2; i <= 1 + Integer.parseInt(strings.get(1)); i++) {
			stringCoorBlock.add(strings.get(i));
		}
		
		List<String> stringCoorCam = new ArrayList<>();
		int numOfCam =  Integer.parseInt(strings.get(2 + Integer.parseInt(strings.get(1))));
		for (int i = 3 + Integer.parseInt(strings.get(1)); i < strings.size(); i++) {
			stringCoorCam.add(strings.get(i));
		}
		
		System.out.println(stringCoorRoom);
		System.out.println(numOfBlock);
		for (String string : stringCoorBlock) {
			System.out.println(string);
		}
		System.out.println(numOfCam);
		for (String string : stringCoorCam) {
			System.out.println(string);
		}
//        Point3D_F32 p1 = new Point3D_F32(0, 0, 0);
//        Point3D_F32 p2 = new Point3D_F32(2, 0, 0);
//        Point3D_F32 p3 = new Point3D_F32(0, 0, 4);
//        
//        LineSegment3D_F32 s1 = new LineSegment3D_F32(p1, p2);
//        LineSegment3D_F32 s2 = new LineSegment3D_F32(p1, p3);
//        
//        System.out.println(s1.getLength());
//        
//        Vector3D_F32 v1 = new Vector3D_F32(p1, p2);
//        Vector3D_F32 v2 = new Vector3D_F32(p1, p3);
//        System.out.println(v1.dot(v2));
//        System.out.println(p1.toVector());
//        
//        PlaneNormal3D_F32 m1 = new PlaneNormal3D_F32(p1, v1);
//        System.out.println(m1);
//        
//        System.out.println(p2);
        
        
    }
}
