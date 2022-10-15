package Chapter08.study01;

public class RemoteControlExample {

	public static void main(String[] arg) {

		RemoteControl rc = new Television();
		rc.turnOn();
		rc = new Audio();
		rc.setVolume(9);
	}

}
