
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
   }
}
