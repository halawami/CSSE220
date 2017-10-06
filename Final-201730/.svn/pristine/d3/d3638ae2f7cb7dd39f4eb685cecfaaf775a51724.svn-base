package sll;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SinglyLinkedListTest {

	SinglyLinkedList emptyList, list, list2, list3;

	@Before
	public void setUp() {
		this.emptyList = new SinglyLinkedList();
		this.list = new SinglyLinkedList();
		populateList(this.list, new String[] { "A", "B", "C", "D", "E" });

		this.list2 = new SinglyLinkedList();
		populateList(this.list2, new String[] { "w", "x", "v", "q" });

		this.list3 = new SinglyLinkedList();
		populateList(this.list3, new String[] { "1" });

	}

	/*
	 * Populates the list with the items in the given array, in the order
	 * they're given in the array.
	 */
	private void populateList(SinglyLinkedList list, String[] items) {
		for (int i = items.length - 1; i >= 0; i--) {
			list.addFirst(items[i]);
		}
	}

	@After
	public void tearDown() throws Exception {
		this.emptyList = null;
		this.list = null;
		this.list2 = null;
		this.list3 = null;
	}

	@Test
	public void testGetLast() {
		// list is A B C D E
		assertEquals("E", list.getLastValue());
		//checking that you did not modify the list
		assertEquals("[A->B->C->D->E]", list.toString());

		// list2 is w x v q
		assertEquals("q", list2.getLastValue());


		// list3 is 1
		assertEquals("1", list3.getLastValue());

		// emptyList is empty
		assertEquals(null, emptyList.getLastValue());


	}

	@Test
	public void testSeparator() {
		// list is A B C D E
		this.list.insertSeparator("X");
		assertEquals("[A->X->B->X->C->X->D->X->E]",this.list.toString());
		// list2 is w x v q
		this.list2.insertSeparator("x");
		assertEquals("[w->x->x->x->v->x->q]",this.list2.toString());
		//list3 is 1
		this.list3.insertSeparator("x");
		assertEquals("[1]",this.list3.toString());
		this.emptyList.insertSeparator("x");
		assertEquals("[]",this.emptyList.toString());
	}

	@Test
	public void testRemoveFromTo() {
		// list is A B C D E
		this.list.removeFromTo("B", "D");
		assertEquals("[A->B->D->E]", list.toString());

		this.list = new SinglyLinkedList();
		populateList(this.list, new String[] { "A", "B", "C", "D", "E" });
		this.list.removeFromTo("A", "D");
		assertEquals("[A->D->E]", list.toString());

		this.list = new SinglyLinkedList();
		populateList(this.list, new String[] { "A", "B", "C", "D", "E" });
		this.list.removeFromTo("C", "E");
		assertEquals("[A->B->C->E]", list.toString());
		
		this.list = new SinglyLinkedList();
		populateList(this.list, new String[] { "A", "B", "C", "D", "E" });
		this.list.removeFromTo("A", "E");
		assertEquals("[A->E]", list.toString());

	}
	
}
