package model;

import java.util.ArrayList;
import java.util.List;

import georegression.struct.point.Point3D_F32;

public class Room {
    private Point3D_F32[] coordinates;
    private List<Block> blocks = new ArrayList<>();
    private List<Camera> cameras = new ArrayList<>();

    public Room (Point3D_F32[] coordinates) {
        this.coordinates = coordinates;
    }

    public Point3D_F32[] getCoordinates() {
		return coordinates;
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

    /* public void block() {
        Point root = blocks.get(0).getPoints()[0];
        for (int i = 0; i < blocks.get(0).getZ(); i++) {
            for (int j = 0; j < blocks.get(0).getY(); j++) {
                for (int k = 0; k < blocks.get(0).getX(); k++) {
                    pointState[i + root.getX()][j + root.getY()][k + root.getZ()] = State.BLOCKING;
                }
            }
        }
    } */

    /* public void calculate() {
        Camera camera = cameras.get(0);
        Point cameraPoint = camera.getLocation();
        Point viewPoint;
        int viewHeight, viewWidth;
        int distance;
        if (cameraPoint.getX() == 0 || cameraPoint.getX() == this.x) {
            distance = camera.getDistance() > x ? x : camera.getDistance();
            viewHeight = (int)Math.ceil(distance*Math.tan(camera.getAngleHeight()/2))*2;
            viewWidth = (int)Math.ceil(distance*Math.tan(camera.getAngleWidth()/2))*2;
            viewPoint = new Point(cameraPoint.getX(), cameraPoint.getY() - viewWidth/2, cameraPoint.getZ() - viewHeight/2);
            for (int i = 0; i < viewHeight; i++) {
                for (int j = 0; j < viewWidth; j++) {
                }
            }
        } else if (cameraPoint.getY() == 0 || cameraPoint.getY() == this.y) {
            distance = camera.getDistance() > y ? y : camera.getDistance();
        } else if (cameraPoint.getZ() == this.z) {
            distance = camera.getDistance() > z ? z : camera.getDistance();
        } else {
            if (cameraPoint.getZ() == 0) {
                System.out.println("Ground Camera?");
            } else {
                System.out.println("Flying Camera?");
            }
            return;
        }
    } */
}
