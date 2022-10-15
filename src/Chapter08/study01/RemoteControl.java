package Chapter08.study01;

public interface RemoteControl {
	
	public int MAX_VOLUME = 10;
	public int MIN_VOLUME =0;
	
	// 추상클래스 : 클래스  --> 상속(extends)
	// 인터페이스 : 클래스 --> 구현(implements)

	
	
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
	
}
