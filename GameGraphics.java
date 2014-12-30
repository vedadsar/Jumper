import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

public class GameGraphics extends JPanel implements ActionListener {

	private Timer animation;
	private Body[] elements;
	private int elementsCounter;
	private int heigth;
	private int width;
	private Body player;
	private int scoreCounter;
	private Date start;
	
	
	public GameGraphics(int heigth, int width) {
		super();
		
		this.heigth = heigth;
		this.width = width;
		player = new Oval(width / 2, heigth - 100 - 40, 40, 40, Color.BLUE, 0,
				0, 0, 0, width, heigth - 100);
		this.scoreCounter = 0;
		elements = new Body[100];
		animation = new Timer(1000 / 60, this);
		elementsCounter = 100;

		animation.start();

		start = new Date();

		addKeyListener(new KeyHandler());

		createElements();

	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Date end;
		this.setBackground(new Color(184, 242, 245));
		g.setColor(new Color(54, 140, 22));
		g.fill3DRect(0, 400, 500, 100, true);
		int j = 0;
		for (int i = 0; i < elementsCounter; i++) {
			elements[i].draw(g);
			if (player.checkCollision(elements[i]) == true) {
				animation.stop();
				JOptionPane.showMessageDialog(null, "Izgubio si");
				break;
			}

			for ( j = 0; j < elementsCounter; j++) {
				if (elements[scoreCounter].getX() <= width/2) {
					scoreCounter = scoreCounter +1;
					
				}
			}

		}
		player.draw(g);
		g.drawString("Vas score je " + scoreCounter, 100, 100);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		repaint();
	}

	/**
	 * Kreira niz od 10 elemenata. Random faktori.
	 */
	public void createElements() {

		int randomX = (int) (width + (Math.random() * 1000));

		for (int i = 0; i < elementsCounter; i++) {
			this.elements[i] = new Oval(randomX, heigth - 100,
					(int) (10 + (Math.random() * 21)),
					(int) (10 + (Math.random() * 14)), Color.RED, -3, 10, 0, 0,
					500, heigth - 100);
			randomX += 300;
		}

	}

	private class KeyHandler extends KeyAdapter {

		public void keyTyped(KeyEvent e) {
			player.jump();
		}
	}

}