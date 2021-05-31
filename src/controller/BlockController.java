package controller;

import model.Block;
<<<<<<< Updated upstream
import model.Point;
=======
import service.BlockService;
import service.impl.BlockServiceImpl;
>>>>>>> Stashed changes

public class BlockController {  
    private BlockService blockService = new BlockServiceImpl();
    private Block blockModel;

<<<<<<< Updated upstream
    public BlockController(Point points[]) {
        if (points.length == 8) {
            blockModel = new Block(points);
=======
    public BlockController(Point3D_F32 coordinates[]) {
        if (coordinates.length == 8) {
            blockModel = new Block(coordinates);
            if (!blockService.checkValidBlock(blockModel)) {
                throw new RuntimeException("Invalid block.");
            }
>>>>>>> Stashed changes
        } else {
            throw new RuntimeException("Invalid number of points.");
        }
    }
    
    public Block getBlock() {
        return this.blockModel;
    }
}
