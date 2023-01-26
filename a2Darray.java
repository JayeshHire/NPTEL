 
class a2Darray {
	public static void main(String[] args){
	int [][] data ;
	data = new int [3][];
	for (int i=0; i<3; i++){
		data[i] = new int [i+1];
	}
	
	int no = 0;
	for (int i=0 ; i<3; i++){
                for (int j=0 ; j < i+1; j++){
                        data[i][j] = no ;
			no++;
                }                       
        }   
	for (int i=0 ; i<3; i++){
		for (int j=0 ; j < i+1; j++){
			System.out.println(data[i][j]);
		}
	}
	}
}

