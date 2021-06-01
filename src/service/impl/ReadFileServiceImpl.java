package service.impl;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import georegression.struct.point.Point3D_F32;
import service.ReadFileService;

public class ReadFileServiceImpl implements ReadFileService{

	@Override
	public Point3D_F32[] extractCoor(String stringCoor) {
		
		Point3D_F32[] coordinates = new Point3D_F32[8];
		
		String s = stringCoor.replaceAll("[(),]", "");
		String[] tokens = s.split(" ");
		
		int j = 0;
		for (int i = 0; i < tokens.length; i++) {
			float token = Float.parseFloat(tokens[i])*100;
			if (i%3 == 0) {
				coordinates[j] = new Point3D_F32();
				coordinates[j].x = token;
			}
			if (i%3 == 1) {
				coordinates[j].y = token;
			}
			if (i%3 == 2) {
				coordinates[j].z = token;
				j++;
			}
		}
		
		return coordinates;
	}

	@Override
	public List<String> readFilefromS(String pathString) {
		
		List<String> strings = new ArrayList<>();
        
        File file = new File(pathString);
        
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
		
		return strings;
	}

	@Override
	public Point3D_F32[] getCoorRoom(List<String> strings) {
		String stringCoorRoom =  strings.get(0);
		Point3D_F32[] coorRoom = extractCoor(stringCoorRoom);
		return coorRoom;
	}

	@Override
	public int getNumOfBlock(List<String> strings) {
		int numOfBlock  = Integer.parseInt(strings.get(1));
		return numOfBlock;
	}

	@Override
	public List<Point3D_F32[]> getCoorBlock(List<String> strings) {
		
		List<Point3D_F32[]> results = new ArrayList<>();
		
		List<String> stringCoorBlock = new ArrayList<>();
		for (int i = 2; i <= 1 + Integer.parseInt(strings.get(1)); i++) {
			stringCoorBlock.add(strings.get(i));
		}
		
		for (String string : stringCoorBlock) {
			Point3D_F32[] coorBlock = extractCoor(string);
			results.add(coorBlock);
		}
		
		return results;
	}

	@Override
	public int getNumOfCam(List<String> strings) {
		int numOfCam =  Integer.parseInt(strings.get(2 + Integer.parseInt(strings.get(1))));
		return numOfCam;
	}

	@Override
	public List<Float[]> getCamInfo(List<String> strings) {
		List<Float[]> info = new ArrayList<>();
		List<String> stringCoorCam = new ArrayList<>();
		for (int i = 3 + Integer.parseInt(strings.get(1)); i < strings.size(); i++) {
			stringCoorCam.add(strings.get(i));
		}
		for (String string : stringCoorCam) {
			String s = string.replaceAll("[(),]", "");
			String[] tokens = s.split(" ");
			Float[] camInfo = new Float[5];
			for (int i = 0; i < tokens.length; i++) {
				if (i < 3) {
					camInfo[i] = Float.parseFloat(tokens[i])*100;
				}else {
					camInfo[i] = Float.parseFloat(tokens[i]);
				}
			} 
			info.add(camInfo);
		}
		return info;
	}

}
