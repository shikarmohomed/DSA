class Rectangle
{
	double length;
	double width;
	
	public Rectangle(){
		length = 0;
		width = 0;
	}
	
	public void setLength(double length)
	{
		this.length = length;
	}
	public void setWidth(double width)
	{
		this.width = width;
	}
	
	public double getLength()
	{
		return this.length;
	}
	public double getWidth()
	{
		return this.width;
	}
	public double getPerimeter()
	{
		return 2* (length + width);
	}
	public double getArea()
	{
		return (length * width);
	}
}
public class TestRectangle{
	public static void main(String [] args)
	{
		Rectangle R1 = new Rectangle();
		Rectangle R2 = new Rectangle();
		
		R1.setLength(6.0);
		R1.setWidth(4.0);
		
		R2.setLength(1.87);
		R2.setWidth(2.7);
		
		System.out.println("The perimeter of the first rectangle was: " + R1.getPerimeter());
		System.out.println("The area of the first rectangle was: " + R1.getArea());
		
		System.out.println("The perimeter of the second rectangle was: " + R2.getPerimeter());
		System.out.println("The area of the second rectangle was: " + R2.getArea());
	}
}