package Food;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import ingredients.IIngredient;

public abstract class Pizza implements Food{
	 private  String crust; 
	 public  int diameter;
	 private boolean inStock = true;
	 public String shape;
//	 private ArrayList ingredients = new ArrayList();
//	 private HashMap ingredientMap = new HashMap();
//	 public IIngredient getIngredient(int index){
//		 return (IIngredient)this.ingredients.get(index);		 
//	 }
//	 public void addIngredient(IIngredient ing)
//	    {
//	        this.ingredients.add(ing);
//	    }	 
//	 public int Cost() {
//     int cost = 0;
//     Iterator it = ingredients.iterator();
//     while(it.hasNext()){
//         IIngredient value = (IIngredient) it.next();
//         cost =  cost + value.Cost();
//     }
//
//     return cost;
//}
	
//	 public IIngredient getIngredient(String key){		 
//		 return (IIngredient) this.ingredientMap.get(key);
//	 }
//	 
//	 public void addIngredient (String key, IIngredient ing){
//		ingredientMap.put(key, ing); 
//	 }
//	 
//	 public int CostMap(){
//		 int cost = 0;
//		 Iterator iterator = ingredientMap.keySet().iterator();
//		 while (iterator.hasNext()){
//			 String key = (String) iterator.next();
//			 IIngredient val = (IIngredient)ingredientMap.get(key);
//			 cost = cost + val.Cost();
//		 }
//		 return cost;
//	 }
	 
	 private List<IIngredient> ingredients = new ArrayList<>();
	 public IIngredient getIngredient(int index){
		 return this.ingredients.get(index);
	 }
	 public void addIngredient(IIngredient ing){
		 this.ingredients.add(ing);
	 }
	 public int CostHash(){
		 int cost = 0;
		 Iterator<IIngredient> iterator = ingredients.iterator();
		 while (iterator.hasNext()){
			 IIngredient value = iterator.next();
			 cost = cost+value.Cost();
		 }
		 return cost;
	 }
	 
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
	 

	 
	 
	 public String WhatAmI() {
		return "Pizza";		 
	 }
	 public Boolean EatableRaw(){
		 return false;
	 }
	
} 
