package Maps;
import java.util.Random;
import javax.swing.ImageIcon;
import Battle.Battle;
import Enemies.Bat;
import Enemies.Enemy;
import Enemies.Goblin;
import Players.Player;

public class Initial extends Map {
    static int type = 2;
    static ImageIcon icon = new ImageIcon("../images/maps/presia.png");

    public Initial(int x, int y, String direction) {
        super(x, y, type, direction);
    }

    public void showMap(Player player) {
        System.out.println("Posição X: " + this.x);
        System.out.println("Posição Y: " + this.y);
        System.out.println("Direção: " + showDirection());
        // movePlayer(player);
        // showMap(player);
    }

    public void mapToBattle(Player player) {
        Random random = new Random();
        int battleChance = random.nextInt(100 + this.getSteps());
        if(battleChance >= 70) {
            Enemy enemy1 = null;
            int enemyFormation = random.nextInt(100);
            if(enemyFormation <= 25) {
                enemy1 = new Goblin();
            }
            else if(enemyFormation <= 50) {
                enemy1 = new Goblin();
            }
            else if(enemyFormation <= 75) {
                enemy1 = new Bat();
            }
            else if(enemyFormation > 75) {
                enemy1 = new Bat();
            }
            Battle battle = new Battle(player, enemy1, this);
            battle = null;
        }
    }
}
