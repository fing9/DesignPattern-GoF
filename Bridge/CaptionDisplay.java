package Bridge;

public class CaptionDisplay implements Display{

	@Override
	public void title(Draft draft) {
		System.out.println("제목: " + draft.getAuthor());
	}

	@Override
	public void author(Draft draft) {
		System.out.println("저자: " + draft.getAuthor());
	}

	@Override
	public void content(Draft draft) {
		System.out.println("내용: ");
		var content = draft.getContent();
		for (var i=0;i<content.length;i++) {
			System.out.println("    " + content[i]);
		}
	}
	
}
