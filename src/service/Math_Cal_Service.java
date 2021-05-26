package service;

import georegression.struct.point.Point3D_F32;

public interface Math_Cal_Service {
	
	// Check room or block is rectangular prism or not
	boolean rectangularCheck(Point3D_F32[] coordinates);
	
	// Calculate volume rectangular prism
	float volumeRecCal(Point3D_F32[] coordinates);
	
}
