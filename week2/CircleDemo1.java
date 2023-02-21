class Circle{
	double x , y ; //cordinates of the center of the circle
	double r; //radius of the circle
	
	//method for calculating the circumference of the circle
	double Circumference(){
		return 2*3.14159*r;
	}
	double Area(){
		return 3.14159*r*r;
	}
}

class CircleDemo1{
	public static void main(String [] args){
		Circle c1 = new Circle();
		Circle c2 = new Circle();
		c1.x = 0.0;
		c1.y = 0.0;
		c1.r = 5.0;
		c2.x = 2.0; c2.y = 3.0; c2.r = 6.0;
		System.out.println("Circumference of c1  "+c1.Circumference());
		
		System.out.println("Area  of c1 "+c1.Area());
		System.out.println("Circumference of c2 "+c2.Circumference());
		System.out.println("Area of c2 "+c2.Area());
	}
}
