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
		int steps1 = width / 15;
		int steps2 = height / 15;
		// draw a line from the upper-left to the lower-right

		for (int i = 1; i < 15; i++) {
			g.drawLine(0, 0, steps1, height);
			steps1 += 35;
			g.drawLine(0, steps1, height, 0);
		}

		// draw a line from the lower-left to the upper-right
		g.drawLine(0, height, width, 0);
	} // end method paintComponent
} // end class DrawPanel