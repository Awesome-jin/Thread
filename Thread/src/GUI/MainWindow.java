package GUI;

import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;

public class MainWindow extends Frame {
	public MainWindow() {
		
		Panel northpanel = new Panel();
		Label labeltitle = new Label();
		TextField txtfield = new TextField(30);
		northpanel.add(labeltitle);
		northpanel.add(txtfield);
		
		
		//패널을 북쪽에 배치
		add("North", northpanel);
		
		setTitle("게시물 입력");
		setLocation(100, 100);
		setSize(300, 200);
		setResizable(false);
		setVisible(true);
	}

}
