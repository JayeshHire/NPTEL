/* Java program to print a factorial of a no 
 * where input is given
 */


interface math {
	int fact = 1;
	int factorial(int n);
}

class calcFactorial implements math {
	public int fact = 1;
	public int factorial(int n){
		fact *= n;
		n--;
		if (n == 0){
			return fact;
		}
		return factorial(n);
	}
}


class Factorial {
	public static void main(String [] args){
		calcFactorial n1 = new calcFactorial();
		int result = n1.factorial(Integer.parseInt(args[0]));
		System.out.println("factorial of "+args[0]+ " is "+result);
	}
}


