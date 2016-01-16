package Buttons;

import misc.Ml;
import otherObjects.Player;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class NewGameButton {
    Image[] images = new Image[6];
    Image King,Queen,Knight,Tower,Bishop,Pawn;
    Graphics Grafik;
    public void newGame(){
    String WhiteName = Ml.InputMessage("Name", "Name for white");
        Player White = new Player(WhiteName);
        String BlackName = Ml.InputMessage("Name","Name for black");
        Player Black = new Player(BlackName);
        Image King = new ImageIcon("res/KING.png").getImage();
        Image Queen = new ImageIcon("res/QUEEN.png").getImage();
        Image Knight = new ImageIcon("res/KNIGHT.png").getImage();
        Image Tower = new ImageIcon("res/TOWER.png").getImage();
        Image Bishop = new ImageIcon("res/BISHOP.png").getImage();
        Image Pawn = new ImageIcon("res/PAWN.png").getImage();
    }



}

