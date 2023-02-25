import java.lang.*;


class MathFunc{

	static double sum(double a , double b){
		return a + b;
	}

	static double diff(double a , double b){
		return a - b;
	}

	static double product (double a , double b){
		return a * b;
	}

	static double div(double a , double b ){
		return a / b;
	}

}

class Calculator{
	
	static String opt = new String("options");
	static String sum = new String("sum");
	static String sub = new String("diff");
	static String pro = new String("product");
	static String div = new String("div");
	public static void main(String args[]){
		if (args.length == 1 ){
			System.out.println(args[0]);
			if (opt.matches(args[0])){
				System.out.println("sum \ndiff \nproduct \ndiv ");
			} else {
				System.out.println("To know more arguments pass 'options' as arguments ");
			}
		}	else {
				if (sum.matches(args[0])){
					System.out.println("sum of two nos is "+MathFunc.sum(Double.parseDouble(args[1]),Double.parseDouble(args[2])));
				} else if (sub.matches(args[0])){
					System.out.println("difference in two nos is "+MathFunc.diff(Double.parseDouble(args[1]),Double.parseDouble(args[2])));
				} else if (pro.matches(args[0])){
					System.out.println("product of two nos is"+MathFunc.product(Double.parseDouble(args[1]),Double.parseDouble(args[2])));
				}else if (div.matches(args[0])){
					System.out.println("Division of two nos is "+MathFunc.div(Double.parseDouble(args[1]),Double.parseDouble(args[2])));
				}else {
					System.out.println("sum \ndiff \nproduct \ndiv ");

			}	
			}
		}
	
}

