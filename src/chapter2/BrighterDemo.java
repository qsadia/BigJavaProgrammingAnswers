package chapter2;

import java.awt.Color;
import javax.swing.JFrame;

public class BrighterDemo {
	
	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		frame.setSize(200, 200);
		
		Color colour = new Color(50,100,150);
		colour = colour.brighter();
		
		frame.getContentPane().setBackground(colour); 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		frame.setVisible(true);	
		
		System.out.println(colour);
		
	}

}
