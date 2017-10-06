import java.util.ArrayList;
import java.util.Scanner;

/**
 * Class: 	CrazyEights
 * Purpose: This class handles the game, the commands and moves
 * 			
 * Use: 
 * 		CrazyEights() //initializes the variables
 * 		handleCommand("start-game 2 testDeck false") //Decodes a command 
 * 					and invokes the right method.
 * 		handleStartGame(2,testDeck,true) // Handles starting a game for the 
 * 					specified number of players with the specified deck.
 * 		handlePlayCard("JH") //Handles the play-card command.
 * 		handleDrawCard() //Handles the draw-card command.
 * 		passBeginnerCards() //passes the cards at the beginning of the game
 * 		discardCard(String thisCard) //adds cards to the discard or playing deck
 * 		firstCard() // moves top card of newCards to the discard pile 
 * 		maybeFillCards() //adds the discard card to the new cards deck in 
 * 					case it ran out of cards
 * 		playCardText() //prints the properties of the current player and 
 * 					the top card of the discard deck
 * 		createOutputPlayCardString("Cards dealt.\n") //prints cards dealt 
 * 					and then prints the properties if the current player
 */

public class CrazyEights {
	private static final String[] DEFAULT_DECK = NamedDecks.standardDeck;
	private static final boolean DEFAULT_SHUFFLE = false;

	private ArrayList<Player> players;
	private ArrayList<String> cards;
	private Cards newCards;
	private Cards discardCards;
	private String upperCard;
	private int currentPlayer;
	private int amountPlayers;
	private boolean playingMode;

	/**
	 * Initialize your fields here (then change this documentation).
	 */
	public CrazyEights() {
		this.players = new ArrayList<Player>();
		this.cards = new ArrayList<String>();
		this.newCards = new Cards();
		this.discardCards = new Cards();
		this.upperCard = "";
		this.currentPlayer = 0;
		this.amountPlayers = 0;
		this.playingMode = false;
	}

	/**
	 * Decodes a command and invokes the right method. You may update this
	 * method if you find it's necessary for your design, but be careful you
	 * don't break anything. If you make changes to this method, do it in very
	 * small increments and frequently run the tests.
	 * 
	 * @param command
	 *            The command to decode
	 * @return the results of the command. "ok" if success but no result.
	 */

	public String handleCommand(String command) {
		Scanner input = new Scanner(command);
		String commandType = input.next();
		String toReturn = null;

		if (commandType.equals("start-game")) {
			this.players = new ArrayList<Player>();
			this.cards = new ArrayList<String>();
			this.newCards = new Cards();
			this.discardCards = new Cards();
			this.upperCard = "";
			this.currentPlayer = 0;
			this.amountPlayers = 0;
			int numPlayers = input.nextInt();
			String deckName = null;
			boolean shuffle = true;
			if (input.hasNext()) {
				deckName = input.next();
			}
			if (input.hasNextBoolean()) {
				shuffle = input.nextBoolean();
			}
			toReturn = handleStartGame(numPlayers, deckName, shuffle);
		} else if (commandType.equals("play-card")) {
			String cardValue = input.next();
			toReturn = handlePlayCard(cardValue);

		} else if (commandType.equals("draw-card")) {
			toReturn = handleDrawCard();
		} else if (commandType.equals("exit")) {
			input.close();
			System.exit(0);
		} else {
			toReturn = "Unknown command " + commandType;
			if (this.playingMode) {
				return createOutputPlayCardString(toReturn + "\n");
			}
		}
		input.close();

		return toReturn;
	}

