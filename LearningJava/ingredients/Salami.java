package ingredients;

import Food.Food;

public class Salami implements IIngredient, Food{
	
	public String WhatAmI(){
        return "Salami";
    }
	public Boolean EatableRaw(){
		return true;
	}
	public int Cost(){
        return 13;
    }
	public String toString(){
		return "Salami";
	}

}
