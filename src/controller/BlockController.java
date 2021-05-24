package controller;

import org.locationtech.jts.geom.Coordinate;
import model.Block;

public class BlockController {
    private Block blockModel;

    public BlockController(Coordinate coordinates[]) {
        if (coordinates.length == 8) {
            blockModel = new Block(coordinates);
        } else {
            throw new RuntimeException("Invalid number of points.");
        }
    }
    
}
