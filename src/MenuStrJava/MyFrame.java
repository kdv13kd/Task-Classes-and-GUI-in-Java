package MenuStrJava;//import java.awt.*;
import javax.swing.*;

class MyFrame extends  JFrame {
	public static final int DEFAULT_WIDTH = 1000;
	public static final int DEFAULT_HEIGHT = 800;
	public MyFrame(){
		setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
		MyPanel panel = new MyPanel();
		//panel.setBackground(Color.BLUE);
		add(panel);
	}
	
}
