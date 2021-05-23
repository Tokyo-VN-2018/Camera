package controller;

import model.Block;
import model.Point;

public class BlockController {
    private Block blockModel;

    public BlockController(Point points[]) {
        if (points.length == 8) {
            blockModel = new Block(points);
        } else {
            throw new RuntimeException("Invalid number of points.");
        }
    }
    
}
