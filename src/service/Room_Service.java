package service;

import model.Block;
import model.Camera;
import model.Room;

public interface Room_Service {

	boolean containBlock_check(Room room, Block block);
	boolean installCamera_check(Room room, Camera camera);
	boolean checkValidRoom(Room room);
}
