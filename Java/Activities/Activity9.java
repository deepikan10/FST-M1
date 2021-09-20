package activities;

import java.util.ArrayList;

public class Activity9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> myList = new ArrayList<String>();
        //Adding objects to Array List at default index
        myList.add("Tokyo");
        myList.add("Berlin");
        myList.add("Nairobi");
        //Adding object at specific index
        myList.add(3, "Denver");
        myList.add(1, "Mascow");
        
        System.out.println("Print All the Objects:");
        for(String s:myList){
            System.out.println(s);
        }
        
        System.out.println("3rd element in the list is: " + myList.get(2));
        System.out.println("Is Torito is in list: " + myList.contains("Torito"));
        System.out.println("Size of ArrayList: " + myList.size());
        
        myList.remove("Nairobi");
        
        System.out.println("New Size of ArrayList: " + myList.size());
    }

	}


