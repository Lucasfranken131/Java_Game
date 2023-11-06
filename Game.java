import java.awt.BorderLayout;
import java.awt.Container;
import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;

public class Game {
    public static void main(String[] args) throws IOException {
        Player player = new Player("Jorge", 50, 30, 25, 1);
        JFrame gameFrame = new JFrame("Durag Magni");
        gameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gameFrame.setSize(700, 700);
        JMenuBar menu = new JMenuBar();
        JLabel nome = new JLabel(player.name);
        menu.add(nome);
        menu.setSize(200, 200);
        
        Map mapa = new Map(1, 1, "Initial", "up");
        gameFrame.add(menu, BorderLayout.SOUTH);

        Container frameContainer = gameFrame.getContentPane();
        Bat bat = new Bat("bat" ,50, 25, 15);    
        frameContainer.add(bat.setEnemyImage());
        gameFrame.setVisible(true);

        Battle battle = new Battle(player, bat);
    }
}