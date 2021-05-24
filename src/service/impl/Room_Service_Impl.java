package service.impl;

import org.locationtech.jts.geom.Coordinate;
import org.locationtech.jts.triangulate.Segment;

import model.Block;
import model.Camera;
import model.Room;
import service.Math_Cal_Service;
import service.Room_Service;

public class Room_Service_Impl implements Room_Service{
	
	private Math_Cal_Service math_Cal_Service;

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
		Coordinate[] coordinates = room.getCoordinates();
		Segment s1 = new Segment(coordinates[0], coordinates[1]);
		Segment s2 = new Segment(coordinates[2], coordinates[3]);
		Segment s3 = new Segment(coordinates[4], coordinates[5]);
		Segment s4 = new Segment(coordinates[6], coordinates[7]);
		
		
		
		return false;
	}

}
