package chapter3;

import java.awt.Color;

import javax.swing.JFrame;

public class OlympicRingViewer {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		frame.setSize(800, 500);
		frame.setTitle("Olympic Rings"); 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		OlympicRingComponent component = new OlympicRingComponent(); 
		frame.add(component);
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setVisible(true);
	
	}
}
