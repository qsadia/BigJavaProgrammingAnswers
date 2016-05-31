package chapter5;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Point2D;
import java.util.Scanner;

import javax.swing.JComponent;

public class TwoCirclesComponent extends JComponent{

	private Circle circle1;
	private Circle circle2;
	
	public TwoCirclesComponent () {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Please enter radius of Circle 1: ");
		double radius1 = in.nextDouble();
		
		System.out.println("Please enter radius of Circle 2: ");
		double radius2 = in.nextDouble();
		
		if (radius1 < 0 || radius2 < 0) {
			System.err.println("Radius cannot be negative!");
			System.exit(1);
		}
		
		in.close();
		
		Point2D.Double centre1 = new Point2D.Double(100, 200);
		this.circle1 = new Circle(centre1, radius1);
		Point2D.Double centre2 = new Point2D.Double(200, 100);
		this.circle2 = new Circle(centre2, radius2);
	}
	
	
	protected void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D)g;
		g2.setColor(Color.red);
		
		if(circle1.intersects(circle2)) {
			g2.setColor(Color.green);
		}
		
		g2.draw(circle1.getCircle());
		g2.draw(circle2.getCircle());
		g2.fill(circle1.getCircle());
		g2.fill(circle2.getCircle());
	}
	
}
