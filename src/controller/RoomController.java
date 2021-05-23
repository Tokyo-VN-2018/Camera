package controller;

import model.Block;
import model.Camera;
import model.Point;
import model.Room;

public class RoomController {
    private enum State {
        BLOCKED,
        OBSERVABLE,
        UNOBSERVABLE
    }

    private Room roomModel;
    private int x,y,z;
    private State pointState[][][];

    public RoomController(Point points[]) {
        if (points.length == 8) {
            roomModel = new Room(points);
            initialize();
        } else {
            throw new RuntimeException("Invalid number of points.");
        }
    }

    private void initialize() {
        /* calculate x, y, z */
        pointState = new State[x][y][z];
        for (int i = 0; i < pointState.length; i++) {
            for (int j = 0; j < pointState[i].length; j++) {
                for (int k = 0; k < pointState[i][j].length; k++) {
                    pointState[i][j][k] = State.BLOCKED;
                }
            }
        }
    }

    public void addBlock(Block block) {
        roomModel.addBlock(block);
    }

    public void addCamera(Camera camera) {
        roomModel.addCamera(camera);
    }

    public void calculateBlockedPoint() {

    }

    public void calculateObservablePoint() {

    }
}
