package service.impl;

import model.Block;
import service.Block_Service;

public class Block_Service_Impl implements Block_Service{

	@Override
	public boolean checkValidBlock(Block block) {
		if (block.getPoints().length != 8) {
			return false;
		}
		
		return false;
	}

}
