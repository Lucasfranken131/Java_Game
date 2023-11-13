package Battle;
import java.util.Scanner;
import Enemies.*;
import Players.*;
import System.ClearScreen;
import Maps.*;

public class Battle {
    Player player;
    Enemy enemy;
    Map map;

    public Battle(Player player, Enemy enemy, Map map) {
        this.player = player;
        this.enemy = enemy;
        this.map = map;
        ClearScreen.clrscr();
        System.out.println("Você é atacado por " + this.enemy.name + ":");
        turnAction();
    }

    public int turnAction() {
        try (Scanner scan = new Scanner(System.in)) {

            System.out.println(" ");
            System.out.println(enemy.name + "");
            System.out.println(" ");

            System.out.println("1 - Atacar");
            System.out.println("2 - Defender");
            System.out.println("3 - Bolsa");
            System.out.println("4 - Magia");
            System.out.println("5 - Fugir");
            System.out.println(" ");
            
            int choice = scan.nextInt();

            switch (choice) {
                case 1:
                    ClearScreen.clrscr();
                    player.playerAttack(enemy);
                    enemy.enemyAttack(player, 1);
                    player.getPlayerStats();
                    enemy.getEnemyStats();

                    battleStatus();
                    break;

                case 2:
                    ClearScreen.clrscr();
                    enemy.enemyAttack(player, 0.5);
                    player.getPlayerStats();
                    enemy.getEnemyStats();

                    battleStatus();
                    break;

                case 3:
                    ClearScreen.clrscr();
                    //bag.getItems();
                    System.out.println("É para aparecer os itens aqui");
                    turnAction();
                    break;

                case 4:
                    //getMagics();
                    
                case 5:
                    ClearScreen.clrscr();
                    //Volta para o mapa normal, com uma porcentagem é claro
                    enemy.setHP(0);
                    endBattle();
                    this.map.setMapOn(true);
                    map.showMap();
                    break;

                default:
                    ClearScreen.clrscr();
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

    public int battleStatus() {
        int playerWin = endBattle();
        if(playerWin == 1){
            //Aqui faz a chamada da tela de Game Over
        }
        else if(playerWin == 2) {
            //Aqui faz a chamada para o mapa.
            this.map.setMapOn(true);
        }
        else {
            turnAction();
        }
        return playerWin;
    }
}
