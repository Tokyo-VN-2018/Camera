<<<<<<< Updated upstream
public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
=======
import java.util.List;

import georegression.struct.point.Point3D_F32;
import service.ReadFileService;
import service.impl.ReadFileServiceImpl;


public class Main {
    public static void main(String[] args) throws Exception {
    	
    	ReadFileService readFile_Service = new ReadFileServiceImpl();
    	
    	// Get file's content
    	List<String> strings = readFile_Service.readFilefromS(args[0]);
		
    	// Get room coordinates
		Point3D_F32[] coorRoom = readFile_Service.getCoorRoom(strings);
		for (Point3D_F32 point3d_F32 : coorRoom) {
			System.out.println(point3d_F32);
		}
		
		System.out.println("----------");
		// Get number of Blocks
		int nOB = readFile_Service.getNumOfBlock(strings);
		System.out.println(nOB);
		
		// Get blocks' coordinates
		List<Point3D_F32[]> coorBlocks = readFile_Service.getCoorBlock(strings);
		for (Point3D_F32[] point3d_F32s : coorBlocks) {
			for (Point3D_F32 coor : point3d_F32s) {
				System.out.println(coor);
			}
		}
		System.out.println("-----------");
		// Get number of Cameras
		int numOfCam = readFile_Service.getNumOfCam(strings);
		System.out.println(numOfCam);
		
		// Get cameras' coordinates ( 1st, 2nd, 3rd is camera's location, 4th, 5th is camera's angle)
		List<Float[]> camInfos = readFile_Service.getCamInfo(strings);
		for (Float[] camInfo : camInfos) {
			for (Float floats : camInfo) {
				System.out.print(floats+" ");
			}
			System.out.println();
		}
>>>>>>> Stashed changes
    }
}
