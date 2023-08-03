package Builder1;

public class Car {
	private String engine; // 엔진
	private boolean airbag; // 에어벡 여부
	private String color; // 차량 색상
	private boolean cameraSensor; // 카메라 센서 유무
	private boolean AEB; // 자동급제동장치 유무

	public Car(String engine, boolean airbag, String color, boolean cameraSensor, boolean AEB) {
		this.engine = engine;
		this.airbag = airbag;
		this.color = color;
		this.cameraSensor = cameraSensor;
		this.AEB = AEB;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("# CAR SPEC\n");
		sb.append("  CameraSensor " + (cameraSensor?"Y":"N") + "\n");
		sb.append("        Engine " + engine + "\n");
		sb.append("        Airbag " + (airbag?"Y":"N") + "\n");
		sb.append("         Color " + color + "\n");
		sb.append("           AEB " + (AEB?"Y":"N") + "\n");
		return sb.toString();
	}
}
