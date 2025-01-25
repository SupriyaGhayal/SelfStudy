
1. calculates the monthly bill amount for Electricity bill

package lab;

import java.util.Scanner;
public class Electricbill 

{
	
	    public static void main(String[] args) 
	    
	    {
	       
	        Scanner scanner = new Scanner(System.in);

	       
	        double rate1 = 3.50;  
	        double rate2 = 4.50;  
	        double rate3 = 6.00;  

	       
	        System.out.print("Enter the number of units consumed: ");
	        int units = scanner.nextInt();

	        double billAmount = 0;


	        if (units <= 100) 
	        {
	            billAmount = units * rate1; 
	        } 
	        
	        else if (units <= 200) 
	        {
	            billAmount = (100 * rate1) + ((units - 100) * rate2);  
	        } 
	        
	        else
	        {
	            billAmount = (100 * rate1) + (100 * rate2) + ((units - 200) * rate3); 
	        }

	    
	        System.out.println("Total electricity bill: $" + billAmount);

	       
	        scanner.close();
	    }
	}



output:

Enter the number of units consumed: 250
Total electricity bill: $1100.0





2.calculate area of Rectangle, Square, Circle and Triangle using inheritance.


package lab;

public class Shape 
{
	
	    public double area() 
	    {
	        return 0.0;  
	    }
	}


	class Rectangle extends Shape 
	{
	    double length;
	    double width;

	    public Rectangle(double length, double width)
	    {
	        this.length = length;
	        this.width = width;
	    }

	    
	    @Override
	    public double area() 
	    {
	        return length * width;
	    }
	}

	
	class Square extends Rectangle 
	{
	   
	    public Square(double side) 
	    {
	        super(side, side);  
	    }

	  
	}

	
	class Circle extends Shape
	{
	    double radius;

	   
	    public Circle(double radius) 
	    {
	        this.radius = radius;
	    }

	  
	    @Override
	    public double area()
	    {
	        return Math.PI * radius * radius;
	    }
	}

	
	class Triangle extends Shape {
	    double base;
	    double height;

	   
	    public Triangle(double base, double height) {
	        this.base = base;
	        this.height = height;
	    }

	    
	    @Override
	    public double area() 
	    {
	        return 0.5 * base * height;
	    }
	}
	
	
.....main class of shape.....


package lab;

public class Shapemain 
{
	public static void main(String[] args) 
    {
      
        Shape rectangle = new Rectangle(5.0, 10.0);
        Shape square = new Square(4.0);
        Shape circle = new Circle(7.0);
        Shape triangle = new Triangle(6.0, 8.0);

      
        System.out.println("Area of Rectangle: " + rectangle.area());
        System.out.println("Area of Square: " + square.area());
        System.out.println("Area of Circle: " + circle.area());
        System.out.println("Area of Triangle: " + triangle.area());
    }
}






output:

Area of Rectangle: 50.0
Area of Square: 16.0
Area of Circle: 153.93804002589985
Area of Triangle: 24.0




