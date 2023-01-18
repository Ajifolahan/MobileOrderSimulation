import java.util.Arrays;

// Author: Garrett Goldberg & Momoreoluwa Ayinde
// ArrayListS.java creates the data structure for the arraylist of food from Food.java that will be used in the program. 

public class ArrayListS {
//instance variables
	private Food[] array;
	private int numberOfItems;

	// Creates the initial arraylist of food
	//default constructor
	public ArrayListS() {
		array = new Food[5];
	}

	// Adds an item to the end of the arraylist
	public void add(Food item) {
		if (numberOfItems < array.length) {
			array[numberOfItems] = item;
			numberOfItems += 1;
		} else {
			int num = (int) (array.length * 1.5);
			Food[] array2 = new Food[num];
			array2[numberOfItems] = item;
			for (int i = 0; i < array.length; i++) {
				array2[i] = array[i];
			}
			numberOfItems += 1;
			array = array2;
		}
	}

	// Returns an item from the arraylist
	public Food get(int index) {
		return array[index];
	}

	// Sets an item to be part of the arraylist at an index
	public void set(int index, Food item) {
		array[index] = item;
	}

	// Removes an item from the arraylist
	public void remove(int index) {
		array[index] = null;
		for (int i = index; i < array.length - 1; i++) {
			array[i] = array[i + 1];
		}
		numberOfItems -= 1;
	}

	// Returns size of arraylist
	public int size() {
		return numberOfItems;
	}

	// Prints arraylist as a string
	public void print() {
		for (int i = 0; i < numberOfItems; i++) {
			if (i < numberOfItems - 1) {
				System.out.println(array[i]);
			} else if (i == numberOfItems - 1) {
				System.out.println(array[numberOfItems - 1]);
			}
		}
	}

}
