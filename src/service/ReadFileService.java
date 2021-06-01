package service;

import java.util.List;

import georegression.struct.point.Point3D_F32;

public interface ReadFileService {
	
	/**
	 * Get coordinates from string
	 */
	Point3D_F32[] extractCoor(String string);
	
	/**
	 * Get the entire contents of the file
	 */
	List<String> readFilefromS(String pathString);
	
	/**
	 * get room coordinates from file
	 */
	Point3D_F32[] getCoorRoom(List<String> strings);
	
	/**
	 * Get number of Block
	 */
	int getNumOfBlock(List<String> strings);
	
	/**
	 * Get blocks coordinates
	 */
	List<Point3D_F32[]> getCoorBlock(List<String> strings);
	
	/**
	 * Get number of Camera
	 */
	int getNumOfCam(List<String> strings);
	
	/**
	 * Get location, angle of Camera
	 */
	List<Float[]> getCamInfo(List<String> strings);
}
