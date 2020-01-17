package thread;

public class Main2 {

	public static void main(String[] args) {
		
		Thread th = new Thread() {
			public void run() { // 대부분의 언어가 run이라는 명령어를 사용한다.
				try {
					for (int i=0; i<10; i=i+1) {
						Thread.sleep(1000);
						System.out.println("데몬스레드");
					}
				}
				catch(Exception e) {
				}
			}
		};
		//th를 데몬으로 실행 - 다른 작업이 없으면 자동으로 종료
		th.setDaemon(true);
		th.start();
		
		try {
			Thread.sleep(3000);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("메인종료");
	}

}
