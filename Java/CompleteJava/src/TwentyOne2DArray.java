
public class TwentyOne2DArray {

	public static void main(String[] args) {
		/*int a[] = {1,2,3};
		int b[]={4,5,6};
		int c[] = {7,8,9};*/
		
		/*OR*/
		
		//int x[][] = new int[3][3];
		
		/*OR*/
		
/*		int d[][] = {
				{1,2,3},
				{4,5,6},  //2d
				{7,8,9}
		};
*/		
		
		int d[][] = {
				{1,2,3},
				{4,5},   //jagged array
				{6,7,8}
				
		};
		//System.out.println(d[1][2]);
		/*for(int i = 0;i <= 2; i++){
			for (int j = 0; j<=2; j++){
				System.out.print(d[i][j]);
			}System.out.println("");
		}*/
		
		for(int i = 0; i< d.length; i++){ //the array rows are not common i.e, jagged array, we use length of i.
			//System.out.println(d[i].length);
			for(int j = 0; j< d[i].length; j++){
				System.out.print(" " +d[i][j]);
			}System.out.println();
		}
		

}
}
