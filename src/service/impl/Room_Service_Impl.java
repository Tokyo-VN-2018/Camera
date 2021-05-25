package service.impl;

import georegression.struct.point.Point3D_F32;
import model.Block;
import model.Camera;
import model.Room;
import service.Math_Cal_Service;
import service.Room_Service;

public class Room_Service_Impl implements Room_Service {

	Math_Cal_Service math_Cal_Service;

	@Override
	public boolean containBlock_check(Room room, Block block) {
		Point3D_F32[] coordinates = room.getCoordinates();
		Point3D_F32[] location = block.getCoordinates();

		for (Point3D_F32 point3d_F32 : location) {
			if (coordinates[0].getX() < point3d_F32.getX() && point3d_F32.getX() < coordinates[1].getX()) {
				if (coordinates[0].getX() < point3d_F32.getY() && point3d_F32.getY() < coordinates[3].getY()) {
					if (coordinates[0].getZ() < point3d_F32.getZ() && point3d_F32.getZ() < coordinates[4].getZ()) {
						
					}else {
						return false;
					}
				}else {
					return false;
				}
			}else {
				return false;
			}
		}
		
		
		return true;
	}

	@Override
	public boolean installCamera_check(Room room, Camera camera) {
		Point3D_F32[] coordinates = room.getCoordinates();
		Point3D_F32 location = camera.getLocation();

		if (location.getX() == coordinates[1].getX()) {
			if (coordinates[1].getY() < location.getY() && location.getY() < coordinates[2].getY()) {
				if (coordinates[1].getZ() < location.getZ() && location.getZ() < coordinates[5].getZ()) {
					return true;
				}
			}
		}
		
		if (location.getX() == coordinates[0].getX()) {
			if (coordinates[0].getY() < location.getY() && location.getY() < coordinates[3].getY()) {
				if (coordinates[0].getZ() < location.getZ() && location.getZ() < coordinates[4].getZ()) {
					return true;
				}
			}
		}
		
		if (location.getY() == coordinates[0].getY()) {
			if (coordinates[0].getX() < location.getX() && location.getX() < coordinates[1].getX()) {
				if (coordinates[0].getZ() < location.getZ() && location.getZ() < coordinates[4].getZ()) {
					return true;
				}
			}
		}
		
		if (location.getY() == coordinates[3].getY()) {
			if (coordinates[3].getX() < location.getX() && location.getX() < coordinates[2].getX()) {
				if (coordinates[3].getZ() < location.getZ() && location.getZ() < coordinates[7].getZ()) {
					return true;
				}
			}
		}
		
		if (location.getZ() == coordinates[4].getZ()) {
			if (coordinates[4].getX() < location.getX() && location.getX() < coordinates[5].getX()) {
				if (coordinates[4].getY() < location.getY() && location.getY() < coordinates[7].getY()) {
					return true;
				}
			}
		}

		return false;
	}

	@Override
	public boolean checkValidRoom(Room room) {
		Point3D_F32[] coordinates = room.getCoordinates();
		if (coordinates.length != 8) {
			return false;
		}else {
			return math_Cal_Service.rectangularCheck(coordinates);
		}
	}

}
