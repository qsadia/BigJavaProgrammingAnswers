package chapter5;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Point2D;
import javax.swing.JComponent;
import java.util.Scanner;

public class CircleComponent extends JComponent {

	public Circle c;
	public Point2D.Double p;
	
	public CircleComponent() {
		c = new Circle();
		
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter x,y coordinates for a point:");
		double x = in.nextDouble();
		double y = in.nextDouble();
		this.p = new Point2D.Double(x, y);
		in.close();	
	}
	
	protected void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D)g;
		g2.setColor(Color.black);
		
		g2.draw(c.getCircle());
		Ellipse2D.Double point = new Ellipse2D.Double(p.getX(), p.getY(), 5, 5);
		
		if(c.isInside(p)) {
			g2.setColor(Color.green);
		}
		else {
			g2.setColor(Color.red);
		}
		
		g2.draw(point);
		g2.fill(point);
	}
	

}
