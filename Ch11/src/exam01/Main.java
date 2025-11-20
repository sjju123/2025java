package exam01;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object obj1 = new Object();
		Object obj2 = new Object();
		
		if (obj1 == obj2)
			System.out.println("Equal!!");
		else
			System.out.println("Not equal!!");
		
		if (obj1.equals(obj2))
			System.out.println("Equal!!");
		else
			System.out.println("Not equal!!");

	}

}
