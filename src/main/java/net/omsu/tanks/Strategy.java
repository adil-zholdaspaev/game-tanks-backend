package net.omsu.tanks;

import net.omsu.tanks.model.Tank;

/**
 *
 */
public interface Strategy {

    void action(Tank tank, Rarar rarar, Game game, RemoteControl remoteControl);
}
