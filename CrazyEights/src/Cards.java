import java.util.ArrayList;

/**
 * Class: 	Cards
 * Purpose: 	This class handles the cards in a specific deck
 *
 * Use: 
 *		Cards cards = new Cards()
 *		cards.shuffle() //shuffles the cards
 *		cards.giveCard() //return the top card of the deck
 *		cards.get(0) //gets the card at index 0 from the deck
 *		cards.remove(0) //removes the card at index 0 from the deck
 *		cards.testEmptyCards() //return true if empty, otherwise false
 *		cards.size() //gets the size of the cards 
 *		
 */

public class Cards {
	private ArrayList<String> cards;

	public Cards() {
		this.cards = new ArrayList<String>();
	}

	public void addCard(String newCard) {
		this.cards.add(newCard);
	}

	public void addCardPos(int index, String newCard) {
		this.cards.add(index, newCard);
	}

	public void shuffle() {
		ArrayList<String> newList = new ArrayList<String>();
		while (true) {
			int random = (int) (Math.random() * (this.cards.size()));
			if (!newList.contains(this.cards.get(random))) {
				newList.add(this.cards.get(random));
			}
			if (newList.size() == (this.cards.size())) {
				break;
			}
		}
		this.cards = newList;
	}

	public String giveCard() {
		String currentCard = this.cards.get(0);
		this.cards.remove(0);
		return currentCard;
	}

	public String get(int index) {
		return this.cards.get(index);
	}

	public void remove(int index) {
		this.cards.remove(index);
	}

	public boolean testEmptyCards() {
		if (this.cards.size() == 0) {
			return true;
		}
		return false;
	}

	public int size() {
		return this.cards.size();
	}

}
