package remoteControl;

public class Radio implements RemoteControl {
	
	int volume;
	public void Turnon() {
		System.out.println("Turn on Raido!!");
	}
	
	public void Setvolume(int volume) {
		this.volume = volume;
		System.out.println("Radio volume :"+volume);
	}
}
