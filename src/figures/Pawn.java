package figures;

import otherObjects.Location;
import otherObjects.Player;

/**
 * Created by niklasbalazs on 16/01/16.
 */
public class Pawn {
    public Player player;
    public Location loc;
    public int steplength;
    public Pawn(Player player, Location loc, int steplength){
        this.player = player;
        this.loc = loc;
        this.steplength = steplength;
    }
    public Player getName() {
        return player;
    }
    public void setName(Player player) {
        this.player = player;
    }
    public Location getLoc() {
        return loc;
    }
    public void setLoc(Location loc) {
        this.loc = loc;
    }
    public int getSteplength(){
        return steplength;
    }
}
