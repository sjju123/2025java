package exam01;

public class Main {
	public static void main(String[] args) {
		Button cbtn = new Button();
		cbtn.SetOnClickListener(new CallListener());
		cbtn.Touch();
		
		Button mbtn = new Button();
		mbtn.SetOnClickListener(new MessageListener());
		mbtn.Touch();

	}

}
