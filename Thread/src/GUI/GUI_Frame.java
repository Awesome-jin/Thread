package GUI;

import java.awt.Color;
import java.awt.Frame;

public class GUI_Frame {

	public static void main(String[] args) {
		// 1. 기본 세팅 - 프레임 만들기
		Frame f = new Frame();
		
		Color rgb = new Color(32, 24, 32);
		
		//cf. 좌표 설정 (채워 나가는 건 옵션)
		f.setLocation(100,300);
		f.setTitle("Hello?");
		f.setBackground(rgb);
		
		// 2. 윈도우 크기 설정 : 기본크기가 0이므로 꼭 설정해야 함
		f.setSize(300, 500);
		// 3. 윈도우를 화면에 출력 : 기본적으로 false라서 보려면 꼭 선언해야 함
		f.setVisible(true);
	}

}
