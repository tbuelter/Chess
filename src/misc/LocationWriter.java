package misc;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class LocationWriter {
    private static String[][] locations = new String[8][8];
    public static void main(String[] args) throws IOException {
        int row = 20, collum = 20;
        for (int i = 0; i < locations.length; i++) {
            for (int j = 0; j < locations.length; j++) {
                locations[i][j] = ""+collum+"|"+row+""; // Reading it out later by String[] split = location[i][j].split("|"); collum = split[0]; row = split[1];
                row += 40;
            }
            row = 20;
            collum += 40;
        }
    }
}
