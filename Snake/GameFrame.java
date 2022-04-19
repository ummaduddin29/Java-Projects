import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class GameFrame extends JFrame {

	GameFrame() {
		this.add(new GamePanel());
		Image icon = Toolkit.getDefaultToolkit().getImage("Icon.jpg");  
	    this.setIconImage(icon); 
		this.setTitle("Snake");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.pack();
		this.setVisible(true);
		this.setLocationRelativeTo(null);
	}
}
