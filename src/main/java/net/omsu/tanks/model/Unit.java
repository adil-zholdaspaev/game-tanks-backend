package net.omsu.tanks.model;

/**
 *
 */
public class Unit {

    private final long id;
    private final double x;
    private final double y;

    public Unit(long id, double x, double y) {
        this.id = id;
        this.x = x;
        this.y = y;
    }

    public long getId() {
        return id;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}
