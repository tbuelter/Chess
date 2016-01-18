package Figures;

import otherObjects.*;

public class PawnWhite {
    public Player player;
    public Location loc;
    public int[] steplengthX = { 0,  0 };
    public int[] steplengthY = { 1,  2 };
    public PawnWhite(Player player, Location loc){
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
