package events;

import java.io.File;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Oracle {
	private static final String DB_PATH = "FortuneDatabase.txt";
	
	private ArrayList<String> fortunes;
	private int cursor;
	
	/**
	 * Constructs a new Oracle object with the supplied number of
	 * random fortune cookies read from default database.
	 * @param size
	 */
	public Oracle(int size) {
		this.fortunes = this.getFortunes(size);
		this.cursor = 0;
	}
	
	
	/**
	 * Returns the previous fortune in a cyclic fashion.
	 */
	public String previous() {
		--this.cursor;
		
		int size = this.fortunes.size();
		return this.fortunes.get(Math.abs(this.cursor) % size);
	}
	
	/**
	 * Returns the next fortune in a cyclic fashion.
	 */
	public String next() {
		++this.cursor;

		int size = this.fortunes.size();
		return this.fortunes.get(Math.abs(this.cursor) % size);
	}
	
	
	/**
	 * Reloads the Oracle with new set of fortunes. The number
	 * of the new created fortunes is the same as the initial one.
	 */
	public void reset() {
		this.cursor = 0;
		this.fortunes = this.getFortunes(this.fortunes.size());
	}
	
	/**
	 * Returns a print-friendly string of fortune status.
	 */
	public String info() {
		int size = this.fortunes.size();
		int index = Math.abs(this.cursor) % size;
		
		if(index == 0)
			index = size;
		
		return String.format("Showing %d of %d fortunes", index, this.fortunes.size());
	}
	
	/**
	 * Returns a list of random fortune quotes. 
	 * Some of the quotes may be repeated in the returned list.
	 *  
	 * @param size The number of requested fortunes.
	 * @return A random list of fortunes.
	 */
	private ArrayList<String> getFortunes(int size) {
		ArrayList<String> fortunes = new ArrayList<String>(size);
		Scanner scanner = null;
		try {
			scanner = new Scanner(new File(DB_PATH));
			while(scanner.hasNextLine()) {
				fortunes.add(scanner.nextLine());
			}
		} catch(Exception e) {
			throw new RuntimeException("Error reading the Fortune database", e);
		} finally {
			scanner.close();
		}
		
		
		Random randomGenerator = new Random(System.currentTimeMillis());
		
		ArrayList<String> randomFortunes = new ArrayList<String>(size);
		for(int i = 0; i < size; ++i) {
			int index = randomGenerator.nextInt(fortunes.size());
			randomFortunes.add(fortunes.get(index));
		}
		return randomFortunes;
	}
}
