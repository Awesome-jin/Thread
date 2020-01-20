package commonresource;

public class Main {

	public static void main(String[] args) {

		//공유 자원을 생성하자
		
		Product product = new Product();
		
		//Thread 클래스를 상속받은 클래스의 인스턴스를 만들고 스레드로 동작시켜보자
		Customer customer = new Customer(product);
		Producer producer = new Producer(product);
		
		
		customer.start(); //run : 일반동작! start : 스레드로 동작!
		producer.start(); // customer는 producer가 일하고 나서 다음에 동작해야 한다. 이럴 때 쓰는게 wait & notify
	}

}
