package GUI;

import Buttons.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by niklasbalazs on 16/01/16.
 */
public class Window {

    static JMenuBar menuBar;
    static JMenu menu;
    static JMenuItem newGame;
    static JMenuItem endGame;
    static JMenuItem saveGame;
    public static JFrame frame = new JFrame();
    static JButton buttonsField[][];
    static JPanel panel;

    static int x = 0, y = 0;

    public Window() {

        frame.setTitle("Chess");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);

        ActionListener actionListener = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() instanceof JButton) {
                    for (int i = 0; i < buttonsField.length; i++) {
                        for (int j = 0; j < buttonsField.length; j++) {
                            if (buttonsField[j][i] == e.getSource()) {
                                x = j + 1;
                                y = i + 1;
                            }
                        }
                    }
                    // Each figure has a number in the array, where after the image of a figure was moved the number also will move to the new location.
                    // So here will be asked which figure is on the position clicked of the user.
                    // moveFunction(x, y);

                    if (newGame == e.getSource()) {
                        NewGameButton.newGame();
                    } else if (endGame == e.getSource()) {
                        SaveGameButton.saveGame();
                        frame.dispose();
                    } else if (saveGame == e.getSource()) {
                        SaveGameButton.saveGame();
                    }
                }
            }
        };

        menuBar = new JMenuBar();
        menu = new JMenu("Game");
        menu.setFont(new Font("Helvetica-Thin", Font.PLAIN, 18));
        menuBar.add(menu);
        newGame = new JMenuItem("New Game");
        newGame.setFont(new Font("Helvetica-Thin", Font.PLAIN, 18));
        newGame.addActionListener(actionListener);
        menu.add(newGame);
        endGame = new JMenuItem("End Game");
        endGame.setFont(new Font("Helvetica-Thin", Font.PLAIN, 18));
        endGame.addActionListener(actionListener);
        menu.add(endGame);
        saveGame = new JMenuItem("SaveGameButton Game");
        saveGame.setFont(new Font("Helvetica-Thin", Font.PLAIN, 18));
        saveGame.addActionListener(actionListener);
        menu.add(saveGame);

        panel = new JPanel();
        panel.setLayout(new GridLayout(8, 8));
        buttonsField = new JButton[8][8];

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                buttonsField[j][i] = new JButton("");
                buttonsField[j][i].setOpaque(false);
                buttonsField[j][i].setContentAreaFilled(false);
                buttonsField[j][i].setBorderPainted(false);
                buttonsField[j][i].addActionListener(actionListener);
                panel.add(buttonsField[j][i]);
            }
        }

        frame.setLayout(new BorderLayout());
        frame.setContentPane(new JLabel(new ImageIcon("res/chessboard.gif")));
        frame.setLayout(new BorderLayout());
        panel.setOpaque(false);
        frame.add(panel);
        frame.setSize(1000, 1045);
        frame.setJMenuBar(menuBar);
        frame.setVisible(true);

    }

    public static void main(String[] args) {
        new Window();
    }

}
