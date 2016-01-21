package Logic;

/**
 * Created by niklasbalazs on 18/01/16.
 */
public class Movement {

    static int lastXValue, lastYValue;

    public Movement(int lastXValue, int lastYValue) {
        this.lastXValue = lastXValue;
        this.lastYValue = lastYValue;
        // After the end of the move algorithm the curent x and y values have to be saved to be able to clear the field at this positon after the next move


    }
}
