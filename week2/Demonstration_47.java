import java.io.* ;


class Demonstration_47{
	public static void main(String args []){
		//program for calculating interest total
		Double principalAmount = new Double(0);
		Double rateOfInterest = new Double(0);
		int numberOfYears = 0;

		try {
			DataInputStream in = new DataInputStream(System.in);
			Double tempString ;
		        System.out.print("Enter the value for principal ammount ");	
			System.out.flush();
			tempString = in.readLine();
			principalAmount = Double.valueOf(tempString);
			System.out.print("Enter the value for rate of interest ");
			tempString = in.readLine();
			rateOfInterest = Double.valueOf(tempString) ;
			int tempint ;
			System.out.print("Enter the no of years ");
			tempint = in.readInt();
			numberOfYears = tempint;
			double totalInterest = principalAmount*numberOfYears*rateOfInterest ;
			System.out.println("Total interest "+ totalInterest);
		}
		catch (Exception ex)
		{}
	}
}

