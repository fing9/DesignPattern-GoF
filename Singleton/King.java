package Singleton;

public class King {

	// 생성자를 private로 만들어서, 오직 자신만이 자신을 생성할 수 있게 한다.
	private King() {}

	// // 자기 자신의 인스턴스를 가지고있음
	// private static King self = null;

	// // 멀티 쓰레드에서 이 클래스를 사용할 때, 동기화 문제 해결을 위해 synchronized 사용 (성능이슈 있음)
	// public synchronized static King getInstance() {
	// 	if (self == null) {
	// 		self = new King();
	// 	}
	// 	return self;
	// }

	// 클래스 안에 클래스(holder)를 두어 JVM의 클래스 로더 매커니즘과 로드되는 시점을 이용한 방법
	// 클래스 로딩 및 초기화 과정이 스레드 세이프함을 이용하여 싱글톤 인스턴스를 만들 수 있다
	private static class LazyHolder {
		public static final King INSTANCE = new King();
	}

	public static King getInstance() {
		return LazyHolder.INSTANCE;
	}

	public void say() {
		System.out.println("I am only one..!");
	}
}
