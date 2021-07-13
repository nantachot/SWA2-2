package com.swa.oop3;

public class Triangle extends Square
{ 
    private static double area = 0;

	//Calculate and return area of triangle
    public double getArea() 
    {
        Triangle.area = (getHeight() * getBase()) / 2;
        return Triangle.area; 
    }

	public double getHeight() {
		// TODO Auto-generated method stub
		return 0;
	}

	public double getBase() {
		// TODO Auto-generated method stub
		return 0;
	}

	public double getHeight2() {
		// TODO Auto-generated method stub
		return 0;
	}
}