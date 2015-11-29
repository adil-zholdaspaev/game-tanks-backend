package net.omsu.tanks.model;

/**
 *
 */
public class Tank extends RectangularUnit {

    private final long playerId;

    public Tank(long id, double x, double y, long width, long height, long playerId) {
        super(id, x, y, width, height);
        this.playerId = playerId;
    }

    public long getPlayerId() {
        return playerId;
    }
}
