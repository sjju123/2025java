package eaxm04;

public class ClassCast {

	public static void main(String[] args) {
		Cat cat = new Cat();
		ChangeDog(cat);
		try {
			Method();
		
			
		}
		catch(ClassCastException e) {
			System.out.println("Class cast error!!");
		}
		
		System.out.println("Program is running!!");
	}
	
	public static void ChangeDog(Animal anima) {
		Dog dog = (Dog) anima;
	}
	public static void Method() throws NuberofExceotion{
		System.out.println("Hi");
	}

}
