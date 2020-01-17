package thread;

public class Main1 {

	public static void main(String[] args) {
		// ThreadEx 인스턴스를 2개 만들어보기
		
		ThreadEx te1 = new ThreadEx(); 
		ThreadEx te2 = new ThreadEx();
		
		//일반적인 메소드 호출
		te1.run();
		te2.run();
		
		// 스레드로 실행 : 하나의 스레드가 쉬는 시간이 생기면 다른 스레드의 작업을 처리
		te1.start();
		te2.start();

	}

}
