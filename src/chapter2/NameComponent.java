package chapter2;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;

public class NameComponent extends JComponent {
	
	public void paintComponent(Graphics g) {
		
		Graphics2D g2 = (Graphics2D) g;
		
		g2.setColor(Color.BLUE);
		Rectangle box = new Rectangle(0, 0, getWidth(), getHeight()); 
		g2.draw(box);
		g2.fill(box);
		
		g2.setColor(Color.RED);
		String name = "Miss Sadia";
		
		g2.drawString(name, (getX() + getWidth())/4 , (getY() + getHeight())/2);
		
		
	}

}
