/* Create an abstract class Figure with following properties and functions:
Properties:
double dim1;
Methods:
abstract void findArea();
abstract void findPerimeter();
Create three subclasses Circle, Rectangle and Triangle that extends Figure class and define both
the methods. Write a program that will find the area and perimeter of 3 Figures and print the
details for all.
*/

abstract class Figure {		// abstract class Figure because we have a abstract method in it.
	double dim1;
	
	abstract void findArea();	// abstract method findArea
	abstract void findPerimeter();	// abstract method findPerimeter
	abstract void findDetails();	// abstract method findDetails

	public static void main(String[] args)
	{
		Circle c = new Circle();	// Object c of class Circle and initiating constructor Circle
		Rectangle r = new Rectangle();	// Object r of class Rectangle and initiating constructor Rectangle
		Triangle t = new Triangle();	// Object t of class Triangle and initiating constructor Triangle
	//	
		c.findDetails();
	//
		r.findDetails();
	//
		t.findDetails();
	}
}

class Circle extends Figure {

	double radius;
	double PI=3.14159;	// Since PI is constant so in CAPS.

	public void findDetails(){
		System.out.println("PRINT DETAILS OF A CIRCLE");
		System.out.println("=========================");
		System.out.print("Enter the radius: ");
		this.radius = Integer.parseInt(System.console().readLine());	// Use this keyword to refer class variables
		System.out.println("-------------------------");
		findArea();	// method findArea called which is overriden in class Circle
		findPerimeter();	// method findPerimeter called which is overriden in class Circle
		System.out.println();
	}
	
	@Override	// @Override used to override the abstract method.
	public void findArea(){
		System.out.println("Area of Circle: " + getArea());
	}
	
	@Override	// @Override used to override the abstract method.
	public void findPerimeter(){
		System.out.println("Perimeter of Circle: "+ getPerimeter());
	}

	public double getArea(){
		return this.PI*this.radius*this.radius;
	}

	public double getPerimeter(){
		return 2*PI*this.radius;
	}
}

class Rectangle extends Figure {

	double width;
	double length;

	public void findDetails(){
		System.out.println("PRINT DETAILS OF A RECTANGLE");
		System.out.println("============================");
		System.out.print("Enter the width: ");
		this.width = Integer.parseInt(System.console().readLine());
		System.out.print("Enter the length: ");
		this.length = Integer.parseInt(System.console().readLine());
		System.out.println("----------------------------");
		findArea();
		findPerimeter();
		System.out.println();
	}
	
	@Override
	public void findArea(){
		System.out.println("Area of Rectangle: " + getArea());}
	@Override
	public void findPerimeter(){
		System.out.println("Perimeter of Rectangle: " + getPerimeter());
	}

	public double getArea(){
		return (this.width * this.length);
	}

	public double getPerimeter(){
		return (2*(this.width + this.length));
	}
}

class Triangle extends Figure {
	double sidea;
	double sidec;
	double base;
	double height;

	public void findDetails(){
		System.out.println("PRINT DETAILS OF A TRIANGLE");
		System.out.println("===========================");
		System.out.print("Enter the side A: ");
		this.sidea = Integer.parseInt(System.console().readLine());
		System.out.print("Enter the side C: ");
		this.sidec = Integer.parseInt(System.console().readLine());
		System.out.print("Enter the base: ");
		this.base = Integer.parseInt(System.console().readLine());
		System.out.print("Enter the height: ");
		this.height = Integer.parseInt(System.console().readLine());
		System.out.println("---------------------------");
		findArea();
		findPerimeter();
		System.out.println();
	}

	@Override
	public void findArea(){
		System.out.println("Area of Triangle: " + getArea());
	}
	@Override
	public void findPerimeter(){
		System.out.println("Perimeter of Triangle: " + getPerimeter());
	}

	public double getArea(){
		return ((this.height * this.base)/2);
	}

	public double getPerimeter()
	{
		return (this.sidea + this.base + this.sidec);
	}
}