package thread;

public class Threadmain {

	public static void main(String[] args) {
		// Runnable로 Thread를 만든경우 객체를 먼저 만든다.
		
		Threadprac tp = new Threadprac();
		
		// 2.객체를 Thread 생성자에 매개변수로 넣어주면서 인스턴스를 만든다.
		Thread th1 = new Thread(tp);
		Thread th2 = new Thread(tp);
		
		// 3. 쓰레드를 시작한다.
		th1.start();
		th2.start();
		
		// 출력을 해볼까?
		//System.out.println(tp.getResult()); //왜 0이나올까? THREAD는 비동기라 그렇다! 스레드가 끝나기 전에 틈이 생기면 얘를 시켜버리는거라 그냥 바로 0이 뜨는 것
	
		try {
			Thread.sleep(50000);  // 스레드 돌 동안 30초 정도 좀 쉬어 >> 멀티 thread가 됐을때 30s 문제가 생겨서 50s으로 바꾸니 해결됨
			System.out.println(tp.getResult());
		}
		catch(Exception e){}
	
	
	
	}

}