	/**
	 * Handles starting a game for the specified number of players with the
	 * specified deck.
	 */
	private String handleStartGame(int numPlayers, String deckName, boolean shuffle) {
		this.playingMode = false;
		int count = 1;
		// System.out.println(shuffle);
		if (numPlayers < 2 || numPlayers > 4) {
			return "Incorrect number of players, must be between 2 and 4.";
		}
		this.amountPlayers = numPlayers;
		for (int i = 0; i < numPlayers; i++) {
			Player player = new Player(Integer.toString(count));
			players.add(player);
			count++;
		}

		String[] currentDeck = null;
		if (deckName == null || !deckName.equals("testDeck")) {
			currentDeck = NamedDecks.standardDeck;
		}

		else {
			currentDeck = NamedDecks.testDeck;
		}

		for (int i = 0; i < currentDeck.length; i++) {
			this.newCards.addCard(currentDeck[i].toString());
		}

		if (!shuffle == false && deckName != null && !deckName.equals("false") ) {
			this.newCards.shuffle();

		}

		passBeginnerCards();
		firstCard();
		this.playingMode = true;

		String result = createOutputPlayCardString("Cards dealt.\n");
		return result;
	}

	/**
	 * Handles the play-card command.
	 * 
	 * @param cardValue
	 *            - The value (rank and suit) of the card to play.
	 * @return The string message to display to the user before the game state
	 *         text.
	 */
	private String handlePlayCard(String cardValue) {
		String playingCard = this.players.get(this.currentPlayer).playCard(cardValue, this.discardCards.get(0));
		if (playingCard == null) {
			String result = createOutputPlayCardString("Card was not valid for play. Please try again." + "\n");
			return result;
		}
		this.discardCards.addCardPos(0, playingCard);
		this.players.get(this.currentPlayer).removePlayingCard(playingCard);
		if (players.get(currentPlayer).checkWinning()) {
			this.playingMode = false;
			return "Player " + (this.currentPlayer + 1) + " wins!";
		}
		this.currentPlayer++;
		if (this.currentPlayer == this.amountPlayers) {
			this.currentPlayer = 0;
		}
		String result = createOutputPlayCardString("Card " + playingCard + " played." + "\n");
		return result;
	}

	/**
	 * Handles the draw-card command.
	 * 
	 * @return The string message to display to the user before the game state
	 *         text.
	 */
	private String handleDrawCard() {
		String drawCard = this.newCards.get(0);
		this.newCards.remove(0);
		maybeFillCards();
		this.players.get(currentPlayer).addCards(drawCard);
		String result = createOutputPlayCardString("Card " + drawCard + " was drawn.\n");
		return result;
	}

	/**
	 * 
	 * Run the CrazyEights in console mode (that is, input is to come from the
	 * console).
	 * 
	 * THIS METHOD IS WRITTEN FOR YOU - no need to edit
	 * 
	 * @param args
	 *            Command line arguments (ignored)
	 */
	public static void main(String[] args) {
		CrazyEights game = new CrazyEights();
		System.out.println("Welcome to CrazyEights.  Enter commands.  Type 'exit' to end.");
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		while (true) {
			String commandLine = scanner.nextLine();
			String result = game.handleCommand(commandLine);
			System.out.println(result);
		}
	}

	public void passBeginnerCards() {
		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < this.players.size(); j++) {
				this.players.get(j).addCards(newCards.giveCard());
			}
		}
	}

	public String discardCard(String thisCard) {
		this.discardCards.addCardPos(0, thisCard);
		return discardCards.get(0);
	}

	public void firstCard() {
		this.discardCards.addCardPos(0, this.newCards.get(0));
		this.newCards.remove(0);
		maybeFillCards();
	}

	public void maybeFillCards() { 
		if (newCards.testEmptyCards()) {
			for (int i = 0; i < discardCards.size() - 1; i++) {
				newCards.addCard(discardCards.get(1));
				discardCards.remove(1);
			}
			newCards.shuffle();
		}
	}

	public String[] playCardText() {
		String[] text = new String[3];
		text[0] = "Player " + (this.currentPlayer + 1) + ", your turn.\n";
		text[1] = this.players.get(this.currentPlayer).printPlayerCards() + "\n";
		text[2] = "The top discard is " + this.discardCards.get(0).toString();
		return text;
	}

	public String createOutputPlayCardString(String start) {
		String result = start;
		String[] text = playCardText();
		for (int i = 1; i < 4; i++) {
			result = result + text[i - 1];
		}
		return result;
	}

}
