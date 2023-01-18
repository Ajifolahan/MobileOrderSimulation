// Author: Garrett Goldberg & Momoreoluwa Ayinde
// QueueS.java creates the data structure for the queue that is used to simulate a line in the program.

public class QueueS {
	//instance variable
	private int numberOfItems;
	private Node head, tail;

	// Adds an item to the queue
	public void add(String item) {
		Node node = new Node(item);
		if (head == null) {
			head = node;
			tail = head;
		} else {
			tail.setNext(node);
			tail = node;
		}
		numberOfItems += 1;
	}

	// Returns the head of the queue
	public String peek() {
		Node temp = head;
		return temp.getItem();
	}

	// Removes the head of the queue and moves the queue along
	public String remove() {
		Node temp = head;
		head = head.getNext();
		numberOfItems -= 1;
		return temp.getItem();
	}

	// Returns the size of the queue
	public int size() {
		return numberOfItems;
	}

	public boolean isEmpty() {
		return (head == null);
		// if number of items is 0
	}

	// Returns a specific element of the queue
	public String element() {
		return head.getItem();
	}

	// Clears the queue
	public void clear() {
		head = null;
		tail = null;
	}

	// Prints the queue to a string
	public void print() {
		System.out.print("[");
		Node temp = head;
		for (int i = 0; i < numberOfItems; i++) {
			if (i == numberOfItems - 1) {
				System.out.print(temp.getItem());
				temp = temp.getNext();
			} else {
				System.out.print(temp.getItem() + ", ");
				temp = temp.getNext();
			}
		}
		System.out.print("]");
	}

}