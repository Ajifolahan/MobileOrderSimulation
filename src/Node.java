// Author: Garrett Goldberg & Momoreoluwa Ayinde
// Node.java is a class that is used in QueueS.java in order to help create the queue used in the program to simulate a line.

public class Node {
//instance Variables
	private Node next;
	private String item;

	//parametized constructor
	public Node(String item) {
		this.item = item;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}
	
//A string that represents the current object
	@Override
	public String toString() {
		return "Node [next=" + next + ", item=" + item + "]";
	}

}