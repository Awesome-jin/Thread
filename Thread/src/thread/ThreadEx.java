package thread;

public class ThreadEx extends Thread {

	public void run() {
		// 1초마다 Hello Thread라는 문자열 10번 출력
		for (int i = 0; i < 10; i = i + 1) {
			System.out.println("Hello Thread");
			try { 
				Thread.sleep(1000); //1초 대기
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
