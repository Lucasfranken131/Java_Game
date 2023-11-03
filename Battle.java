import java.awt.Dimension;
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Battle {
    Player player;
    Enemy enemy;

    public Battle(Player player, Enemy enemy) {
        this.player = player;
        this.enemy = enemy;
        turnAction();
    }

    public String getPlayer() {
        return this.player.name;
    }

    public int turnAction() {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("1 - Atacar");
            System.out.println("2 - Defender");
            System.out.println("3 - Bolsa");
            System.out.println("4 - Fugir");
            System.out.println(" ");
            
            int choice = scan.nextInt();

            if(choice == 1) {
                int dano = player.attackEnemy(enemy);
                enemy.setHP(enemy.HP - dano);
                System.out.println(player.name + " deu " + dano + " de dano");
                endBattle();
                turnAction();
            }

            else if(choice == 2) {
                int dano = enemy.attackEnemy(player) / 2;
                player.setHP(player.HP - dano);
                System.out.println("Você tomou " + dano + " de dano");
                endBattle();
                dano = enemy.attackEnemy(player) * 2;
                turnAction();
            }

            else if(choice == 3) {
                //bag.getItems();
                System.out.println("É para aparecer os itens aqui");
                turnAction();
            }

            else if(choice == 4) {
                //Volta para o mapa normal, com uma porcentagem é claro;

                turnAction();
            }

            else {
                turnAction();
            }

            return choice;
        }
    }

    public int endBattle() {
        int playerWin;
        if(player.HP <= 0) {
            System.out.println("Game Over");
            playerWin = 1;
        }
        else if(enemy.HP <= 0) {
            System.out.println("Você venceu");
            playerWin = 2;
        }
        else {
            playerWin = 3;
        }
        return playerWin;
    }
}
