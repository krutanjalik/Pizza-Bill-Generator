package com.pizza;

public class Main {
public static void main(String[] args) {
//	Pizza basePizza = new Pizza(true);
//	basePizza.addExtraCheese();
//	basePizza.addExtraToppingsAdded();
//	basePizza.takeAway();
//	basePizza.getBill();	
	
	DeluxPizza dp = new DeluxPizza(false);
dp.addExtraCheese();
dp.addExtraToppingsAdded();
	dp.takeAway();
	dp.getBill();

	
}
}

