class RecursiveGCD {

	int m,n ;

	int gcd (int m , int n){
		if (m == n){
			return m;
		} 
	       	if (m == 0){
			return n;
		} 
	       	if (m ==1 ){
			return 1;
		}
	       	if (m >= n){
			return gcd( n ,m);
		}
		return gcd(m, n%m);
	}
	
	public static void main(String args[]){
		RecursiveGCD p = new RecursiveGCD();
		int result = p.gcd(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
		System.out.println("gcd of two nos "+args[0]+" and "+args[1]+" is "+result);
	}
}

