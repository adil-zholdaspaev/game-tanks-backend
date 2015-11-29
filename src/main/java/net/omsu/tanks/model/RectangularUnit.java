package net.omsu.tanks.model;

/**
 *
 */
public class RectangularUnit extends Unit {

    private final long width;
    private final long height;

    public RectangularUnit(long id, double x, double y, long width, long height) {
        super(id, x, y);
        this.width = width;
        this.height = height;
    }

    public long getWidth() {
        return width;
    }

    public long getHeight() {
        return height;
    }
}
