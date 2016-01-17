package otherObjects;

/**
 * Created by niklasbalazs on 17/01/16.
 */

    // Each figure has a number in the array, where after the image of a figure was moved the number also will move to the new location.
    // White figures: 1 to 6
    // Black figures: -1 to -6
    // BLACK:
    //  Pawn: 1
    //  Bishop: 2
    //  Tower: 3
    //  Knight: 4
    //  Queen: 5
    //  King: 6
    //  ----------
    // WHITE:
    //  Pawn: -1
    //  Bishop: -2
    //  Tower: -3
    //  Knight: -4
    //  Queen: -5
    //  King: -6


public class PositionsFigures {
    public static int[][] positionsOBlackfFigures = new int[][] {
            { 0, 0, 0, 0, 0, 0, 0, 0 },
            { 0, 0, 0, 0, 0, 0, 0, 0 },
            { 0, 0, 0, 0, 0, 0, 0, 0 },
            { 0, 0, 0, 0, 0, 0, 0, 0 },
            { 0, 0, 0, 0, 0, 0, 0, 0 },
            { 0, 0, 0, 0, 0, 0, 0, 0 },
            { 0, 0, 0, 0, 0, 0, 0, 0 },
            { 0, 0, 0, 0, 0, 0, 0, 0 },
    };

    public static int[][] positionsOfWhiteFigures = new int[][] {
            { 0, 0, 0, 0, 0, 0, 0, 0 },
            { 0, 0, 0, 0, 0, 0, 0, 0 },
            { 0, 0, 0, 0, 0, 0, 0, 0 },
            { 0, 0, 0, 0, 0, 0, 0, 0 },
            { 0, 0, 0, 0, 0, 0, 0, 0 },
            { 0, 0, 0, 0, 0, 0, 0, 0 },
            { 0, 0, 0, 0, 0, 0, 0, 0 },
            { 0, 0, 0, 0, 0, 0, 0, 0 },
    };
}
