package commonresource;

public class Producer extends Thread {

	private Product product; // product class의 내용을 담은 내용을 product라는 변수로 만들었음
	
	// 외부에서 인스턴스를 주입 받아서 객체를 생성하는 생성자
	public Producer(Product product) {
		this.product = product;
	}
	
	
	// 스레드로 동작시키려면 무조건 있어야 하는 메소드  : run!
	public void run() {
		for (char i = 'A'; i<='Z'; i++) { //문자열도 덧셈으로 for문을 돌릴 수 있다.
			product.put(i);
		}
	}
	
	
}
