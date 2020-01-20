package GUI;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Frame;
import java.awt.Panel;

public class ButtonWindow extends Frame {
	
	private Button btn;
	private Checkbox man,woman;
	
	public ButtonWindow() {
		setTitle("Button window");
		setLocation(100, 100);
		setSize(300, 300);
		
		Panel p = new Panel();
		btn = new Button("Signin");
		p.add(btn);
		
		//Checkboxgroup을 만들면 default값 설정 가능
		CheckboxGroup group = new CheckboxGroup();
		man = new Checkbox("Male", group, true);
		woman = new Checkbox("Woman", group, false);
		
		//버튼을 패널에 추가
		p.add(man);
		p.add(woman);
		
		//패널을 윈도우에 추가
		add(p);
		setVisible(true);
	}

}
