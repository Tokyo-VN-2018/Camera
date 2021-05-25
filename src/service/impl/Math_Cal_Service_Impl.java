package service.impl;

import georegression.struct.line.LineSegment3D_F32;
import georegression.struct.point.Point3D_F32;
import georegression.struct.point.Vector3D_F32;
import service.Math_Cal_Service;

public class Math_Cal_Service_Impl implements Math_Cal_Service{

	@Override
	public boolean rectangularCheck(Point3D_F32[] coordinates) {
		Point3D_F32 O = new Point3D_F32(0, 0, 0);
		Point3D_F32 x = new Point3D_F32(1, 0, 0);
		
		
		LineSegment3D_F32 s1 = new LineSegment3D_F32(coordinates[0], coordinates[1]);
		LineSegment3D_F32 s2 = new LineSegment3D_F32(coordinates[2], coordinates[3]);
		LineSegment3D_F32 s3 = new LineSegment3D_F32(coordinates[4], coordinates[5]);
		LineSegment3D_F32 s4 = new LineSegment3D_F32(coordinates[6], coordinates[7]);
		
		LineSegment3D_F32 s5 = new LineSegment3D_F32(coordinates[0], coordinates[3]);
		LineSegment3D_F32 s6 = new LineSegment3D_F32(coordinates[4], coordinates[7]);
		LineSegment3D_F32 s7 = new LineSegment3D_F32(coordinates[1], coordinates[2]);
		LineSegment3D_F32 s8 = new LineSegment3D_F32(coordinates[5], coordinates[6]);
		
		LineSegment3D_F32 s9 = new LineSegment3D_F32(coordinates[0], coordinates[4]);
		LineSegment3D_F32 s10 = new LineSegment3D_F32(coordinates[3], coordinates[7]);
		LineSegment3D_F32 s11 = new LineSegment3D_F32(coordinates[1], coordinates[5]);
		LineSegment3D_F32 s12 = new LineSegment3D_F32(coordinates[2], coordinates[6]);
		
		Vector3D_F32 v0 = new Vector3D_F32(O, x);
		Vector3D_F32 v1 = new Vector3D_F32(coordinates[0], coordinates[1]);
		Vector3D_F32 v2 = new Vector3D_F32(coordinates[0], coordinates[3]);
		Vector3D_F32 v3 = new Vector3D_F32(coordinates[0], coordinates[4]);
		
		
		if (s1.getLength() == s2.getLength() && s2.getLength() == s3.getLength() && s3.getLength() == s4.getLength()) {
			if (s5.getLength() == s6.getLength() && s6.getLength() == s7.getLength() && s7.getLength() == s8.getLength()) {
				if (s9.getLength() == s10.getLength() && s10.getLength() == s11.getLength() && s11.getLength() == s12.getLength()) {
					if (v1.dot(v2) == 0 && v1.dot(v3) == 0 && v2.dot(v3) == 0 && v0.dot(v3) == 0) {
						return true;
					}
				}
			}
		}
		return false;
	}

	 

}
