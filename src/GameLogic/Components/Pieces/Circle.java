package GameLogic.Components.Pieces;

import GameLogic.Components.Card;
import GameLogic.Components.Piece;
import GameLogic.Components.Player;
import Util.Coordinate;
import Util.CoordinateFunctions;
import Util.Pieces;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Mr potential himself
 * this one has no base movement
 * instead relies on weapons to give him power
 */
public class Circle extends Piece {
    private final static int[][] MOVEMENT = {
            {0,0,0,0,0},
            {0,0,1,0,0},
            {0,1,0,1,0},
            {0,0,1,0,0},
            {0,0,0,0,0}
    };

    public Circle(int playerID){
        super(playerID, Pieces.CIRCLE.getCapacity(), MOVEMENT);
    }
}
