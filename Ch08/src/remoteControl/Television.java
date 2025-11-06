package remoteControl;

public class Television implements RemoteControl {
	
	int volume;
	public void Turnon() {
		System.out.println("Turn on TV!!");
	}
	
	public void Setvolume(int volume) {
		this.volume = volume;
		System.out.println("Audio volume :"+volume);
	}
}
