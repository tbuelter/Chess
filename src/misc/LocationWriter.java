package misc;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;



/**
 * Simple program to write Location Data to a file called "Location.txt"(because writhing them by hand would take too long).
 */
public class LocationWriter {
    private static final String Path =  "res/Locations.txt";
    public static void main(String[] args) throws IOException {
        Ml.println("WRITING LOCATIONS TO FILE");
        BufferedWriter bW = new BufferedWriter(new FileWriter(Path));
        int row = 20, collum = 20;
            for(int j = 0;j<9;j++){
                for(int i = 0;i<9;i++){
                    bW.write(row+";"+collum+"\n");
                    row+=40;
                }
                row = 20;
                collum+=40;
            }
        bW.close();
        Ml.println("DONE WRITING LOCATIONS TO FILE");

    }
}
