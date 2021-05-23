package model;

public class Camera {
    private Point location;
    private int angleWidth;
    private int angleHeight;
    private int distance;


    public Camera(Point location, int angleWidth, int angleHeight, int distance) {
        this.location = location;
        this.angleWidth = angleWidth;
        this.angleHeight = angleHeight;
        this.distance = distance;
    }

    public Point getLocation() {
        return this.location;
    }

    public int getAngleWidth() {
        return this.angleWidth;
    }

    public int getAngleHeight() {
        return this.angleHeight;
    }

    public int getDistance() {
        return this.distance;
    }
}