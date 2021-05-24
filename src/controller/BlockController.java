package controller;

import georegression.struct.point.Point3D_F32;
import model.Block;

public class BlockController {
    private Block blockModel;

    public BlockController(Point3D_F32 coordinates[]) {
        if (coordinates.length == 8) {
            blockModel = new Block(coordinates);
        } else {
            throw new RuntimeException("Invalid number of points.");
        }
    }
    
}
