package GameLogic.Components.Cards;

import GameLogic.Components.Card;
import Util.Coordinate;
import Util.CoordinateFunctions;

import java.util.Set;

public class Flail implements Card {
    private final int cost = 2;
    private final int[][] attack = {
            {0,0,1,0,0},
            {0,0,0,0,0},
            {1,0,0,0,1},
            {0,0,0,0,0},
            {0,0,1,0,0}
    };
    @Override
    public Set<Coordinate> getAttack() {
        return CoordinateFunctions.bitArrayToCoord(attack);
    }

    @Override
    public int getCost() {
        return cost;
    }
}
