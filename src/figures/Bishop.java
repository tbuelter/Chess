package Figures;

import Location.Location;
import Player.*;
public class Bishop {
    public Player player;
    public Location loc;
    public int[] steplengthX = {-1, -2, -3, -4, -5, -6, -7,  1,  2,  3,  4,  5,  6,  7 , 1,  2,  3,  4,  5,  6,  7, -1, -2, -3, -4, -5, -6, -7 };
    public int[] steplengthY = {-1, -2, -3, -4, -5, -6, -7, -1, -2, -3, -4, -5, -6, -7,  1,  2,  3,  4,  5,  6,  7,  1,  2,  3,  4,  5,  6,  7 };
    public Bishop(Player player, Location loc){
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
