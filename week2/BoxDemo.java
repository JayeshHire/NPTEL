class Box {
	double height;
	double width , depth;

	double SurfaceArea(){
		return 2*(height*width + width*depth + depth*height);
	}

	double Volume(){
		return height*depth*width;
	}

}

class BoxDemo {
	public static void main(String [] args){
		Box b1 = new Box();
		b1.height = 10.0;
		b1.width = 6.0;
		b1.depth = 8.0;
		System.out.println("Surface Area of b1 "+ b1.SurfaceArea());
		System.out.println("Volume of b1 "+b1.Volume());
	}
}
