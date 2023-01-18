import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

//Author: Garrett Goldberg & Momoreoluwa Ayinde
//MenuApp.java uses the ArrayList created from Food.java, MenuCreation, and ArrayList. 
//It also uses a queue to simulate a waiting line for the app, as well as an app that simulates
//and responds to user input. The program also utilizes mealpoints, which are inputted by the user and changed 
//as the program runs.

public class MenuApp {

	public static void main(String[] args) {
		ArrayListS breakfastItems = MenuCreation.menuMaker();
		QueueS queue = new QueueS();
		boolean response = false;
		boolean selection = false;
		boolean mealpointsCheck = false;
		boolean line = false;
		boolean app = true;
		String foodChoice = "";
		int spend = 0;
		int count = 1;
		int mealPoints = 0;

		while (app) {
			Scanner input = new Scanner(System.in);
			System.out.println("Welcome to QU Mobile Order. Please enter your name.");
			String name = input.nextLine();
			while (!line) {
				System.out.println("Is there anyone waiting in line in front of you?");
				String people = input.nextLine();
				if (people.equalsIgnoreCase("Yes")) {
					line = true;
					System.out.println("How many people are on the line?");
					int peopleLine = input.nextInt();
					input.nextLine();
					System.out.println("Please enter their name(s)");
					boolean entered = false;
					while (!entered) {
						String peoplename = input.nextLine();
						queue.add(peoplename);
						if (count < peopleLine) {
							count += 1;
						} else {
							entered = true;
						}
					}

					queue.add(name);

					while (count > 0) {
						System.out.println("The following people are waiting in line: ");
						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						queue.print();
						System.out.println();
						System.out.println(queue.element() + " is next in line. Please wait while they order.");
						try {
							Thread.sleep(7000);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						System.out.println("Thank you " + queue.element() + " for your order. Next in line please.");
						try {
							Thread.sleep(2000);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						queue.remove();
						System.out.println();
						count -= 1;
					}
				} else if (people.equalsIgnoreCase("No")) {
					line = true;
				} else {
					System.out.println("That input is invalid. Please try again.");
				}
			}

			while ((!queue.isEmpty() || line == true) && app == true) {

				while (!mealpointsCheck) {
					System.out.println("Hello, " + name + ".");
					System.out.println("How many mealpoints are in your account?");
					if (input.hasNextInt()) {
						mealpointsCheck = true;
						mealPoints += input.nextInt();
					} else {
						System.out.println("That input is invalid.");
						input.nextLine();
					}
				}
				input.nextLine();

				while (!response) {
					while (!selection) {
						System.out.println();
						System.out.println("Here are the items avaiable at QU Dining:");
						System.out.println();

						for (int i = 0; i < breakfastItems.size(); i++) {
							Food food = breakfastItems.get(i);
							System.out.println(food.toString());
						}

						System.out.println();
						System.out.println("Please input your order.");
						String userInput = input.nextLine();

						Food food = null;
						for (int i = 0; i < breakfastItems.size(); i++) {
							Food currentFood = breakfastItems.get(i);
							String compareFood = currentFood.getItem();
							if (userInput.equalsIgnoreCase(compareFood)) {
								System.out.println("Thank you for your order.");
								System.out.println();
								food = currentFood;
								selection = true;
								break;
							}
						}

						if (food == null) {
							System.out.println("That food is not on the menu, please input a new choice.");
						} else {
							double price = food.getPrice();
							mealPoints -= price;
							spend += price;
						}

					}

					selection = false;

					System.out.println("You have " + mealPoints + " remaining mealpoints.");
					System.out.println("Would you like to make another selection?");
					String lastInput = input.nextLine();

					if (lastInput.equalsIgnoreCase("yes")) {
						System.out.println("Please make another selection.");
					} else if (lastInput.equalsIgnoreCase("no")) {
						System.out.println();
						System.out
								.println("You spent " + spend + " mealpoints. You have " + mealPoints + " remaining.");
						System.out.println();
						System.out.println(
								"Thank you for ordering from QU Dining, " + name + ". We hope to see you again.");
						queue.clear();
						response = true;
						app = false;
					} else {
						System.out.println("That input is invalid, please try again.");
						System.out.println();
						selection = true;
					}

				}

			}
		}

	}
}
