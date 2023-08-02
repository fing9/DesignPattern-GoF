package Proxy;

public class ScreenDisplay implements Display {
	
	@Override
	public void print(String content) {
		try {
			Thread.sleep(500); // 출력을 위한 준비 작업(오래걸린다고 상상)
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println(content);
	}
}
