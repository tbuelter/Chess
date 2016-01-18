package Figures;

import otherObjects.*;
public class Queen {
    public Player player;
    public Location loc;
    public int[] steplengthX = {-1, -2, -3, -4, -5, -6, -7,  1,  2,  3,  4,  5,  6,  7 , 1,  2,  3,  4,  5,  6,  7, -1, -2, -3, -4, -5, -6, -7, 1,  2,  3,  4,  5,  6,  7,  0,  0,  0,  0,  0,  0,  0, -1, -2, -3, -4, -5, -6, -7,  0,  0,  0,  0,  0,  0,  0 };
    public int[] steplengthY = {-1, -2, -3, -4, -5, -6, -7, -1, -2, -3, -4, -5, -6, -7,  1,  2,  3,  4,  5,  6,  7,  1,  2,  3,  4,  5,  6,  7, 0,  0,  0,  0,  0,  0,  0, -1, -2, -3, -4, -5, -6, -7,  0,  0,  0,  0,  0,  0,  0,  1,  2,  3,  4,  5,  6,  7 };
    public Queen(Player player, Location loc){
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
