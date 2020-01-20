package semaphore;

import java.util.concurrent.Semaphore;

public class SemaThread extends Thread {

	// 20개를 한꺼번에 실행시키지 않고 적당히 끊을때 Semaphore를 사용한다
	private Semaphore sem; 
	
	// 외부에서 Semaphore를 주입 받는다.
	public SemaThread(Semaphore sem) {
		this.sem=sem;
	}
	
	// 실행 메소드 바로 만들기
	public void run() {	
		try { 
			sem.acquire(); //lock을 취득 : 사용 개수 1개가 줄어든것
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		System.out.println("Test starts");
		try {
			Thread.sleep(3000);
		}
		catch(Exception e) {}
		System.out.println("Test ends");
		sem.release(); //lock을 해제 : 사용 개수 1개가 늘어남
	}
	
}
