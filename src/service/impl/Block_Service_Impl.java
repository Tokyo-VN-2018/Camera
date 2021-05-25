package service.impl;

import georegression.struct.point.Point3D_F32;
import model.Block;
import service.Block_Service;
import service.Math_Cal_Service;

public class Block_Service_Impl implements Block_Service{
	
	Math_Cal_Service math_Cal_Service;

	@Override
	public boolean checkValidBlock(Block block) {
		Point3D_F32[] coordinates = block.getCoordinates();
		if (coordinates.length != 8) {
			return false;
		}else {
			return math_Cal_Service.rectangularCheck(coordinates);
		}
	}

}
