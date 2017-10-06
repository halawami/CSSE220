import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JComponent;

/**
 * Uses the checkerboard class to draw.
 * 
 * You should not need to modify this class,
 * except to reveal commented out code.
 * 
 * @author hewner
 *
 */
public class CBComponent extends JComponent {

	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;

		// FINAL QUESTION Part 1
		// uncomment the code below for stage 1
		// For full credit: DO NOT modify the code below beyond removing
		// comments
		// You will need to modify the Line class

		//PART 1
		CheckerBoard basic = new CheckerBoard();
		basic.drawOn(g2);

		g2.setColor(Color.black);
		g2.drawString("PART 1", 30, 250);
		
		
		
		// PART 2
		
		//makes a 6 row 3 column board with upper left (200,10)
		CheckerBoard narrow = new CheckerBoard(200, 10, 6, 3);
		narrow.drawOn(g2);
		
		//makes a 3 row 5 column board with upper left (170,150)
		CheckerBoard wide = new CheckerBoard(170, 150, 3, 5);
		wide.drawOn(g2);
		
		g2.setColor(Color.black);
		g2.drawString("PART 2", 200, 250);
		
		
		// PART 3
		
		CheckerBoard withPieces = new CheckerBoard(300, 0, 5, 5);
		withPieces.addRed(0,0);
		withPieces.addRed(1, 1);
		//adds a red at row 0 column 4 (upper right)
		withPieces.addRed(0,4);
		withPieces.addBlack(2,0);
		withPieces.addBlack(3,0);
		withPieces.addBlack(4,0);
		
		withPieces.drawOn(g2);
		
		g2.setColor(Color.black);
		g2.drawString("PART 3", 325, 250);
		
		//PART 4
		/*
		String[] arrangement1 = 
			{"  RBR",
			 "BR   "};
		//adds a board with the given arrangement with upper left (420,10)
		CheckerBoard fromArray1 = new CheckerBoard(420, 10, arrangement1);
		fromArray1.drawOn(g2);
				
		String[] arrangement2 = 
			{"RB ",
			 "RB ",
			 "RB ",
			 "   "};
		//adds a board with the given arrangement with upper left (420,70)
		CheckerBoard fromArray2 = new CheckerBoard(420, 70, arrangement2);
		fromArray2.drawOn(g2);
		*/
		g2.setColor(Color.black);
		g2.drawString("PART 4", 435, 250);
		
	}
}
