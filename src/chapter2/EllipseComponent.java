package chapter2;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

import javax.swing.JComponent;

public class EllipseComponent extends JComponent {
	
	public void paintComponent(Graphics g) {
		
		Graphics2D g2 = (Graphics2D) g;
		
		Ellipse2D e = new Ellipse2D.Double(0, 0, getWidth(), getHeight());
		g2.setColor(Color.BLACK);
		g2.draw(e);
		g2.setColor(Color.GREEN);
		g2.fill(e);
		
	}
	
}
