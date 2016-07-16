import java.util.Scanner;
/**
 * Main driver of program.
 * 
 * @author Nicholas A. Hays & Ethan Rowell
 */
public class DiceCupMain {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		while(s.hasNextInt()) {
			
			int dice_0 = s.nextInt();
			int dice_1 = s.nextInt();
	
			int[] counts = new int[dice_0 + dice_1 +1];
			
			for(int i = 1; i <= dice_0; i++) {
				for(int j = 1; j <= dice_1; j++) {
					int sum = i + j;
					counts[sum] = counts[sum] + 1;
				}
			}
			
			int i = 2;
			
			//the sum of the dice roll
			int sumOfRoll = i;
			
			//the count of the sum of the dice roll
			int sumOfRollCount = counts[i];
			
			for(; i < counts.length -1; i++) {
				if(counts[i+1] > counts[i]) {
					sumOfRoll = i+1;
					sumOfRollCount = counts[i+1];
				}
			}
			
			System.out.println(sumOfRoll);
			System.out.println();

			for(int j = 2; j < counts.length; j++) {
				if(counts[j] == sumOfRollCount) {
					System.out.println(j);
				}
			}
			System.out.println();
		}
		s.close();
	}
}
