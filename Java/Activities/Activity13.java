package activities;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Activity13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		ArrayList<Integer> list= new ArrayList<Integer>();
		Random Indexgen= new Random();
		System.out.println("Enter the integers: ");
		System.out.println("Non-interger to Terminated: ");
		while(scan.hasNextInt()) {
			list.add(scan.nextInt());
		}
		Integer nums[] = list.toArray(new Integer[0]);
		int Index= Indexgen.nextInt(nums.length);
		System.out.println("Index value generated: " +Index);	
		System.out.println("Array Values in generated index: "+nums[Index]);
		scan.close();

	}

}
