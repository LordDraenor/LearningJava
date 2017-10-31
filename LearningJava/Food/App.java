package Food;

import ingredients.*;

public class App {
	
   public static void main(String Args[]) throws Exception{	   
	    SmallPizza miniPizza = new SmallPizza();
	    System.out.println(miniPizza.pizzaSize());	
	    SqrPizza wierdPizza = new SqrPizza();
	    
	    try{
	    	miniPizza.PizzaIsOutOfStock();
	    } catch (Exception e) {
			System.out.println("E ok man");
		}
	    Pizza bestPizza = wierdPizza.ComparePizzas(miniPizza, wierdPizza);
	    System.out.println("The bigger pizza is " + bestPizza.shape + " and has an area of " + bestPizza.pizzaSize() );
	
	    //System.out.println("The sum of all ingredients is: " + (Salami.Cost()+Corn.Cost()+Tomatoes.Cost()));
	    //System.out.print("The ingredients are " + Salami.WhatAmI()+" " + Corn.WhatAmI()+ " " + Tomatoes.WhatAmI());
	    miniPizza.addIngredient(new Tomatoes());
	    miniPizza.addIngredient(new Corn());
	    miniPizza.addIngredient(new Salami());
//	    miniPizza.addIngredient("Tomatoes", new Tomatoes());
//	    miniPizza.addIngredient("Salami", new Salami());
//	    miniPizza.addIngredient("Corn", new Corn());
	    
//	    System.out.println("The sum of all ingredients is: " + miniPizza.CostMap());
	    System.out.println("The sum of all ingredients is: " + miniPizza.CostHash());
   }
}
