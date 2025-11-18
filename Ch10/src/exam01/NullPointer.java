package exam01;

public class NullPointer {
	public static void main(String[] args) {
		String data = null;
		try {
			//data = new String ("Hi");
			System.out.println(data.toString());
			System.out.println("It is OK");
		}
		catch(NullPointerException e) {
			//System.out.println(e);
			System.out.println(data.toString());
		}
		finally {
			System.out.println("Exception module done.");
		}
		
		System.out.print("Program is ruunning!!");
	}

}
