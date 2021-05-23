package controller;

import model.Line;
import model.Point;

/**
 * LineController
 */
public class LineController {
    private Line lineModel;

    public LineController(Line line){
        this.lineModel = line;
    }

    /**
     * getPointFromX
     * Calculate y and z from x and return Point(x,y,z)
     */
    public Point getPointFromX(int x){
        int y, z;
        int t = (x - lineModel.getA0())/ lineModel.getA();
        y = t*lineModel.getB() + lineModel.getB0();
        z = t*lineModel.getC() + lineModel.getC0();
        return new Point(x, y, z);
    }
    /**
     * getPointFromY
     * Calculate x and z from y and return Point(x,y,z)
     */
    public Point getPointFromY(int y){
        int x, z;
        int t = (y - lineModel.getB0())/ lineModel.getB();
        x = t*lineModel.getA() + lineModel.getA0();
        z = t*lineModel.getC() + lineModel.getC0();
        return new Point(x, y, z);
    }
    /**
     * getPointFromZ
     * Calculate x and y from z and return Point(x,y,z)
     */
    public Point getPointFromZ(int z){
        int x, y;
        int t = (z - lineModel.getC0())/ lineModel.getC();
        x = t*lineModel.getA() + lineModel.getA0();
        y = t*lineModel.getB() + lineModel.getB0();
        return new Point(x, y, z);
    }
}
