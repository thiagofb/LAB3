package Array;

public class SumArray {

	
	public static void main(String[] args) {

		int[] array = {10,20,30,40,50,60,70,80,90,100};
		int total = 0;
		
		for(int counter = 0; counter < array.length ; counter++)
			total += array[counter];
		
		System.out.printf("Total dos arrays of elements: %d\n", total);
	}

}
