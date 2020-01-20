package GUI;

import java.awt.Frame;
import java.awt.Label;

public class MoveComponent extends Frame {
	public MoveComponent() {
		
		//레이아웃을 null로 설정
		setLayout(null);
		
		Label label = new Label("@");
		label.setLocation(20, 100); //layout이 null인 경우는 location과 size를 직접 다 입력해줘야함
		label.setSize(20,20);
		add(label);
		
		setTitle("Components move");
		setLocation(100, 100);
		setSize(300, 200);
		setResizable(false);
		setVisible(true);
		
		while(true) {
			int x = label.getLocation().x;
			int y = label.getLocation().y;
			x = x +20;
			try {
				Thread.sleep(1000);
				label.setLocation(x, y);
			}catch(Exception e) {}
		}
	}
	
}
