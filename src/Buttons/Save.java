package Buttons;


import javax.swing.*;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.File;

public class Save {
    private static  JFileChooser FileChooser = new JFileChooser();
    private static FileFilter imageFilter = new FileNameExtensionFilter(".CHSave");
    private final String Path = "ChessGameSave";

    public static void main(String[] args){
       Save();
    }
    public static void Save(){
    FileChooser.addChoosableFileFilter(imageFilter);
        int choice = FileChooser.showSaveDialog(null);

    }
}
