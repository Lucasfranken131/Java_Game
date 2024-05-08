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
        turnAction();
        ClearScreen.clrscr();
    }

    public int turnAction() {
        ClearScreen.clrscr();
        Scanner scan = new Scanner(System.in);
        int choice;
        do {
            System.out.println(" ");
            System.out.println("Você é atacado por " + enemy.getName() + ":");
            System.out.println(" ");
            System.out.println(enemy.getImage());
            System.out.println(" ");
            System.out.println(enemy.getName());
            System.out.println("HP: " + enemy.getHP());
            System.out.println(" ");
            System.out.println(player.getName());
            System.out.println("HP: " + player.getHP());
            System.out.println(" ");
            System.out.println("1 - Atacar");
            System.out.println("2 - Defender");
            System.out.println("3 - Bolsa");
            System.out.println("4 - Magia");
            System.out.println("5 - Fugir");
            System.out.println(" ");
            ClearScreen.clrscr();
            choice = scan.nextInt();

            switch (choice) {
                case 1:
                    int dano_player = player.playerAttack(enemy);
                    System.out.println(" ");
                    System.out.println(player.getName() + " deu " + dano_player + " de dano");

                    double dano_enemy = enemy.enemyAttack(player, 1);
                    System.out.println(enemy.getName() + " lhe deu " + dano_enemy + " de dano");

                    battleStatus();
                    break;
                case 2:
                    dano_enemy = enemy.enemyAttack(player, 1);
                    System.out.println(enemy.getName() + " lhe deu " + dano_enemy + " de dano");
                    battleStatus();
                    break;
                case 3:
                    player.getItems();
                    dano_enemy = enemy.enemyAttack(player, 1);
                    System.out.println(enemy.getName() + " lhe deu " + dano_enemy + " de dano");
                    battleStatus();
                    break;
                case 4:
                    //getMagics(); 
                case 5:
                    enemy.setHP(0);
                    endBattle();
                    this.map.setMapOn(true);
                    map.showMap();
                    break;
                default:
                    System.out.println("Escolha inválida. Tente novamente.");
                    break;
            }
        } while(choice < 1 || choice > 5);
        return choice;
    }

    public int endBattle() {
        int playerWin;
        if(player.getHP() <= 0) {
            System.out.println(" ");
            System.out.println("Game Over");
            System.out.println(" ");
            playerWin = 1;
        }
        else if(enemy.getHP() <= 0) {
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
        ClearScreen.clrscr();
        if(playerWin == 1){
            //Aqui é para fazer a chamada da tela de Game Over
        }
        else if(playerWin == 2) {
            //Aqui faz a chamada para o mapa.
            this.map.setMapOn(true);
            map.setSteps(0);
            map.showMap();
        }
        else {
            turnAction();
        }
        return playerWin;
    }
}
