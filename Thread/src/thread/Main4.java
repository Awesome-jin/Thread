package thread;

class Threadtest extends Thread {
	public void run() {
		for (int i = 0; i < 10; i = i + 1) { // 스레드 자신의 이름을 10번 출력 (1초마다 쉬면서)
			try {
				Thread.sleep(1000);
				System.out.println(getName());
			} catch (InterruptedException e) { // InterruptedException이 발생했을 때, return 해주도록하면 스레드가 강제 종료됨
				return;
			}
		}
	}
}

public class Main4 {
	public static void main(String[] args) {
		Threadtest tt1 = new Threadtest();
		Threadtest tt2 = new Threadtest();
		Threadtest tt3 = new Threadtest();

		tt1.setPriority(Thread.MIN_PRIORITY); // 이게 꼭 정확한건 아니야
		tt2.setPriority(Thread.MAX_PRIORITY);
		tt3.setPriority(Thread.NORM_PRIORITY);

		tt1.start();
		tt2.start();
		tt3.start();

		try {
			Thread.sleep(3000);
			tt2.interrupt(); // 너 3초 있다가 interrupt = 사라져!
		} catch (Exception e) {
		}

	}
}
