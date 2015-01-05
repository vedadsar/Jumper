import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
/**
 * Igrica Jumper. Cilj igrice preskakati prepreke koje nailaze. 
 * Igrica nije zavrsena, treba dodate restart i exit button.
 * @author Vedad Zornic
 *
 */
public class Play  {

	private static JFrame game;
	private static JButton restartGame;
	public static void main(String[] args) {
			
		
		game = new JFrame("JUMPER");
		restartGame = new JButton("Restart");
		
		
		game.setSize(500, 500);
		game.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		GameGraphics graphicElements = new GameGraphics(game.getHeight(),
				game.getWidth());

		game.setLocation(350, 350);
		game.setContentPane(graphicElements);
		game.add(restartGame);
		

		game.setVisible(true);

		graphicElements.requestFocus(false);
		
		ButtonHandler bh = new ButtonHandler();
		restartGame.addActionListener(bh);

	}
	
	private static void restartGame(){
		game.dispose();
		main(null);
	}
	
	public static class ButtonHandler implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == restartGame)
				restartGame();
		}
		
	}
	
}