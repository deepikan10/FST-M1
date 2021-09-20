package activities;

class customexception extends Exception{
private String message= null;

public customexception(String message) {
    this.message = message;
}
@Override
public String getMessage() {
    return message;
}
}

public class Activity8 {

	public static void main(String[] args) {
		try {
		// TODO Auto-generated method stub
		Activity8.exceptionTest("Will print to console");
		Activity8.exceptionTest("Good");
		Activity8.exceptionTest("Won't execute");
		}
		catch(customexception mae) {
			System.out.println("Catch block: " +mae.getMessage());
		}
		
}
	static void exceptionTest(String a) throws customexception{
		if(a==null)
		{
			throw new customexception("String value is null");
			
		}
		else
		{
			System.out.println(a);
		}
	}
	

}
