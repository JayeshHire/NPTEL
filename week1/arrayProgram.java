
class arrayProgram{
	public static void main(String[] args){
		int arr [] ={10,20,30,40,50,60};

		//traversing an array
		for (int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
		//average calculation
		int sum =0 , avg;
		for (int i= 0;i<arr.length;i++){
			sum+=arr[i];
		}
		avg = sum/arr.length;
		System.out.println("average of elements in the array is "+avg);
	}
}
