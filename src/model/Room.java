package model;

import java.util.ArrayList;
import java.util.List;

public class Room {
    private Point[] points;
    private List<Block> blocks = new ArrayList<>();
    private List<Camera> cameras = new ArrayList<>();

    public Room (Point[] points) {
        this.points = points;
    }

    public Point[] getPoints() {
        return this.points;
    }

    public List<Block> getBlocks() {
        return this.blocks;
    }

    public List<Camera> getCameras() {
        return this.cameras;
    }

    public void addBlock(Block block) {
        blocks.add(block);
    }

    public void addCamera(Camera camera) {
        cameras.add(camera);
    }
}
