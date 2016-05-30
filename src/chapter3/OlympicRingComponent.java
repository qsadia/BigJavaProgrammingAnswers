package chapter3;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Ellipse2D.Double;
import javax.swing.JComponent;

import java.awt.BasicStroke;
import java.awt.Color;

public class OlympicRingComponent extends JComponent{

	public void paintComponent(Graphics g) {
		
		Graphics2D g2 = (Graphics2D) g;
		
		int strokeSize = 5;
		g2.setStroke(new BasicStroke(strokeSize));
		
		Color colours[] = {Color.BLUE, Color.BLACK, Color.RED, Color.YELLOW, Color.GREEN};
		
		double startx = 100;
		double starty = 100;
		double radius = 100;
		double x = startx;
		double y = starty;
		
		for (int i = 0; i < 5; i ++) {

			Ellipse2D e = new Ellipse2D.Double(x,y,radius,radius);
			g2.setColor(colours[i]);
			g2.draw(e);
			if (i == 2) {
				x = startx + radius / 2D;
				y = starty + radius / 2D;
			}
			else {
				x = x + strokeSize + radius;
			}
			
			
		}
		
	}
}
