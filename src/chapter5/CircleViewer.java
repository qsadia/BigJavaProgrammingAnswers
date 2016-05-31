package chapter5;

import java.awt.Color;
import javax.swing.JFrame;

public class CircleViewer {

		public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(400, 400);
		frame.setTitle("Circles"); 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		CircleComponent component = new CircleComponent(); 
		frame.add(component);
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setVisible(true);

	}


}
