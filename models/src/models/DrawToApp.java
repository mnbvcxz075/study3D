package models;

import java.applet.Applet;
import java.awt.Graphics;

public class DrawToApp extends Applet{

	ViewModel view;
	
	public DrawToApp() {
		// TODO 自動生成されたコンストラクター・スタブ
	}

	@Override
	public void init() {
		 view = new ViewModel();
	}
	@Override
	public void paint(Graphics g) {
		view.paint(g);
	}
	@Override
	public void update(Graphics g) {
		// TODO 自動生成されたメソッド・スタブ
		super.update(g);
	}

}
