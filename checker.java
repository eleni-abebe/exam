package question1;
import java.util.Scanner;

public class checker {

	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {
			System.out.print("Enter the size of the array: ");
			int mysize = input.nextInt();
			
			
			int[] arr = new int[mysize];
			System.out.println("Enter the elements of the array:");
			for (int i = 0; i < mysize; i++) {
			    arr[i] = input.nextInt();
			}
			System.out.print("Enter the number to be searched: ");
			int numtobesearched = input.nextInt();
			
 
			int counter = 0;
			for (int num : arr) {
			    if (num == numtobesearched ) {
			        counter++;
			    }
			}
      
			if (counter > 0) {
			    System.out.println(numtobesearched + " is present " + counter + " times.");
			} else {
			    System.out.println(numtobesearched + " is not present ");
			}
		}
        
        
    }

	
	}

