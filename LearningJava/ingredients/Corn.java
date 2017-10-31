package ingredients;

import Food.Food;

public class Corn implements IIngredient, Food{
	
	public String WhatAmI(){
        return "Corn";
    }
	public Boolean EatableRaw(){
		return false;
	}
	public int Cost(){
        return 13;
    }
	public String toString(){
		return "Corn";
	}

}
