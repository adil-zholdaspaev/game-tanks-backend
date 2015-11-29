package net.omsu.tanks;

import net.omsu.tanks.model.MapField;
import net.omsu.tanks.model.Player;
import net.omsu.tanks.model.Tank;

/**
 *
 */
public class Main {

    public static void main(String[] args) {
        Strategy[] strategies = new Strategy[4];

        Verification verification = new Verification() {
            public void verify(Tank[] tanks, Radar radar, Game game, RemoteControl[] remoteControls, Player[] players) {
            }
        };

        Game game = new Game();
        MapField[][] map = new MapField[10][10];
        Player[] players = new Player[4];
        Tank[] tanks = new Tank[4];
        RemoteControl[] remoteControls = new RemoteControl[4];

        do {
            Radar radar = new Radar(players, tanks, map);

            int index = 0;
            for (Strategy strategy: strategies) {
                strategy.action(tanks[index], radar, game, remoteControls[index]);
            }
            verification.verify(tanks, radar, game, remoteControls, players);
        } while (/**exit condition*/ false);
    }
}
