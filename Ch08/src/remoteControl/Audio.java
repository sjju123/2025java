package remoteControl;

public class Audio implements RemoteControl{
	int volume;
	public void Turnon() {
		System.out.println("Turn on Audio!!");
	}
	
	public void Setvolume(int volume) {
		this.volume = volume;
		System.out.println("Audio volume :"+volume);
	}

}
