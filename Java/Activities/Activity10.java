package activities;

import java.util.HashSet;

public class Activity10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hs = new HashSet<String>();
        // Adding element to HashSet
        hs.add("Damon");
        hs.add("Elina");
        hs.add("Stefan");
        hs.add("Caroline");
        hs.add("Bonnie");
        hs.add("Enzo");
        
        //Print HashSet
        System.out.println("Original HashSet: " + hs);        
        //Print size of HashSet
        System.out.println("Size of HashSet: " + hs.size());
        
        //Remove element
        System.out.println("Removing Enzo from HashSet: " + hs.remove("Enzo"));
        //Remove element that is not present
        if(hs.remove("Liz")) {
        	System.out.println("Liz removed from the Set");
        } else {
        	System.out.println("LiZ is not present in the Set");
        }
        
        //Search for element
        System.out.println("Checking if Bonnie is present: " + hs.contains("Bonnie"));
        //Print updated HashSet
        System.out.println("Updated HashSet: " + hs);

	}

}
