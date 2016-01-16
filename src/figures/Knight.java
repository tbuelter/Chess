package figures;

import otherObjects.*;
public class Knight {
    public Player player;
    public Location loc;
    public int steplength;
    public Knight(Player player, Location loc, int steplength){
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
