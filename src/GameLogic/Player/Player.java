package GameLogic.Components;

import GameLogic.Player.PlayerData;

import java.util.List;

/**
 * A game player
 */
public interface Player {
    public void gainElixir(int amt);

    //May be helpful to define code for this one in util
    public void drawCard(int amt);
    //Some way to designate the result of the attack?
    public String winText();
    //Call this in constructor
    public void init(int playerID, List<Card> playerDeck);
    public PlayerData getData();
    public int handSize();
    public void takeTurn();
    //TODO: fillHand


}
