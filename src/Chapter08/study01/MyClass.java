package Chapter08.study01;

public class MyClass {

	RemoteControl rc = new Television();

	MyClass() {

	}

	MyClass(RemoteControl rc) {

		this.rc = rc;
		rc.turnOn();
		rc.setVolume(5);
	}

	void methodA() {

		RemoteControl rc = new Audio();
		rc.turnOn();
		rc.setVolume(5);

	}

	void methodB(RemoteControl re) {

		rc.turnOn();
		rc.setVolume(5);

	}

}
