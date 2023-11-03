import java.awt.Container;
import java.io.IOException;
import javax.swing.JFrame;

public class Game {
    public static void main(String[] args) throws IOException {
        JFrame gameFrame = new JFrame("Durag Magni");
        gameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gameFrame.setSize(700, 700);
        Container frameContainer = gameFrame.getContentPane();

        Player player = new Player("Jorge", 50, 30, 25, 1);
        Bat bat = new Bat("sad" ,50, 25, 15);        
        
        frameContainer.add(bat.setEnemyImage());
        gameFrame.setVisible(true);

        Battle battle = new Battle(player, bat);
    }
}