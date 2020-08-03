import java.util.Arrays;
import java.util.Scanner;

public class Numbers {

	
		int max; 
		int arr;
		
		
		//loop each number in array
		for (int i=0; i< array.length; i++) {
			
			//max be Integer.MAX_Value
			max = Integer.MAX_VALUE;
			
			for (int j=0; j<array.length; j++) {
				
				if(arr[j] >[i] && arr[j]<max) {
					max = arr[j];
				}
			}
			
			//print output
			System.out.print(arr[i] + ":" +max + " ");
		}

	}
public static void main(String[] args) {
	
	//sample run
	int arr[] = {78,22,56,99,12,14,17,15,1,144,37,23,47,88,9,19};
		
	}
	

}
