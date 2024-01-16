
//Q1. Write a Java program to create a class called Shape with a method called getArea(). 
//Create a subclass called Rectangle that overrides the getArea() method to calculate
package Test1;

//parent class
class Shape{
	int l,b;
	float getArea(int l,int b) {
		this.l=l;
		this.b=b;
		float area=l*b;

		return area;
	}
}

//sub class
class Rectangle extends Shape{
	float getArea() {
		return super.getArea(5, 6);
	}
}


public class shape {

	public static void main(String[] args) {
		Rectangle r=new Rectangle();

		System.out.println("Area ="+r.getArea());

	}

}