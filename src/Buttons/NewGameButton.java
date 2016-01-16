package Buttons;

import misc.Ml;
import otherObjects.Player;

public class NewGameButton {

    public void newGame(){
    String WhiteName = Ml.InputMessage("Name", "Name for white");
        Player White = new Player(WhiteName);
        String BlackName = Ml.InputMessage("Name","Name for black");
        Player Black = new Player(BlackName);

    }



}

