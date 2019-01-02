package prob05;

public class MyBase extends Base {
	// 오버라이딩 - 상속받으면서 부모 메서드를 수정해서 쓴다.
	// 메서드의 이름과 매개변수는 같다.
	
	@Override
	public void day() {
		System.out.println("낮에는 열심히 일하자!");
	}
	
	@Override
	public void night() {
		System.out.println("night");
	}
	//service를 오버라이딩 후 
	
	@Override
	public void service(String state) {
		if("오후".equals(state)) {
			afternoon();
			return;
		}
		super.service(state);
	}
	public void afternoon() {
		System.out.println("오후도 낮과 마찬가지로 일해야 합니다.");
	}
}
