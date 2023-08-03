package CommandPattern;

public class ClearCommand implements Command {
	
	@Override
	public void run() {
		System.out.print("\033[H\033[2J"); // 화면을 지우라는 명령 커멘드
		System.out.flush();
	}
}
