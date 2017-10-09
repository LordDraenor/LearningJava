
public class SmallPizza extends Pizza{
	public static void main(String Args[]){}
	
	public SmallPizza(){
		this.diameter = 12;
		this.shape="round";
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
		Size = Math.PI*Math.pow(diameter,2)/4;		
		return Size; 
	 }
}
