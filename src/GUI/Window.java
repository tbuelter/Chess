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

    static JMenuBar menuBar;
    static JMenu menu;
    static JMenuItem newGame;
    static JMenuItem endGame;
    static JMenuItem saveGame;
    static JFrame frame = new JFrame();
    static JPanel[][] panelsField;
    static JPanel panel;
    static boolean switchColor = true;

    static int x = 0, y = 0;
    double xLocation = 0, yLocation = 0;

    public Window() {

        frame.setTitle("Chess");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);

        ActionListener actionListener = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() instanceof JButton) {
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

        MouseListener mouseListener = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if ((x+y)%2 != 0) {
                    panelsField[x][y].setBackground(Color.DARK_GRAY);
                } else {
                    panelsField[x][y].setBackground(Color.white);
                }
                for (int i = 0; i < panelsField.length; i++) {
                    for (int j = 0; j < panelsField.length; j++) {
                        if (panelsField[j][i] == e.getSource()) {
                            x = j;
                            y = i;
                            xLocation = j * 125 - 62.5;
                            yLocation = i * 125 - 62.5;

                            panelsField[j][i].setBackground(Color.green);
                        }
                    }
                }
                System.out.println(e.getSource());
                System.out.println(e.getComponent().getX());
                System.out.println(e.getComponent().getY());
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
        saveGame = new JMenuItem("Save Game");
        saveGame.setFont(new Font("Helvetica-Thin", Font.PLAIN, 18));
        saveGame.addActionListener(actionListener);
        menu.add(saveGame);

        panel = new JPanel();
        panel.setLayout(new GridLayout(8, 8));
        panelsField = new JPanel[8][8];

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                panelsField[j][i] = new JPanel() {
                    @Override
                    public void paintComponent(Graphics g) {
                        super.paintComponent(g);
                    }
                };
                if (switchColor == true) {
                    panelsField[j][i].setBackground(Color.white);
                    switchColor = false;
                } else {
                    panelsField[j][i].setBackground(Color.DARK_GRAY);
                    switchColor = true;
                }
                panelsField[j][i].addMouseListener(mouseListener);
                panel.add(panelsField[j][i]);
            }
            if (switchColor == true) {
                switchColor = false;
            } else {
                switchColor = true;
            }
        }

        frame.add(panel);
        frame.setSize(1040, 1040);
        frame.setJMenuBar(menuBar);
        frame.setVisible(true);

    }

    public static void main(String[] args) {
        new Window();
    }

}
