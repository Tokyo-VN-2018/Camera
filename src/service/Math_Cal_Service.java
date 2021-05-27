package service;

import java.util.List;

import georegression.struct.line.LineParametric3D_F32;
import georegression.struct.point.Point3D_F32;
import model.Block;

public interface Math_Cal_Service {
	
	// Check room or block is rectangular prism or not
	boolean rectangularCheck(Point3D_F32[] coordinates);
	
	// Calculate volume rectangular prism
	float volumeRecCal(Point3D_F32[] coordinates);
	
	List<Point3D_F32> getInterBlockAndSegment(Block block, LineParametric3D_F32 line);
	
}
