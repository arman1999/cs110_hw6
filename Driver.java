import shapes.Rectangle;
import shapes.Square;
import utils.Math;
public class Driver{
	public static void main(String[] args) {
		Square a = new Square(100);
		System.out.println("the area of a is " + a.getArea());
		Rectangle b = new Rectangle(50, 80);
		System.out.println("the area of b is " + b.getArea());
		double init = 15.6;
		System.out.println("factorial of 15 is " + Math.factorial((long)init));
		System.out.println("factorial of 15 is " + Math.factorialLoop((long)init));
	}
}