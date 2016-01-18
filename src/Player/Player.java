package Player;

import java.awt.*;

public class Player {
    public String Name;
    public Image[] FIGURES;

    public Player(String Name, Image[] FIGURES) {
        this.FIGURES = FIGURES;
        this.Name = Name;
    }

    public void setName(String Name) {

        this.Name = Name;
    }

    public String getName() {
        return Name;
    }

}
