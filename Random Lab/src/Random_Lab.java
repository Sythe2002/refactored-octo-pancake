
// GraphicsLab03st.java
// Student Version

import java.awt.*;
import java.applet.*;
import java.util.*;

public class Random_Lab extends Applet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void paint(Graphics g) {
		// Draw Grid
		g.drawRect(10, 10, 780, 580);
		g.drawLine(400, 10, 400, 590);
		g.drawLine(10, 300, 790, 300);

		Random rndInt = new Random();

		// Draw Random Lines
		for (int p1 = 0; p1 <= 100; p1 += 1) {
			int x1 = rndInt.nextInt(390) + 10;
			int y1 = rndInt.nextInt(290) + 10;
			int x2 = rndInt.nextInt(390) + 10;
			int y2 = rndInt.nextInt(290) + 10;
			int red1 = rndInt.nextInt(256);
			int green1 = rndInt.nextInt(256);
			int blue1 = rndInt.nextInt(256);
			g.setColor(new Color(red1, green1, blue1));
			g.drawLine(x1, y1, x2, y2);
		}

		// Draw Random Squares
		for (int p1 = 0; p1 <= 100; p1 += 1) {
			int x3 = rndInt.nextInt(340) + 400;
			int y3 = rndInt.nextInt(240) + 10;
			int red2 = rndInt.nextInt(256);
			int green2 = rndInt.nextInt(256);
			int blue2 = rndInt.nextInt(256);
			g.setColor(new Color(red2, green2, blue2));
			g.fillRect(x3, y3, 50, 50);
		}

		// Draw Random Circles
		for (int p1 = 0; p1 <= 100; p1 += 1) {
			int Size = rndInt.nextInt(200);
			int x4 = rndInt.nextInt(380 - Size) + 10;
			int y4 = rndInt.nextInt(280 - Size) + 310;
			int red3 = rndInt.nextInt(256);
			int green3 = rndInt.nextInt(256);
			int blue3 = rndInt.nextInt(256);
			g.setColor(new Color(red3, green3, blue3));
			g.drawOval(x4, y4, Size, Size);
		}
		// Draw 3-D Box
		Polygon Top = new Polygon();
		g.setColor(Color.YELLOW);
		Top.addPoint(500, 400);
		Top.addPoint(575, 400);
		Top.addPoint(575, 450);
		Top.addPoint(550, 450);
		g.fillPolygon(Top);
		Polygon Left = new Polygon();
		g.setColor(Color.GREEN);
		Left.addPoint(500,400);
		Left.addPoint(550,450);
		Left.addPoint(550,525);
		Left.addPoint(500,475);
		g.fillPolygon(Left);
		g.setColor(Color.RED);
		g.fillRect(550,450,75,75);
		g.setColor(Color.BLUE);
		Polygon Right = new Polygon();
		Right.addPoint(575,400);
		Right.addPoint(625,450);
		Right.addPoint(575,450 );
		g.fillPolygon(Right);
		
		
		
	}

}
