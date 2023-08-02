package Memento;

import java.util.ArrayList;

public class Walker {
	private int currentX, currentY;
	private int targetX, targetY;
	private ArrayList<String> actionList = new ArrayList<String>();

	public Walker(int currentX, int currentY, int targetX, int targetY) {
		this.currentX = currentX;
		this.currentY = currentY;
		this.targetX = targetX;
		this.targetY = targetY;
	}

	public double walk(String action) {
		actionList.add(action);

		if (action.equals("UP")) {
			currentY += 1;
		} else if (action.equals("RIGHT")) {
			currentX += 1;
		} else if (action.equals("DOWN")) {
			currentY -= 1;
		} else if (action.equals("LEFT")) {
			currentX -= 1;
		}

		return Math.sqrt(Math.pow(currentX - targetX, 2) + Math.pow(currentY - targetY, 2));
	}

	// 오직 워커 클래스만이 memento를 생성, 변경할 수 있게 하기위해 inner클래스로 생성
	public class Memento {
		private int x, y;
		private ArrayList<String> actionList;
		private Memento() {}
	}

	public Memento createMemento() {
		Memento memento = new Memento();

		memento.x = this.currentX;
		memento.y = this.currentY;
		// clone을 이용해서 깊은 복사를 한다. 메멘토의 리스트는 워커의 변경과 관계없게 하기위함
		memento.actionList = (ArrayList<String>)this.actionList.clone();
	
		return memento;
	}

	public void restoreMemento(Memento memento) {
		this.currentX = memento.x;
		this.currentY = memento.y;
		this.actionList = (ArrayList<String>)memento.actionList.clone();
	}

	@Override
	public String toString() {
		return actionList.toString();
	}
}
