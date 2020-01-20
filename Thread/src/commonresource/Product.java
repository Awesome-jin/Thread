package commonresource;

import java.util.ArrayList;
import java.util.List;

//공유자원을 소유한 클래스
public class Product {

	private List<Character> list;

	// 생성자 - list를 초기화 해주는 역할 만들어보기
	public Product() {
		list = new ArrayList<Character>();
	}

	// 데이터 1개를 받아서 저장하는 메소드
	public synchronized void put(Character ch) {
		// 2개 넘으면 너도 기다려
		if (list.size() > 2) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
			list.add(ch);
			notify();
			// 데이터 추가 후 신호를 보냄
			System.out.println(ch + "이/가 입고 되었습니다.");
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
			}
			System.out.println("현재 수량: " + list.size());
		}


	// 데이터 1개를 꺼내서 출력하는 메소드
	public synchronized void get() {
		if (list.size() == 0) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		Character ch = list.remove(0); // 1번째 데이터를 삭제하고 리턴하는 것. 안에 자료형이 문자형이었으니까 똑같이 Character로
		notify();
		System.out.println(ch + "가 출고되었습니다.");
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
		}
		System.out.println("현재 수량: " + list.size());
	}

}// end
