package chapter3;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Ellipse2D.Double;
import javax.swing.JComponent;
import java.awt.Color;


public class BullsEyeComponent extends JComponent {

	public void paintComponent(Graphics g) {
		
		Graphics2D g2 = (Graphics2D) g;
		BullsEye b = new BullsEye(11,300);
		int numCircles = b.getNumRings();
		double radius = b.getRadius();
		Color black = Color.BLACK;
		Color white = Color.WHITE;
		Color colour;
		double start = 100;
		double end = 100;
		double reduceRadiusBy = radius / (double)numCircles;
		double increaseStartBy = radius / (2 * (double)numCircles);
		double increaseEndBy = radius / (2 * (double)numCircles);
		
		
		for(int i = 1; i <= numCircles; i++) {
			Ellipse2D e = new Ellipse2D.Double(start,end,radius,radius);
			if (i % 2 == 0) {
				colour = white;
			}
			else {
				colour = black;
			}
			g2.setColor(colour);
			g2.draw(e);
			g2.fill(e);
			
			radius = radius - reduceRadiusBy;
			start = start + increaseStartBy;
			end = end + increaseEndBy;
			System.out.println("Radius = "  + radius + " start = " + start + " end = " + end);
			
			
		}
		
	}
	
}
