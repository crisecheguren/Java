import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawPanel extends JPanel
{
	// draws an x from the corners of the panel
	public void paintComponent(Graphics g)
	{
		// call paintComponent to ensure panel displays correctly
		super.paintComponent(g);

		int width = getWidth(); // total width
		int height = getHeight(); // total height
		System.out.println(height);
		System.out.println(width);
		width = 16;
		height = 220;

		// draw a line from the upper-left to the lower-right
		for (int i = 1; i < 15; i++) {
			g.drawLine(0, height, width, 0);
			width += 16;
			height -= 15;
		}

		// width = 16;
		// height = 220;
		// for (int i = 1; i < 15; i++) {
		// 	g.drawLine(0, height, width, 0);
		// 	width += 16;
		// 	height -= 15;
		// }


		// draw a line from the lower-left to the upper-right
		// g.drawLine(0, height, width, 0);
	} // end method paintComponent
} // end class DrawPanel