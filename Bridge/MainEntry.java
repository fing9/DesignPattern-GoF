package Bridge;

public class MainEntry {
	public static void main(String[] args) {
		var title = "복원된 지구";
		var author = "김형준";
		String[] content = {
			"플라스틱 사용의 감소와",
			"바다 생물 어획량 감소로 인하여",
			"지구는 복원되었다."
		};

		Draft draft = new Draft(title, author, content);

		System.out.println("[CASE 1]");
		Display display1 = new SimpleDisplay();
		draft.print(display1);

		System.out.println("");

		System.out.println("[CASE 2]");
		Display display2 = new CaptionDisplay();
		draft.print(display2);

		// 새로운 요구사항 등장
		// 1. Draft가 출판될 경우, 출판사와 가격 정보를 출력해줘야한다.
		// 2. 단, 기존의 기능은 그대로 유지해야한다.
		// Display와 Draft가 분리되어서 구현되어있으므로 구현의 변경에 있어서는 Publication을 만들어서 변경하면 된다.
		var publisher = "북악출판";
		var cost = 100;

		Publication publication = new Publication(title, author, content, publisher, cost);
		
		System.out.println("");

		System.out.println("[CASE 3]");
		publication.print(display1);
				
		System.out.println("");

		System.out.println("[CASE 4]");
		publication.print(display2);
	}
}
