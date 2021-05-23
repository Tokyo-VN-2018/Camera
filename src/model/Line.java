package model;

/**
 * Line
 * x = a0 + at;
 * y = b0 + bt;
 * z = c0 + ct;
 */
public class Line {
    private int a0, b0, c0;
    private int a, b, c;

    /**
     * Contructor
     * Make line from 2 point
     */
    public Line(Point point1, Point point2) {
        this.a0 = point1.getX();
        this.b0 = point1.getY();
        this.c0 = point1.getZ();
        this.a = point2.getX() - point1.getX();
        this.b = point2.getY() - point1.getY();
        this.c = point2.getZ() - point1.getZ();
    }

    public int getA0() {
        return this.a0;
    }

    public int getB0() {
        return this.b0;
    }

    public int getC0() {
        return this.c0;
    }

    public int getA() {
        return this.a;
    }

    public int getB() {
        return this.b;
    }

    public int getC() {
        return this.c;
    }

}