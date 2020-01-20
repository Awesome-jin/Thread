package GUI;

import java.awt.Color;
import java.awt.Dialog;
import java.awt.Frame;

public class superclass_frame extends Frame {

	//생성자를 만들어보자
	public superclass_frame( ) { //이건 프레임이라는 슈퍼클래스로부터 받은거라 프레임을 따로 안만들어도 됨
		setTitle("프레임 상속 버전");  //점도 찍을 필요 없음
		setLocation(30,30); 
		setSize(600,800);
		setBackground(Color.darkGray);
		
		
		// 대화 상자를 만들어서 출력
		Dialog dialog = new Dialog(this, "대화상자", true); // 끝에까지 true가 되면 얘는 modal이 된다
		dialog.setLocation(10, 10);
		dialog.setSize(100,100);	
		
		setVisible(true); //setVisible이 엄마 창이라 이 명령어가 dialogvisible보다 뒤에있으면 뜨질 않는다.
		dialog.setVisible(true); 
		
	}
}
