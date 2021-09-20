package activities;

//import java.sql.Array;
import java.util.Arrays;

public class Activity2 {

	public static void main(String[] args) {
		
		int[] numbers= {10, 77, 10, 54,-11, 10};
		System.out.println("Original array: "+ Arrays.toString(numbers));
		
		int searchnumber=10;
		int Sum=30;
		System.out.println("Result: "+ result(numbers, searchnumber, Sum));
		

	}

	public static  boolean result(int[] numbers, int searchnumber, int sum) {
		// TODO Auto-generated method stub
		int temp_sum=0;
		for(int number: numbers) {
			if(number==searchnumber) {
				temp_sum += searchnumber;
			}
			int Sum= 30;
			if(temp_sum > Sum) {
				break;
			}
	}
		int Sum=30;
		return temp_sum== Sum;

}
}
