
class Circle{
	double x,y; //coordinates of circle
	double r; //radius of circle
	
	Circle(double a, double b, double c){
		x = a;
		y = b;
		r = c;
	}

	double Circumference(){
		return 2*3.14159*r;
	}

	double Area(){
		return 3.14159*r*r;
	}

}

class CircleDemo4{
	public static void main(String args[]){
		Circle c1 = new Circle(2.0,2.0,3.0);
		System.out.println("Area of circle c1:"+c1.Area());
		System.out.println("Circumference of circle c1 :"+c1.Circumference());
	}
}
