package Buttons;

import misc.Ml;
import Player.Player;

import javax.swing.*;
import java.awt.*;

public class NewGameButton {
    public static Image[] FIGURES_BLACK, FIGURES_WHITE;


    public static  void newGame() {
        String WhiteName = Ml.InputMessage("Name", "Name for white");
        Image WHITE_KING = new ImageIcon("res/KING_WHITE.png").getImage();
        Image WHITE_QUEEN = new ImageIcon("res/QUEEN_WHITE.png").getImage();
        Image WHITE_KNIGHT = new ImageIcon("res/KNIGHT_WHITE.png").getImage();
        Image WHITE_TOWER = new ImageIcon("res/TOWER_WHITE.png").getImage();
        Image WHITE_BISHOP = new ImageIcon("res/BISHOP_WHITE.png").getImage();
        Image WHITE_PAWN = new ImageIcon("res/PAWN_WHITE.png").getImage();
        FIGURES_WHITE = new Image[]{WHITE_BISHOP, WHITE_KING, WHITE_KNIGHT, WHITE_PAWN, WHITE_QUEEN, WHITE_TOWER};
        Player White = new Player(WhiteName, FIGURES_WHITE);
        String BlackName = Ml.InputMessage("Name", "Name for black");
        Image BLACK_KING = new ImageIcon("res/KING.png").getImage();
        Image BLACK_QUEEN = new ImageIcon("res/QUEEN.png").getImage();
        Image BLACK_KNIGHT = new ImageIcon("res/KNIGHT.png").getImage();
        Image BLACK_TOWER = new ImageIcon("res/TOWER.png").getImage();
        Image BLACK_BISHOP = new ImageIcon("res/BISHOP.png").getImage();
        Image BLACK_PAWN = new ImageIcon("res/PAWN.png").getImage();
        FIGURES_BLACK = new Image[]{BLACK_BISHOP,BLACK_KING,BLACK_KNIGHT,BLACK_PAWN,BLACK_QUEEN,BLACK_TOWER};
        Player Black = new Player(BlackName, FIGURES_BLACK);
        Ml.println("SPIEL ERFOLGREICH GELADEN");
    }


}

