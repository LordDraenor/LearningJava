package Food;

public class SqrPizza extends Pizza{
	
    public static void main(String Args[]){}
	
    public SqrPizza(){
		this.diameter = 12;
		this.shape="square";
	}
	
    private  String pizzaOwner;
    public  String getOwner(){
		return pizzaOwner;		 
	 }
	 public  void setOwner(String value){
		 pizzaOwner = value;
	 }
	 public void sendToCustomer(String customer){
		 customer = pizzaOwner;
	 }
	public void PizzaIsOutOfStock() throws Exception{
		throw new Exception("Panica man!"); 
	}
	public  double pizzaSize(){
		double Size; 
		Size = diameter*diameter;		
		return Size; 
	 }
}
