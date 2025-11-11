package exam03;

public class Main {

	public static void main(String[] args) {
		Button callBtn = new Button();
		callBtn.SetOnClickListener(
				new Button.OnClickListener() {
					
					@Override
					public void OnClick() {
						// TODO Auto-generated method stub
						System.out.println("Make a phone call!!");
						
					}
				}
			);
		callBtn.Touch();

	}

}
