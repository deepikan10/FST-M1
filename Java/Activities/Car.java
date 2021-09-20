package activities;

public class Car {
	String color;
	String transmission;
	int make;
	int tyres;
	int doors;
	// Car contructor
	Car() {
		tyres=4;
		doors=4;
	}
	public void displayCharacteristics() {
		// TODO Auto-generated method stub
		System.out.println("Color of the car "+color);
		System.out.println("make of the car "+ make);
		System.out.println("transmission of the car "+ transmission);
		System.out.println("Number of tyres in the car "+ tyres);
		System.out.println("Number of doors in the car "+doors);
		}
	
	public void brake() {
		// TODO Auto-generated method stub
		System.out.println("Car has stopped");
		
	}

	public void accelerate() {
		// TODO Auto-generated method stub
		System.out.println("Car is moving forward");
		
	}

	

	
	
	

}
