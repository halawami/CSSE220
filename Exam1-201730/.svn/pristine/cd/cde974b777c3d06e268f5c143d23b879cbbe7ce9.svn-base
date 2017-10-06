import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.util.Random;

/**
 * A class representing a checker board with various draw options
 * 
 * Modify this class in any way you see fit
 * 
 * @author hewner & you
 *
 */
public class CheckerBoard {

	private static final int SQUARE_WIDTH = 20;
	private static final Color LIGHT_SQUARE_COLOR = Color.LIGHT_GRAY;
	private static final Color DARK_SQUARE_COLOR = Color.BLUE;
	private int startingX, startingY;
	private int rows;
	private int columns;
	private int checkerXPos, checkerYPos;
	private Ellipse2D.Double oval = new Ellipse2D.Double(checkerXPos, checkerYPos, SQUARE_WIDTH, SQUARE_WIDTH);

	public CheckerBoard() {
		this.rows = 7;
		this.columns = 7;
		this.startingX = 0;
		this.startingY = 0;
	}

	public CheckerBoard(int x, int y, int rows, int columns) {
		this.startingX = x;
		this.startingY = y;
		this.rows = rows;
		this.columns = columns;
	}

	// The issue I am facing with part 3 and 4 is drawing the oval to the
	// graphics2. I tried many different ways including trying to
	// define the graphics2D in the beginning but that doesn't work as well as
	// it creates a new window.
	public void addRed(int rows, int columns) {
		this.checkerXPos = rows * SQUARE_WIDTH + this.startingX;
		this.checkerYPos = columns * SQUARE_WIDTH + this.startingY;
		oval = new Ellipse2D.Double(this.checkerXPos, this.checkerYPos, SQUARE_WIDTH, SQUARE_WIDTH);

	}

	public void addBlack(int rows, int columns) {
		this.checkerXPos = rows * SQUARE_WIDTH + this.startingX;
		this.checkerYPos = columns * SQUARE_WIDTH + this.startingY;

	}

	public void drawOn(Graphics2D graphics2) {

		// example code to draw one piece (for parts 3 & 4)
		// graphics2.setColor(Color.RED);
		// +this.rows*SQUARE_WIDTH +this.columns*SQUARE_WIDTH
		// graphics2.fillOval(this.checkerXPos, this.checkerYPos, SQUARE_WIDTH,
		// SQUARE_WIDTH);

		// graphics2.fillRect(this.startingX, this.startingY, SQUARE_WIDTH,
		// SQUARE_WIDTH);

		addRed(this.checkerXPos, this.checkerYPos);

		for (int i = 0; i < this.rows; i++) {

			for (int j = 0; j < this.columns; j++) {
				if (i % 2 == 0) {
					if (j % 2 == 0) {
						graphics2.setColor(LIGHT_SQUARE_COLOR);
					} else {
						graphics2.setColor(DARK_SQUARE_COLOR);
					}
				} else {
					if (j % 2 == 0) {
						graphics2.setColor(DARK_SQUARE_COLOR);
					} else {
						graphics2.setColor(LIGHT_SQUARE_COLOR);
					}
				}
				graphics2.fillRect(this.startingX + SQUARE_WIDTH * j, this.startingY + SQUARE_WIDTH * i, SQUARE_WIDTH,
						SQUARE_WIDTH);
			}
		}
		// graphics2.draw(oval);

	}

}
