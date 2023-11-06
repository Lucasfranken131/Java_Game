package Battle;
import java.util.Scanner;

import Enemies.*;
import Players.Player;

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

            switch (choice) {
                case 1:
                    player.playerAttack(enemy);
                    enemy.enemyAttack(player, 1);
                    player.getPlayerStats();
                    enemy.getEnemyStats();
                    break;

                case 2:
                    enemy.enemyAttack(player, 0.5);
                    player.getPlayerStats();
                    enemy.getEnemyStats();
                    break;

                case 3:
                    //bag.getItems();
                    System.out.println("É para aparecer os itens aqui");
                    break;
                    
                case 4:
                    //Volta para o mapa normal, com uma porcentagem é claro
                    endBattle();
                    break;

                default:
                    endBattle();
                    turnAction();
                    break;
            }
            return choice;
        }
    }

    public int endBattle() {
        int playerWin;
        if(player.HP <= 0) {
            System.out.println(" ");
            System.out.println("Game Over");
            System.out.println(" ");
            playerWin = 1;
        }
        else if(enemy.HP <= 0) {
            playerWin = 2;
            System.out.println("Você volta para o mapa.");
        }
        else {
            playerWin = 3;
        }
        return playerWin;
    }
}
