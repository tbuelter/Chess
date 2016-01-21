package GUI;

import Buttons.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * Created by niklasbalazs on 16/01/16.
 */
public class Window {

    public void paintBack() {
        Graphics g = frame.getGraphics();
        if ((x+y)%2 != 0) {
            g.clearRect(xLocation, yLocation, 130, 130);
            g.setColor(Color.darkGray);
            g.fillRect(xLocation, yLocation, 130, 130);
        } else {
            g.clearRect(xLocation, yLocation, 130, 130);
            g.setColor(Color.white);
            g.fillRect(xLocation, yLocation, 130, 130);
        }
    }

    public void paintPosition() {
        Graphics g = frame.getGraphics();
        g.drawImage(BLACK_KNIGHT, xLocation + 15, yLocation + 5, 100, 120, null);
    }

    JMenuBar menuBar;
    JMenu menu;
    JMenuItem newGame;
    JMenuItem endGame;
    JMenuItem saveGame;
    JFrame frame = new JFrame() {
        @Override
        public void paint(Graphics g) {
            super.paint(g);
            g.setColor(Color.darkGray);
            g.fillRect(0, 45, 1040, 1040);
            int y = 45, x;
            for (int i = 0; i < 4; i++) {
                x = 0;
                for (int j = 0; j < 4; j++) {
                    g.clearRect(x, y, 130, 130);
                    x += 260;
                }
                x = 130;
                y += 130;
                for (int j = 0; j < 4; j++) {
                    g.clearRect(x, y, 130, 130);
                    x += 260;
                }
                y += 130;
            }
            g.drawImage(BLACK_PAWN, 15, 180, 100, 120, null);
            g.drawImage(BLACK_PAWN, 145, 180, 100, 120, null);
            g.drawImage(BLACK_PAWN, 275, 180, 100, 120, null);
            g.drawImage(BLACK_PAWN, 405, 180, 100, 120, null);
            g.drawImage(BLACK_PAWN, 535, 180, 100, 120, null);
            g.drawImage(BLACK_PAWN, 665, 180, 100, 120, null);
            g.drawImage(BLACK_PAWN, 795, 180, 100, 120, null);
            g.drawImage(BLACK_PAWN, 925, 180, 100, 120, null);
            g.drawImage(BLACK_TOWER, 15, 50, 100, 120, null);
            g.drawImage(BLACK_TOWER, 925, 50, 100, 120, null);
            g.drawImage(BLACK_KNIGHT, 145, 50, 100, 120, null);
            g.drawImage(BLACK_KNIGHT, 795, 50, 100, 120, null);
            g.drawImage(BLACK_BISHOP, 275, 50, 100, 120, null);
            g.drawImage(BLACK_BISHOP, 665, 50, 100, 120, null);
            g.drawImage(BLACK_QUEEN, 405, 50, 100, 120, null);
            g.drawImage(BLACK_KING, 535, 50, 100, 120, null);

            g.drawImage(WHITE_PAWN, 15, 830, 100, 120, null);
            g.drawImage(WHITE_PAWN, 145, 830, 100, 120, null);
            g.drawImage(WHITE_PAWN, 275, 830, 100, 120, null);
            g.drawImage(WHITE_PAWN, 405, 830, 100, 120, null);
            g.drawImage(WHITE_PAWN, 535, 830, 100, 120, null);
            g.drawImage(WHITE_PAWN, 665, 830, 100, 120, null);
            g.drawImage(WHITE_PAWN, 795, 830, 100, 120, null);
            g.drawImage(WHITE_PAWN, 925, 830, 100, 120, null);
            g.drawImage(WHITE_TOWER, 15, 960, 100, 120, null);
            g.drawImage(WHITE_TOWER, 925, 960, 100, 120, null);
            g.drawImage(WHITE_KNIGHT, 145, 960, 100, 120, null);
            g.drawImage(WHITE_KNIGHT, 795, 960, 100, 120, null);
            g.drawImage(WHITE_BISHOP, 275, 960, 100, 120, null);
            g.drawImage(WHITE_BISHOP, 665, 960, 100, 120, null);
            g.drawImage(WHITE_QUEEN, 405, 960, 100, 120, null);
            g.drawImage(WHITE_KING, 535, 960, 100, 120, null);
        }
    };


    static Image BLACK_PAWN = new ImageIcon("res/PAWN.png").getImage();
    static Image BLACK_TOWER = new ImageIcon("res/TOWER.png").getImage();
    static Image BLACK_KNIGHT = new ImageIcon("res/KNIGHT.png").getImage();
    static Image BLACK_BISHOP = new ImageIcon("res/BISHOP.png").getImage();
    static Image BLACK_QUEEN = new ImageIcon("res/QUEEN.png").getImage();
    static Image BLACK_KING = new ImageIcon("res/KING.png").getImage();
    static Image WHITE_PAWN = new ImageIcon("res/PAWN_WHITE.png").getImage();
    static Image WHITE_TOWER = new ImageIcon("res/TOWER_WHITE.png").getImage();
    static Image WHITE_KNIGHT = new ImageIcon("res/KNIGHT_WHITE.png").getImage();
    static Image WHITE_BISHOP = new ImageIcon("res/BISHOP_WHITE.png").getImage();
    static Image WHITE_QUEEN = new ImageIcon("res/QUEEN_WHITE.png").getImage();
    static Image WHITE_KING = new ImageIcon("res/KING_WHITE.png").getImage();

    int x = 0, y = 0;
    int xLocation = 0, yLocation = 305;

    public Window() {

        frame.setTitle("Chess");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setBackground(Color.white);

        ActionListener actionListener = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() instanceof JButton) {

                    // Each figure has a number in the array, where after the image of a figure was moved the number also will move to the new location.
                    // So here will be asked which figure is on the position clicked of the user.
                    // moveFunction(x, y);

                    if (newGame == e.getSource()) {
                        NewGame.newGame();
                    } else if (endGame == e.getSource()) {
                        SaveGame.saveGame();
                        System.exit(0);
                    } else if (saveGame == e.getSource()) {
                        SaveGame.saveGame();
                    }

                }
            }
        };

        MouseListener mouseListener = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                paintBack();
                x = e.getX() / 130;
                y = (e.getY()-45) / 130;
                xLocation = e.getX() / 130 * 130;
                yLocation = (e.getY()-45) / 130 * 130 + 45;
                paintPosition();
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        };

        frame.addMouseListener(mouseListener);

        menuBar = new JMenuBar();
        menu = new JMenu("Game");
        menuBar.add(menu);
        newGame = new JMenuItem("New Game");
        newGame.addActionListener(actionListener);
        menu.add(newGame);
        endGame = new JMenuItem("End Game");
        endGame.addActionListener(actionListener);
        menu.add(endGame);
        saveGame = new JMenuItem("Save Game");
        saveGame.addActionListener(actionListener);
        menu.add(saveGame);

        frame.setSize(1040, 1085);
        frame.setJMenuBar(menuBar);
        frame.setVisible(true);

    }

    public static void main(String[] args) {
        new Window();
    }

}