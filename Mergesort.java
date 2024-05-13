package question5;
import java.util.Scanner;

public class Mergesort {

	public static void main(String[] args) {
		


		        Scanner scanner = new Scanner(System.in);
		        
		       
		        System.out.print("Enter the size of the array: ");
		        int size = scanner.nextInt();
		        
		       
		        int[] arr = new int[size];
		        System.out.println("Enter the elements of the array:");
		        for (int i = 0; i < size; i++) {
		            arr[i] = scanner.nextInt();
		        }
		        
		       
		        mergeSort(arr, 0, arr.length - 1);
		        
		        
		        System.out.println("Sorted array is :");
		        for (int num : arr) {
		            System.out.print(num + " ");
		        }
		        
		        scanner.close();
		    }

		    public static void mergeSort(int[] arr, int left, int right) {
		        if (left < right) {
		            int middle = (left + right) / 2;
		            mergeSort(arr, left, middle);
		            mergeSort(arr, middle + 1, right);
		            merge(arr, left, middle, right);
		        }
		    }

		    public static void merge(int[] arr, int left, int middle, int right) {
		        int n1 = middle - left + 1;
		        int n2 = right - middle;

		        int[] L = new int[n1];
		        int[] R = new int[n2];

		        for (int i = 0; i < n1; ++i) {
		            L[i] = arr[left + i];
		        }
		        for (int j = 0; j < n2; ++j) {
		            R[j] = arr[middle + 1 + j];
		        }

		        int i = 0, j = 0;

		        int k = left;
		        while (i < n1 && j < n2) {
		            if (L[i] <= R[j]) {
		                arr[k] = L[i];
		                i++;
		            } else {
		                arr[k] = R[j];
		                j++;
		            }
		            k++;
		        }

		        while (i < n1) {
		            arr[k] = L[i];
		            i++;
		            k++;
		        }

		        while (j < n2) {
		            arr[k] = R[j];
		            j++;
		            k++;
		        }
		   

	}

}
