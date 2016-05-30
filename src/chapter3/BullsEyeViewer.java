package chapter3;

import javax.swing.JFrame;

import chapter2.NameComponent;

public class BullsEyeViewer {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		frame.setSize(500, 500);
		frame.setTitle("Bulls Eye"); 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		BullsEyeComponent component = new BullsEyeComponent(); 
		frame.add(component);
		
		frame.setVisible(true);
	}
	
}
