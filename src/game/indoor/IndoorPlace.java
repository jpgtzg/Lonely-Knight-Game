/**
 * Written by Juan Pablo Gutierrz
 */

package game.indoor;

import gamemanager.Player;
import system.SystemSettings;

public class IndoorPlace extends SystemSettings{

    protected boolean firstTime = true;

    protected Player player;

    public IndoorPlace(Player player) {
        this.player = player;
    }
}
