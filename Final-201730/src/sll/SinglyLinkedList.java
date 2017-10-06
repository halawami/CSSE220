package sll;

import java.util.ArrayList;


/*
 * A linked list class for storing Strings
 */
public class SinglyLinkedList {

	private class Node {
		public Node(String data, Node next) {
			this.data = data;
			this.next = next;
		}
		public String data;
		public Node next;
	}
	
	private Node first;
	
	public SinglyLinkedList() {
		first = null;
	}
	
	@Override 
	public String toString() {
		String toReturn = "[";
		Node current = first;
		while (current!=null) {
			if (current != first) {
				toReturn += "->";
			}
			toReturn += current.data;
			current = current.next;
		}
		toReturn += "]";
		return toReturn;
	}
	
	/**
	 * Returns the last value in the list
	 * 
	 * For example:
	 * 
	 * "A" -> "B" -> "C" returns "C"
	 * "X" returns "X"
	 * An empty list returns null
	 * 
	 */
	public String getLastValue() {
		if(this.first==null){
			return null;
		}
		
		Node current = this.first;
		
		while(current.next!=null){
			current = current.next;
		}
		
		return current.data;
	}
	
	/**
	 * Inserts a separator value between each existing value of the list
	 * 
	 * For example, for separator Q:
	 * "A" -> "B" -> "C" becomes "A"->"Q"->"B"->"Q"->"C"
	 * "X" -> "Y" becomes "X"->"Q"->"Y"
     * "X" -> "Q" becomes "X"->"Q"->"Q"
	 * "X" stays the same
	 * An empty list stays the same
	 */
	public void insertSeparator(String separatorValue) {
		if(this.first==null || this.first.next == null){
			return;
		}
		Node current = this.first;
		
		while(current.next!= null){
			current.next = new Node(separatorValue,current.next);
			current = current.next.next;
		}
	}
	
	/**
	 * Removes all values between two values.  The values 
	 * themselves are not removed.
	 * 
	 * You can assume both start and end are in the list
	 * 
	 * For example, using the values B and C as start and end
	 * "A" -> "B" -> "Q" -> "C" becomes "A" -> "B" -> "C"
     * "A" -> "B" -> "Q" -> "X" -> "C" becomes "A" -> "B" -> "C"
	 * "X" -> "Y" stays the same
	 * 
	 * */
	public void removeFromTo(String start, String end) {
		Node current = this.first;
		while(current.data!=start){
			current = current.next;
		}
		while(current.next.data!= end){
			current.next = current.next.next;
		}
	}
	
	
	/**
	 * Adds a string as the new first element of this list
	 * 
	 * Note - you should not need to modify this function!
	 * 
	 */
	public void addFirst(String newData) {
		Node newNode = new Node(newData, first);
		this.first = newNode;
	}
	
}

