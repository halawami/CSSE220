import java.util.ArrayList;

/**
 * Class: 		Player
 * Purpose: 	This class handles the players and their properties 
 *
 * Use: 
 *		Player player = new Player(1) //1 is the player's name
 *		player.addCards(String card) //adds card at the end of the 
 *					player's cards
 *		player.playCard(String playingCard, String topCard) //plays card if 
 *					valid, returns null otherwise
 *		player.printPlayerCards() //returns the String "Your cards are" plus 
 *					the  players cards
 *		player.checkWinning() // returns true if player wins, false 
 *					otherwise
 *		player.removePlayingCard(String playingCard) // removes the card 
 *					from the player's cards
 */

public class Player {

	private ArrayList<String> playerCards;
	private String name;

	public Player(String name) {
		this.name = name;
		this.playerCards = new ArrayList<String>();
	}

	public void addCards(String card) {
		this.playerCards.add(card);
	}

	public String playCard(String playingCard, String topCard) {
		if (playingCard.length() <= 1 || playingCard.length() > 3) {
			return null;
		}
		if (playingCard.charAt(0) == topCard.charAt(0) || playingCard.charAt(0) == '8'
				|| playingCard.charAt(1) == topCard.charAt(1)
				|| playingCard.substring(0, 1).equals(topCard.substring(0, 1))
				|| playingCard.length() > 2 && playingCard.charAt(2) == topCard.charAt(1)
				|| topCard.length() > 2 && topCard.charAt(2) == playingCard.charAt(1)) {
			for (int i = 0; i < this.playerCards.size(); i++) {
				if (playingCard.equals(this.playerCards.get(i).toString())) {
					return playingCard;
				}
			}
		}
		return null;
	}

	public String printPlayerCards() {
		String text = "Your cards are ";
		for (int i = 0; i < this.playerCards.size(); i++) {
			text = text + this.playerCards.get(i);
			if (i != this.playerCards.size() - 1) {
				text = text + " ";
			}
		}
		return text;
	}

	public boolean checkWinning() {
		if (playerCards.size() == 0) {
			return true;
		}
		return false;
	}

	public void removePlayingCard(String playingCard) {
		this.playerCards.remove(playingCard);
	}

}
