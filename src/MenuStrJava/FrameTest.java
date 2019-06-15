package MenuStrJava;

import MenuStrJava.MyFrame;

import javax.swing.JFrame;

public class FrameTest {
	public static void main (String [] args){
		MyFrame frame = new MyFrame();
		frame.setDefaultCloseOperation
			(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setTitle("Editing lines");
	}
}
