package figures;
import otherObjects.*;
public class King {
    public Player player;
    public Location loc;
    public int[] steplength = {1};
    public King(Player player, Location loc, int steplength){
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
    public int[] getSteplength(){
        return steplength;
    }
}
