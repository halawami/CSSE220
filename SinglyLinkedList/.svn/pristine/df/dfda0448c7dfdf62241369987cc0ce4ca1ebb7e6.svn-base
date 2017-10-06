package sll;

import java.util.NoSuchElementException;

import org.w3c.dom.Node;

/**
 * This class provides a basic implementation of a singly linked list. It's
 * motivated by the implementation in Big Java, 5e, ch. 16.1.
 * 
 * @author TODO Hussein Alawami on May 5,2017.
 * @param <T>
 *            The type of elements in the list
 */
public class LinkedList<T> implements List<T>, Iterable<T> {

	private ListNode<T> first;
	// Note that in addition to a head (first) pointer
	// this list contains a last pointer.  Be sure to
	// BOTH first and last up to date in all your code.
	private ListNode<T> last;

	/**
	 * Constructs a new, empty linked list.
	 */
	public LinkedList() {
		this.first = null;
		this.last = null;
	}

	@Override
	public String toString() {
		if (this.first == null) {
			return "[]";
		}
		String result = "[";
		ListNode<T> current = this.first;
		while (current != this.last) {
			result += (current.getElement() + ", ");
			current = current.getNext();
		}
		return result + current.getElement() + "]";
	}

	@Override
	public boolean add(T x) {
		if(this.first == null){
			this.first = new ListNode<T>(x);
			this.last = this.first;
		}
		else{
			this.last.setNext(new ListNode<T>(x));
			this.last = this.last.getNext();
		}
		
		return true;
	}

	@Override
	public int size() {
		int count = 0;
		ListNode<T> current = this.first;
		while(current!=null){
			count++;
			current = current.getNext();
		}
		return count;
	}

	@Override
	public void add(int i, T x) throws IndexOutOfBoundsException {
                // Note that this adds at the specific index
		
		if (i > this.size() || i < 0) {
			throw new IndexOutOfBoundsException();
		}
		ListNode<T> front = this.first;
		if (this.size() ==i || this.first == null) {
			this.add(x);
		} else if (i == 0) {
			ListNode<T> newnode = new ListNode<T>(x);
			newnode.setNext(front);
			this.first = newnode;
		} else {
			ListNode<T> newnode = new ListNode<T>(x);
			int current = 0;
			while (current != i-1) {
				current++;
				front = front.getNext();
			}
			newnode.setNext(front.getNext());
			front.setNext(newnode);
			
			
		}
	}

	@Override
	public boolean contains(T x) {
		if(this.first==null){
			return false;
		}
		ListNode<T> temp = this.first;
		while(temp!=null){
			if(temp.getElement().equals(x)){
				return true;
			}
			temp = temp.getNext();
		}
		return false;
	}

	@Override
	public boolean remove(T x) {

		if(!this.contains(x)){
			return false;
		}
		
		if(this.first.getElement().equals(x)){
			this.first= this.first.getNext();
			return true;
		}
		int counter = 0;
		ListNode<T> temp = this.first;
		while(!temp.getNext().getElement().equals(x)){
			temp = temp.getNext();
			counter++;
		}
		temp.setNext(temp.getNext().getNext());
		if(counter==this.size()-1){
			this.last=temp;
			return true;
		}
		return true;
	}


	@Override
	public T get(int index) throws IndexOutOfBoundsException {
	
		if(this.size()==0||index<0){
			throw new IndexOutOfBoundsException();
		}
		int temp =0;
		ListNode<T> current = this.first;
		while(current!=null)
		{
			temp++;
			current = current.getNext();
			if(temp ==index){
				return current.getElement();
			}
		}
		throw new IndexOutOfBoundsException();
	}

	@Override
	public int indexOf(T x) {
		if(this.size()==0){
			return -1;
		}
		if(this.first.getElement().equals(x)){
			return 0;
		}
		int count = 0;
		ListNode<T> current = this.first;
		while(current.getNext()!= null){
			count++;
			if(current.getNext().getElement().equals(x)){
				return count;
			}

			current = current.getNext();
			
		}
		return -1;
	}

	@Override
	public T set(int index, T element) throws IndexOutOfBoundsException {

		if(this.size()==0||index>this.size()||index<1){
			throw new IndexOutOfBoundsException();
		}
		int count = 0;
		ListNode<T> current = this.first;
		while(current.getNext()!=null){
			count++;
			if(count==index){
				T value = current.getNext().getElement();
				ListNode<T> newnode = new ListNode<T>(element);
				newnode.setNext(current.getNext().getNext());
				current.setNext(newnode);
				return value;
			}
			current= current.getNext();
		}
		return null;
	}

	@Override
	public Iterator<T> iterator() {
		return new LinkedListIterator();
	}

	/**
	 * This is an iterator over this list.
	 * 
	 * @author TODO <YOUR_NAME> on <DATE>.
	 */
	private class LinkedListIterator implements Iterator<T> {

		private ListNode<T> current, previous;

		private LinkedListIterator() {
			this.current = null;
			this.previous = null;
		}

		@Override
		public boolean hasNext() {

			if(size()==0)
			{
				return false;
			}
			if(this.current==null&&first!=null){
				return true;
			}
			if(this.current.getNext()!= null)
				return true;
			return false;
		}

		@Override
		public T next() throws NoSuchElementException {

			if(size() ==0||!this.hasNext()){
				throw new NoSuchElementException();
			}
			if(this.current==null){
				this.current=first;
				return this.current.getElement();
			}
			this.previous = this.current;
			this.current = this.current.getNext();
			return this.current.getElement();
		}

		@Override
		public void remove() {
			if(this.current==null){
				throw new IllegalStateException();
			}
			else{
				LinkedList.this.remove(this.current.getElement());
				this.current=null;
			}
		}
	}

}
