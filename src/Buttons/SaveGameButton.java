package Buttons;


import javafx.scene.shape.Path;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.File;
import java.io.FilenameFilter;

public class SaveGameButton {
    private static  JFileChooser FileChooser = new JFileChooser();
    private static final String Path = "ChessGameSave.CHSAVE";
    private static String[]filter = new String[]{".CHSAVE"};

    public static void main(String[] args) {

    }
    public static void saveGame(){
        FileChooser.setFileFilter(new FileNameExtensionFilter("Chess Saves", filter));
        FileChooser.setCurrentDirectory(new File(System.getProperty(Path)));
        int choice = FileChooser.showSaveDialog(null);

    }
}
