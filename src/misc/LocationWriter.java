package misc;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class LocationWriter {
    private static double[][] locationsX = new double[8][8];
    private static double[][] locationsY = new double[8][8];
    public static void main(String[] args) throws IOException {
        double row = 107.5, collum = 62.5;
        for (int i = 0; i < locationsX.length; i++) {
            for (int j = 0; j < locationsX.length; j++) {
                locationsX[i][j] = collum;
                locationsY[i][j] = row;
                row += 62.5;
            }
            row = 107.5;
            collum += 62.5;
        }
    }
}
