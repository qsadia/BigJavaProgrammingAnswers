package chapter2;

import javax.swing.JFrame;

public class NameViewer {
	
	public static void main(String[] args) {
	
		JFrame frame = new JFrame();
		frame.setSize(200, 125);
		frame.setTitle("My Name"); 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		NameComponent component = new NameComponent(); 
		frame.add(component);
		
		frame.setVisible(true);
	}
	
}