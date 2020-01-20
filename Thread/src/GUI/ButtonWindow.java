package GUI;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.FileDialog;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.Panel;
import java.awt.ScrollPane;
import java.util.Random;

public class ButtonWindow extends Frame {
	
	private Button btn;
	private Checkbox man,woman;
	
	public ButtonWindow() {
		setTitle("Button window");
		setLocation(100, 100);
		setSize(300, 300);
		
		Panel p = new Panel();
		btn = new Button("Signin");
		//btn.setLabel("Signout"); 이런식으로 버튼 이름 설정 가능
		p.add(btn);
		
		//Checkboxgroup을 만들면 default값 설정 가능
		CheckboxGroup group = new CheckboxGroup();
		man = new Checkbox("Male", group, true);
		woman = new Checkbox("Woman", group, false);
		
		//버튼을 패널에 추가
		p.add(man);
		p.add(woman);
		
		// 레이블 추가하기
		Label label = new Label("This is Label");
		p.add(label);
		
		// button 100개를 한 패널에 추가해보자 (수동으로 화면을 늘리지 않는 한 보이지 않을 정도로)
		for (int i = 0; i<100; i=i+1) {
			Button button = new Button("button" + i);
			p.add(button);		
			}
		
		//출력할 내용이 부모보다 크다면 스크롤이 가능한 콤포넌트에 배치. 스크롤이 가능한 컴포넌트를 부모에 배치
		//패널을 윈도우에 추가
		//add(p);
		
		ScrollPane sp = new ScrollPane(ScrollPane.SCROLLBARS_AS_NEEDED);
		sp.add(p);
		add(sp);
		
		//메뉴바 생성
		MenuBar menubar = new MenuBar();
		
		// 메뉴 생성
		Menu menu = new Menu("File");
		
		// 메뉴 하단의 종족 메뉴 만들어서 붙이기
		MenuItem item1 = new MenuItem("open");
		MenuItem item2 = new MenuItem("save");
		MenuItem item3 = new MenuItem("save all");
		MenuItem item4 = new MenuItem("exit");
		menu.add(item1);
		menu.add(item2);
		menu.add(item3);
		menu.add(item4);
		
		// 메뉴 아이템 생성
		menubar.add(menu);
		
		// 프레임에 메뉴바 부착
		setMenuBar(menubar);
		
		FileDialog open = new FileDialog(this, "open", FileDialog.LOAD);
		open.setDirectory("c:\\"); // c드라이브로 기본 디렉토리르 만들게!
		open.setVisible(true); //그냥 요거만 치면 기본 디렉토리가 열림
		System.out.println(open.getDirectory() + open.getFile()); // 선택한 파일 경로 출력
		setVisible(true);
		
		/*3초 후에 버튼의 레이블 변경
		try {
			Thread.sleep(3000);
			btn.setLabel("Signout");
		}
		catch(Exception e) {}*/
		
		/*
		for(int i =0; i <20; i=i+1) {
			try {
				Thread.sleep(1000);
				btn.setLabel("btn"+i);
			}
			catch(Exception e){}
		}*/
		
		String [] labels = {"This is Label", "is Label This", "Label This is"}; // 필요한게 있으면 배열에 쭉 집어넣기
		Color [] colors = {Color.RED, Color.BLUE, Color.GREEN, Color.BLACK, Color.YELLOW};
		int j = 0;
		while(true) { //반복문을 만들어서 수행시키기
			Random r = new Random(); // 랜덤으로 하고 싶다면 랜덤 인스턴스를 만들어서
			try {
				Thread.sleep(1000);
				j =j +1;
				label.setText(labels[j%labels.length]);
				label.setForeground(colors[r.nextInt(colors.length)]); // 랜덤으로 뽑고싶은 배열이름을 nextInt의 매개변수로 넣어주기
			}
			catch(Exception e) {}
		}
		
		/*Color [] colors = {Color.RED, Color.BLUE, Color.GREEN};
		
		int i = 0;
		while(true) { //1초마다 버튼 색깔 바꾸기 
			try {
				Thread.sleep(1000);
				btn.setBackground(colors[i%colors.length]);
				i = i+1;
			}
			catch(Exception e){}
		}*/
	
	}
}
