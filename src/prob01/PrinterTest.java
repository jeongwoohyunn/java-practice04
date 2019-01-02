package prob01;

public class PrinterTest {

	public static void main(String[] args) {
		Printer printer = new Printer();
		//객체 생성후 값을 넣으면서 바로 호출
		//Printer에서 생성자를 여러개 만들어주어, 
		//각각 다른 타입,인수를 넣어 출력한다.
		//오버로딩
		//한 클래스 내에서 같은 이름의 메서드를 정의한다.
		printer.println( 10 );
		printer.println( true );
		printer.println( 5.7 );
		printer.println( "홍길동" );
	}

}
