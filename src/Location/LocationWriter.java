package Location;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class LocationWriter {

    double row = 107.5, collum = 62.5;
    public double[][] locationsX = new double[8][8];
    public double[][] locationsY = new double[8][8];

    double[][] writeLocationsX() {
        for (int i = 0; i < locationsX.length; i++) {
            for (int j = 0; j < locationsX.length; j++) {
                locationsX[i][j] = collum;
                row += 62.5;
            }
            row = 107.5;
            collum += 62.5;
        }
        return locationsX;
    }

    double[][] writeLocationsY() {
        for (int i = 0; i < locationsX.length; i++) {
            for (int j = 0; j < locationsX.length; j++) {
                locationsY[i][j] = row;
                row += 62.5;
            }
            row = 107.5;
            collum += 62.5;
        }
        return locationsY;
    }

}
