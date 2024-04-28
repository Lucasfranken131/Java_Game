package Maps;
import java.util.Random;

import Battle.Battle;
import Enemies.Bat;
import Enemies.Enemy;
import Enemies.Goblin;
import Players.Player;
import System.ClearScreen;

public class Initial extends Map {
    static int type = 2;

    public Initial(int x, int y, String direction, Player player) {
        super(x, y, type, direction, player);
        showMap();
    }

    public void showMap() {
        System.out.println("X:  1  2  3  4  5  6  7  8  9  10 11 12");
        System.out.println(" ");
        System.out.println("Y: ___");
        System.out.println("1  | |");
        System.out.println("2  | |");
        System.out.println("3  | |                     ___");
        System.out.println("4  | |                     | |");
        System.out.println("5  | |                     | |");
        System.out.println("6  | |______________       | |");
        System.out.println("7  |__              |______| |__________");
        System.out.println("8     |                              ___|");
        System.out.println("9     |                ______________|");
        System.out.println("10    |                |");
        System.out.println("11    |                |");
        System.out.println("12    |_________   ____|");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Posição X: " + this.x);
        System.out.println("Posição Y: " + this.y);
        System.out.println("Direção: " + showDirection());
        movePlayer();
        ClearScreen.clrscr();
        showMap();
    }

    public void mapToBattle() {
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
            Battle battle = new Battle(this.player, enemy1, this);
            battle = null;
        }
    }
}
