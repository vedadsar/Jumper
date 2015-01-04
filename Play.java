
import javax.swing.JFrame;
/**
 * Igrica Jumper. Cilj igrice preskakati prepreke koje nailaze. 
 * Igrica nije zavrsena, treba dodate restart i exit button.
 * @author Vedad Zornic
 *
 */
public class Play  {

	public static void main(String[] args) {
			

		JFrame game = new JFrame("JUMPER");
		game.setSize(500, 500);
		game.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		GameGraphics graphicElements = new GameGraphics(game.getHeight(),
				game.getWidth());

		game.setLocation(350, 350);
		game.setContentPane(graphicElements);


		game.setVisible(true);

		graphicElements.requestFocus(false);

	}
}
