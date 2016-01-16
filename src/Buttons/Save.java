package Buttons;


import javax.swing.*;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Save {
    private static  JFileChooser FileChooser = new JFileChooser();
    private static FileFilter fileFilter = new FileNameExtensionFilter(".CHSave");
    private final String Path = "ChessGameSave";

    public static void main(String[] args){
       Save();
    }
    public static void Save(){
    FileChooser.addChoosableFileFilter(fileFilter);
        int choice = FileChooser.showSaveDialog(null);

    }
}
