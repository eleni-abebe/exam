package question4;

public class bubbleSort {

	public static void main(String[] args) {
		
		        char[] array = {'l', 'o', 'x', 'w', 'm', 'a'};
		        bubbleSortt(array);
		        System.out.println("the Sorted array is :");
		        for (char x: array) {
		            System.out.print( x+ " ");
		        }
		    }

		    public static void bubbleSortt(char[] array) {
		        int n = array.length;
		        for (int i = 0; i < n - 1; i++) {
		            for (int j = 0; j < n - i - 1; j++) {
		                if (array[j] > array[j + 1]) {
		                  
		                    char temp = array[j];
		                    array[j] = array[j + 1];
		                    array[j + 1] = temp;
		                }
		            }
		        }
		  


	}

}
