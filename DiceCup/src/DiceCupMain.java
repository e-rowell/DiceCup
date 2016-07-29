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
	
			int[] counts = new int[dice_0 + dice_1 + 1];
			
			// Count the occurrence of each sum of the dice.
			for(int i = 1; i <= dice_0; i++) {
				for(int j = 1; j <= dice_1; j++) {
					int sum = i + j;
					counts[sum]++;
				}
			}
			
			// the minimum dice roll sum is 2 (1 + 1)
			int i = 2;
			
			// the count of the sum of the dice roll
			int sumOfRollCount = counts[i];
			
			// Find the highest occurrence of the sums.
			for(; i < counts.length - 1; i++) {
				if(counts[i + 1] > counts[i]) {
					sumOfRollCount = counts[i + 1];
				}
			}

			// Print the sums that occurred the most
			for(int j = 2; j < counts.length; j++) {
				if(counts[j] == sumOfRollCount) {
					System.out.println(j);
				}
			}
			
			if(s.hasNextInt()) System.out.println();
		}
		s.close();
	}
}
