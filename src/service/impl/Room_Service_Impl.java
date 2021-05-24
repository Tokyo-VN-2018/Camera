package service.impl;

import georegression.struct.point.Point3D_F32;
import model.Block;
import model.Camera;
import model.Room;
import service.Room_Service;

public class Room_Service_Impl implements Room_Service{
	

	@Override
	public boolean containBlock_check(Room room, Block block) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean installCamera_check(Room room, Camera camera) {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	public boolean isValid(Room room) {
		Point3D_F32[] coordinates = room.getCoordinates();
		
//		Segment s1 = new Segment(coordinates[0], coordinates[1]);
//		Segment s2 = new Segment(coordinates[2], coordinates[3]);
//		Segment s3 = new Segment(coordinates[4], coordinates[5]);
//		Segment s4 = new Segment(coordinates[6], coordinates[7]);
//		
//		Segment s5 = new Segment(coordinates[0], coordinates[3]);
//		Segment s6 = new Segment(coordinates[4], coordinates[7]);
//		Segment s7 = new Segment(coordinates[1], coordinates[2]);
//		Segment s8 = new Segment(coordinates[5], coordinates[6]);
//		
//		Segment s9 = new Segment(coordinates[0], coordinates[4]);
//		Segment s10 = new Segment(coordinates[3], coordinates[7]);
//		Segment s11 = new Segment(coordinates[1], coordinates[5]);
//		Segment s12 = new Segment(coordinates[2], coordinates[6]);
		
		
		
		
		
		return false;
	}

}
