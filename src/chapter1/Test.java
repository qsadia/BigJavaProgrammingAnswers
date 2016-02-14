package chapter1;

import java.net.URL;
import javax.swing.ImageIcon; 
import javax.swing.JOptionPane;

public class Test {

	public static void main(String[] args) throws Exception {

		URL imageLocation = new URL("http://edugeography.com/content/image.php?pic=../images/alps/alps-01.jpg");
		JOptionPane.showMessageDialog(null, "Hello", "Title", JOptionPane.PLAIN_MESSAGE, new ImageIcon(imageLocation));
		System.exit(0); 
	}
}