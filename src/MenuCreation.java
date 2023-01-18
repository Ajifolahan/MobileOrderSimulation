import java.util.ArrayList;
import java.util.List;

//Author: Garrett Goldberg & Momoreoluwa Ayinde
// MenuCreation.java uses the ArrayListS and Food classes in order to create the menu that will be used in the program.

public class MenuCreation {

	public static ArrayListS menuMaker() {

		Food birdInANest = new Food("Bird in a Nest", 3);
		Food eggSandwich = new Food("Egg Sandwich", 4);
		Food baconEgg = new Food("Bacon Egg & Cheese", 5);
		Food sausageEgg = new Food("Sausage Egg & Cheese", 5);
		Food turkeyBaconEgg = new Food("Turkey Bacon Egg & Cheese", 5);
		Food VeganSausageEgg = new Food("Vegan Sausage Egg & Cheese", 5);
		Food pancake = new Food("Pancake", 2);
		Food frenchToast = new Food("French Toast", 1);

		ArrayListS breakfastFoodMenu = new ArrayListS();

		breakfastFoodMenu.add(birdInANest);
		breakfastFoodMenu.add(eggSandwich);
		breakfastFoodMenu.add(baconEgg);
		breakfastFoodMenu.add(sausageEgg);
		breakfastFoodMenu.add(turkeyBaconEgg);
		breakfastFoodMenu.add(VeganSausageEgg);
		breakfastFoodMenu.add(pancake);
		breakfastFoodMenu.add(frenchToast);

		return breakfastFoodMenu;
	}

}
