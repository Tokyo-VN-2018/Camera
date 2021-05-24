package model;

import org.locationtech.jts.geom.Coordinate;

public class Block {
    private Coordinate coordinates[];

    public Block(Coordinate coordinates[]) {
        this.coordinates = coordinates;
    }

    public Coordinate[] getPoints() {
        return coordinates;
    }
}
