package figures;

import otherObjects.*;
public class Knight {
    public Player player;
    public Location loc;
    public int[] steplengthX = {-3, -3, -1,  1,  3,  3,  1, -1 };
    public int[] steplengthY = { 1, -1, -3, -3, -1,  1,  3,  3 };
    public Knight(Player player, Location loc){
        this.player = player;
        this.loc = loc;
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
    public int[] getSteplengthX(){
        return steplengthX;
    }
    public int[] getSteplengthY(){
        return steplengthY;
    }
}
