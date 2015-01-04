import java.awt.Color;
import java.awt.Graphics;


public class Oval extends Body {

	public Oval(int x, int y, int width, int heigth, Color color, int speedX,
			int speedY,int minX, int minY, int maxX, int maxY) {
		super(x, y, width, heigth, color, speedX, speedY, minX, minY, maxX, maxY);

	}
	@Override
	public void draw(Graphics g){
		super.draw(g);
		g.fillOval(super.getX(), super.getY(), super.getWidth(), super.getHeigth());
		g.setColor(Color.ORANGE);
		
		g.fillOval(super.getX()+4, super.getY()+4, super.getWidth()-7, super.getHeigth()-7);
		g.setColor(getColor());
	}
	
	
	
	
	

}
