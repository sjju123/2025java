package sec03.exam01;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1 = new Car();
		Car c2 = new Car("Hyundai");
		Car c3 = new Car("Kia","Sedan");
		Car c4 = new Car("Kia","truck",160);
		
		c1.Showinfo();
		System.out.println("\n");
		c2.Showinfo();
		System.out.println("\n");
		c3.Showinfo();
		System.out.println("\n");
		c4.Showinfo();
		
	}

}
