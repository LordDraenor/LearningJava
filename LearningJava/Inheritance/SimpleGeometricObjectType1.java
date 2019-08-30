package Inheritance;

import java.util.Date;

public class SimpleGeometricObjectType1 {
private String color = "white";
private boolean filled;
private java.util.Date dateCreated;
	public SimpleGeometricObjectType1() {
		dateCreated = new java.util.Date();		
	}
    public SimpleGeometricObjectType1(String color, boolean filled) {
    	dateCreated = new java.util.Date();
    	this.filled = filled;
    	this.color = color;
    }
    public String getColor() {
    	return color;
    }
    public void setColor(String color) {
    	this.color = color;
    }
    public boolean getFilled() {
    	return filled;
    }
    public void setFilled(boolean filled) {
    	this.filled = filled;
    }
    public java.util.Date getDateCreated() {
    	return this.dateCreated;
    }
    public String toString() {
    	return "Created on " + dateCreated + " with color " +  getColor() + " and filled " + filled;
    }
}
