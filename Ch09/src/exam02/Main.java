package exam02;



public class Main {
	public static void main(String[] args) {
		Button CallBtn = new Button();
		CallBtn.SetOnClickListener(new CallListener());
		CallBtn.Touch();
		
		Button MassageBtn = new Button();
		MassageBtn.SetOnClickListener(new MessageListener());
		MassageBtn.Touch();

	}

}
