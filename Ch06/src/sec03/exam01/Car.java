package sec03.exam01;

public class Car {
//	String company = "Kia";
//	String model = "Truck";
//	int maxSpeed = 150;
	String company;
	String model ;
	int maxSpeed;
	
	public Car() {
		this("Kia","Truck",150);
	}
	
	public Car(String company) {
		//this.company = company;
		this("company","Truck",150);
	}
	
	public Car(String company, String model) {
		//this.company = company;
		//this.model=model;
		this("company","model",150);
	}
	
	public Car(String company, String model ,int maxSpeed) {
		this.company = company;
		this.model=model;
		this.maxSpeed = maxSpeed;
	}
	
	void SetMaxSpeed(int value) {
		maxSpeed = value;
	}
	
	void Showinfo()
	{
		System.out.println("Company : "+company);
		System.out.println("Model : "+model);
		System.out.println("Max Speed :" + maxSpeed);
		
		
	}

}
