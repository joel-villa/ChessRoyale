package GameLogic.Components;

import Util.Coordinate;

import java.util.Set;

public interface Piece {
    Coordinate getPosition();
    Set<Coordinate> getMovement();
    Set<Coordinate> getAttack();
    Set<Card> getWeapons();
    void takeDamage();
}
