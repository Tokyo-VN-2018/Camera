package controller;

import model.Block;
import model.Camera;
import model.Point;
import model.Room;
import service.MathCalService;
import service.RoomService;
import service.impl.MathCalServiceImpl;
import service.impl.RoomServiceImpl;

public class RoomController {
    private enum State {
        BLOCKED,
        OBSERVABLE,
        UNOBSERVABLE
    }

    private Room roomModel;
    private int x, y, z;
    private int x0, y0, z0;
    private State pointState[][][];
    private RoomService roomService = new RoomServiceImpl();
    private MathCalService mathCalService = new MathCalServiceImpl();

<<<<<<< Updated upstream
    public RoomController(Point points[]) {
        if (points.length == 8) {
            roomModel = new Room(points);
=======
    public RoomController(Point3D_F32 coordinates[]) {
        if (coordinates.length == 8) {
            roomModel = new Room(coordinates);
            if (!roomService.checkValidRoom(roomModel)) {
                throw new RuntimeException("Invalid room.");
            }
>>>>>>> Stashed changes
            initialize();
        } else {
            throw new RuntimeException("Invalid number of points.");
        }
    }

    private void initialize() {
        x0 = (int)roomModel.getCoordinates()[0].getX();
        y0 = (int)roomModel.getCoordinates()[0].getY();
        z0 = (int)roomModel.getCoordinates()[0].getZ();
        x = (int)roomModel.getCoordinates()[6].getX() - x0;
        y = (int)roomModel.getCoordinates()[6].getX() - y0;
        z = (int)roomModel.getCoordinates()[6].getX() - z0;
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
        if (!roomService.isValidBlockLocation(roomModel, block)) {
            throw new RuntimeException("Invalid block location");
        }
        roomModel.addBlock(block);
    }

    public void addCamera(Camera camera) {
        if (!roomService.isValidCameraLocation(roomModel, camera)) {
            throw new RuntimeException("Invalid camera location");
        }
        roomModel.addCamera(camera);
    }

    public void calculateObservablePoint() {
        for (Camera camera : roomModel.getCameras()) {
            Point3D_F32[] points = roomService.findFieldOfView(roomModel, camera);
            if (points[0].getX() == points[1].getX() && points[0].getX() == points[2].getX()) {
                for (int i = (int)points[0].getZ(); i < (int)points[2].getZ(); i++) {
                    for (int j = (int)points[0].getY(); j < (int)points[1].getY(); j++) {
                        
                    }
                }
            } else if (points[0].getY() == points[1].getY() && points[0].getY() == points[2].getY()) {

            } else {

            }
        }
    }

    public State[][][] getPointsState() {
        return this.pointState;
    }
}
