package otherObjects;

/**
 * Created by niklasbalazs on 17/01/16.
 */

    // Each figure has a number in the array, where after the image of a figure was moved the number also will move to the new location.
    // White Figures: 1 to 6
    // Black Figures: -1 to -6
    // BLACK:
    //  PawnBlack: 1
    //  Bishop: 2
    //  Tower: 3
    //  Knight: 4
    //  Queen: 5
    //  King: 6
    //  ----------
    // WHITE:
    //  PawnBlack: -1
    //  Bishop: -2
    //  Tower: -3
    //  Knight: -4
    //  Queen: -5
    //  King: -6


public class PositionsFigures {
    public static int[][] positionOfFigures = new int[][] {
            { -3, -4, -2, -5, -6, -2, -4, -3 },
            { -1, -1, -1, -1, -1, -1, -1, -1 },
            {  0,  0,  0,  0,  0,  0,  0,  0 },
            {  0,  0,  0,  0,  0,  0,  0,  0 },
            {  0,  0,  0,  0,  0,  0,  0,  0 },
            {  0,  0,  0,  0,  0,  0,  0,  0 },
            {  1,  1,  1,  1,  1,  1,  1,  1 },
            {  3,  4,  2,  5,  6,  2,  4,  3 },
    };
}
