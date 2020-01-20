package commonresource;

public class Customer extends Thread {

	private Product product2;
	
	//Product를 이어 받은 생성자
	public Customer(Product product2) {
		this.product2 = product2;
	}
	
	public void run() { //Thread에선 선택이 아님. 실행시킬거면 무조건 있어야 함 
		for(int i = 0; i < 26; i=i+1) {
			product2.get();
		}
	}
}
