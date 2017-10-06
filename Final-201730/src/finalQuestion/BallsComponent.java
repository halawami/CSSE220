package finalQuestion;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;


/**
 * Component where drawing is done.  Also handles the threads.
 * 
 * You'll mostly make modifications to this class,
 * as well as develop some classes of your own.
 * 
 * @author hewner
 *
 */
@SuppressWarnings("serial")
public class BallsComponent extends JComponent implements Runnable {
/*
 * PART 3 with static 
 * private static ArrayList<Bouncer> bouncers;
 */
	
	
	private ArrayList<Bouncer> bouncers;
	private ArrayList<BouncerBox> boxes;
	private ArrayList<Spawner> spawners;
		
	/**
	 * Makes the component
	 * 
	 * @param frame passed in so you can add buttons
	 */
	public BallsComponent(JFrame frame) {
		bouncers = new ArrayList<Bouncer>();
		
		boxes = new ArrayList<BouncerBox>();
		BouncerBox box = new BouncerBox(20, 20, 200, 400);
		boxes.add(box);
		
		box = new BouncerBox(240, 20, 200, 400);
		boxes.add(box);
		
		Bouncer bouncer = new Bouncer(100,100); 
		bouncer.setBounds(40, 200, 40, 400);
		bouncers.add(bouncer);
		
		bouncer = new Bouncer(50,50); 
		bouncer.setBounds(40, 200, 40, 400);
		bouncers.add(bouncer);
		
		bouncer = new Bouncer(270,100); 
		bouncer.setBounds(260, 420, 40, 400);
		bouncers.add(bouncer);
		
		
		bouncer = new Teleporter(270,100); 
		bouncer.setBounds(260, 420, 40, 400);
		bouncers.add(bouncer);
		
		
		bouncer = new Teleporter(70,100); 
		bouncer.setBounds(40, 200, 40, 400);
		bouncers.add(bouncer);
		
		Spawner s = new Spawner(90,90);
		s.setBounds(40, 200, 40, 400);
		bouncers.add(s);
		
		JPanel panel = new JPanel();
		JButton up = new JButton("Increase Width");
		panel.add(up);
		frame.add(panel,BorderLayout.SOUTH);
		
		for(Bouncer b : bouncers) {
			up.addActionListener(b);
		}
		
		if(s.isCalled==true){
			createSpawner();
		}
		s.setisCalled(false);
		
		
			
		Thread t = new Thread(this);
		t.start();
	}
		
	/*PART3 with static variables
	 * protected static void createSpawner(){
		Bouncer bouncer = new Bouncer(100,100);
		bouncer.setBounds(40, 200, 40, 400);
		bouncers.add(bouncer);
	}
	 */
	
	
	public void createSpawner(){
		Spawner bouncer = new Spawner(100,100);
		bouncer.setBounds(40, 200, 40, 400);
		bouncers.add(bouncer);
		Bouncer bouncer1 = new Spawner(100,100);
		bouncer1.setBounds(40, 200, 40, 400);
		bouncers.add(bouncer1);
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		
		for(Bouncer b : bouncers) {
			b.draw(g2);	
		}
		for(BouncerBox b : boxes) {
			b.draw(g2);	
		}
	}


	@Override
	public void run() {
		while(true) {
			for(Bouncer b : bouncers) {
				b.updatePosition();
			}
			
			repaint();
			try {
				Thread.sleep(5);
			} catch (InterruptedException e) {
				throw new RuntimeException(e);
			}
		}
		
	}

}
