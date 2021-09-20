package activities;

import java.util.HashMap;

public class Activtiy11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
        hm.put(1, "Red");
        hm.put(2, "Green");
        hm.put(3, "Blue");
        hm.put(4, "White");
        hm.put(5, "Black");
 
        // Print the Map
        System.out.println("The Original map: " + hm);
        
        // Remove one colour
        hm.remove(4);
        // Map after removing a colour
        System.out.println("After removing White: " + hm);
        
        // Check if green exists
        if(hm.containsValue("Green")) {
            System.out.println("Green exists in the Map");
        } else {
            System.out.println("Green does not exist in the Map");
        }
        
        // Print the size of the Map
        System.out.println("Number of pairs in the Map is: " + hm.size());

	}

}
