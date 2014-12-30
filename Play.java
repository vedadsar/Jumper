import javax.swing.JButton;
import javax.swing.JFrame;


public class Play {
public static void main(String[] args) {
	JButton restartButton = new JButton("restart");
	
	JFrame game = new JFrame("JUMPER");
	game.setSize(500,500);
	game.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	GameGraphics graphicElements = new GameGraphics(game.getHeight(), game.getWidth());
	
	game.setContentPane(graphicElements);
	//game.add(restartButton);
	game.setVisible(true);
	
	graphicElements.requestFocus(false);
	
}
}
