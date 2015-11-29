package net.omsu.tanks;

import net.omsu.tanks.model.Player;
import net.omsu.tanks.model.Tank;

/**
 *
 */
public interface Verification {

    void verify(Tank[] tanks, Radar radar, Game game, RemoteControl[] remoteControls, Player[] players);
}
