package chapter5;

import java.awt.Color;

import javax.swing.JFrame;

public class TwoCirclesViewer {

		public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(400, 400);
		frame.setTitle("Circles"); 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		TwoCirclesComponent component = new TwoCirclesComponent(); 
		frame.add(component);
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setVisible(true);
	}

}
