package net.omsu.tanks;

import net.omsu.tanks.model.MapField;
import net.omsu.tanks.model.Player;
import net.omsu.tanks.model.Tank;

/**
 *
 */
public class Radar {

    private final Player[] players;
    private final Tank[] tanks;
    private final MapField[][] map;

    public Radar(Player[] players, Tank[] tanks, MapField[][] map) {
        this.players = players;
        this.tanks = tanks;
        this.map = map;
    }

    public Player[] getPlayers() {
        return players;
    }

    public Tank[] getTanks() {
        return tanks;
    }

    public MapField[][] getMap() {
        return map;
    }
}
