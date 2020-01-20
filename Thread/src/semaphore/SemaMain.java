package semaphore;

import java.util.concurrent.Semaphore;

public class SemaMain {

	public static void main(String[] args) {
		
		Semaphore sem = new Semaphore(3); //동시에 3개 실행하는 세마포어 생성
		for (int i=0; i<20; i=i+1) {
			SemaThread st = new SemaThread(sem);
			st.start();
		}

	}

}
