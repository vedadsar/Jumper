import java.awt.Color;
import java.awt.Graphics;


public class Player extends Body {

	public Player(int x, int y, int width, int heigth, Color color, int speedX,
			int speedY, int minX, int minY, int maxX, int maxY) {
		
		super(x, y, width, heigth, Color.blue , speedX, speedY, minX, minY, maxX, maxY);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void draw(Graphics g){
		super.draw(g);
		
		
		
		g.setColor(super.getColor());
		g.fillOval(super.getX(), super.getY(), super.getWidth(), super.getHeigth());
		
		// Crtanje ociju nasem igracu
		g.setColor(Color.GREEN);
		g.fillOval(super.getX()+9, super.getY()+7, 7, 8);
		g.fillOval(super.getX()+25, super.getY()+7, 7, 8);
		
		//Crtanje zjenica oka
		g.setColor(Color.BLACK);
		g.fillOval(super.getX()+12, super.getY()+9, 3, 3);
		g.fillOval(super.getX()+28, super.getY()+9, 3, 3);
		
		//Crtanje nosa
		g.setColor(Color.ORANGE);
		g.fillOval(super.getX()+17, super.getY()+17, 4, 8);
		
		//Crtanje usta
		g.setColor(Color.white);
		g.fillOval(super.getX()+12, super.getY()+30, 15, 4);
		
		
		
		g.setColor(Color.BLACK);
	}

}
