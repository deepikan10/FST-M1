package activities;

abstract class Book {
    String title;
    //Abstract method
    abstract void setTitle(String s);
    
    //Concrete method
    String getTitle() {
        return title;
    }
}
class MyBook extends Book {
    public void setTitle(String s) {
        title = s;
    }
}
public class Activity5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String title = "Hover Car Racer";
        Book newNovel = new MyBook();
        newNovel.setTitle(title);
        
        //Print result
        System.out.println("The title is: " + newNovel.getTitle());

	}

}
