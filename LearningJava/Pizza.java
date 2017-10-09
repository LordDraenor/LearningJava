
public abstract class Pizza {
	 private  String crust; 
	 public  int diameter;
	 private boolean inStock = true;
	 public String shape;
		 
	 public  String getCrust(){
		return crust;		 
	 }
	 public  void setCrust(String value){
		 crust = value;
	 }
	 public  int getDiameter(){
			return diameter;		 
		 }
	 public  void setDiameter(int value){
			 diameter = value;
		 }

	 public void PizzaIsOutOfStock() throws Exception {
		 inStock = false;
	 }
	 protected abstract double pizzaSize();
	 public static Pizza ComparePizzas(Pizza round,Pizza square){
		 if (round.pizzaSize()>=square.pizzaSize()){
			 return round;
		 }
		 else 
			 return square;
	 }
} 
