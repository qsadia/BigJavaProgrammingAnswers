package chapter2;

import javax.swing.JFrame;

public class EllipseViewer {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		frame.setSize(200, 200);
		frame.setTitle("Ellipse"); 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		EllipseComponent component = new EllipseComponent(); 
		frame.add(component);
		
		frame.setVisible(true);

	}

}
