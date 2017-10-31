package ingredients;

import Food.Food;

public class Tomatoes implements IIngredient, Food{
	public String WhatAmI(){
        return "Tomatoes";
    }
	public Boolean EatableRaw(){
		return true;
	}
	public int Cost(){
        return 12;
    }
	public String toString(){
		return "Tomatoes";
	}
   
}
