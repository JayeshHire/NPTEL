/*this demostration consists of using multiple constructors in java
 */

class Circle {
	double x , y , r; //coordinates and radius of  circle
	Circle(double x , double y, double r){
		this.x = x;
		this.y = y;
		this.r =r;
	}

	Circle(double r){
		//this.r = r;
	//	x = 0.0;
	//	y = 0.0;
		this(0.0,0.0,r);
	}

	Circle (Circle c){
		this(c.x, c.y,c.r);
	}

	double Circumference(){
		return 2*3.14159*r;
	}
	double Area(){
		return 3.14159*r*r;
	}


}

class CircleDemo6{
	
	public static void main(String args[]){
		Circle c1 = new Circle(2.0,3.1,4.0);
		Circle c2 = new Circle(5.0);
		Circle c3 = new Circle(c1);


		System.out.println("Circumference of c1 "+c1.Circumference());
		System.out.println("Area of c1 "+c1.Area());
		System.out.println("Circumference of c2 "+c2.Circumference());
		System.out.println("Area of c2 "+c2.Area());
		System.out.println("Circumference of c3 "+c3.Circumference());
		System.out.println("Area of c3 "+c3.Area());
	}
}
