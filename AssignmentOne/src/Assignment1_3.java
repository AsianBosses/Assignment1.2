import java.awt.Graphics;

import javax.swing.JApplet;

public class Assignment1_3 extends JApplet {
	public void paint(Graphics canvas) {
		super.paint(canvas);
		// vertical lines
		canvas.drawLine(300, 200, 300, 500);
		canvas.drawLine(400, 200, 400, 500);

		// horizontal lines
		canvas.drawLine(200, 275, 500, 275);
		canvas.drawLine(200, 395, 500, 395);

		// draw X
		// draw left X
		canvas.drawLine(200, 275, 300, 395);
		canvas.drawLine(200, 395, 300, 275);
		// draw center X
		canvas.drawLine(300, 395, 400, 275);
		canvas.drawLine(300, 275, 400, 395);
		// draw right X
		canvas.drawLine(400, 395, 500, 275);
		canvas.drawLine(400, 275, 500, 395);

		// draw line through X
		canvas.drawLine(200, 335, 500, 335);

		// draw circles
		// draw bottom left circle
		canvas.drawOval(190, 400, 100, 100);
		// draw top middle circle
		canvas.drawOval(310, 190, 80, 80);
		// draw bottom right circle
		canvas.drawOval(410, 405, 100, 100);
	}
}
