package net.omsu.tanks.model;

/**
 *
 */
public class Tank extends RectangularUnit {

    private final long playerId;
    private final boolean isAlive;
    private final long charges;

    public Tank(long id, double x, double y, long width, long height, long playerId, boolean isAlive, long charges) {
        super(id, x, y, width, height);
        this.playerId = playerId;
        this.isAlive = isAlive;
        this.charges = charges;
    }

    public long getPlayerId() {
        return playerId;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public long getCharges() {
        return charges;
    }
}
