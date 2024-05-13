package question6;
import java.util.Arrays;
public class array2 {

	public static void main(String[] args) {
		
		        int[] array = {3, 7, 1, 9, 4};
		        int indexToBeDeleted = 2;

		        System.out.println("former array: " + Arrays.toString(array));
		        int[] modifiedArray = deleteElement(array, indexToBeDeleted);
		        if (modifiedArray != null) {
		            System.out.println("Modified Array: " + Arrays.toString(modifiedArray));
		        }
		    }

		    public static int[] deleteElement(int[] array, int index) {
		        if (index < 0 || index >= array.length) {
		            System.out.println("Invalid index exist");
		            return array; 
		        }

		        int[] newArray = new int[array.length - 1];
		        int thenewIndex = 0;

		        for (int i = 0; i < array.length; i++) {
		            if (i != index) {
		                newArray[thenewIndex++] = array[i];
		            }
		        }

		        return newArray;


	}

}
