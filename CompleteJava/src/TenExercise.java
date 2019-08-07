
public class TenExercise {

	public static void main(String[] args) {
	String name;
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= i; j++) {
				if(j == 1){
					name = "A";
				}else if (j == 2){
					name = "B";
				}else{
					name = "C";
				}
				System.out.print(name);
			}
			System.out.println();

		}
	}

}
