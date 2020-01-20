package thread;

//Runnable : 스레드로 동작 할 수 있도록 해주는 인터페이스
public class Threadprac implements Runnable {

	// index변수와 합계를 저장할 변수를 만들어보자
	private int idx;
	private int result;

	// 결과를 리턴하는 메소드는 자료형이 같아야하고 이름은 get을 붙여서 사용한다
	public int getResult() {
		return result;
	}

	// idx값을 1씩 증가시키면서 result에 추가하는 메소드
	// 10000번을 수행해보자
	private void sum() { //여기다 synchronized를 쓰면 값이 정상출력 가능함 >> 계산 끝날때까지 방해하지마! 란 뜻
		for (int i = 0; i < 10000; i = i + 1) {
			synchronized(this){
			idx = idx + 1;
			try {
				Thread.sleep(1);
			} catch (Exception e) {}
			result = result + idx;
			}
		}
	}

	// thread로 동작 할 내용을 작성하는 메소드. 즉 run 안에 있는 내용만 스레드로 동작한다.
	@Override
	public void run() {
		sum();
	}

}
