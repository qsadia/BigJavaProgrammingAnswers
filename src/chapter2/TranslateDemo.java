package chapter2;

import java.awt.Rectangle; 
import javax.swing.JFrame; 
import javax.swing.JOptionPane;

public class TranslateDemo {

	public static void main(String[] args) {
		
		// Construct a frame and show it
		JFrame frame = new JFrame(); 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		frame.setVisible(true);
		
		// Construct a rectangle and set the frame bounds
		Rectangle rectangle = new Rectangle(500,500,100,100);
		frame.setBounds(rectangle);
				
		JOptionPane.showMessageDialog(frame, "Click OK to continue");
		// Move the rectangle and set the frame bounds again
		rectangle.translate(40,40);
		frame.setBounds(rectangle);
	}

}
