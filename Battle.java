import java.util.Scanner;

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
                    int dano = player.attackEnemy(enemy);
                    enemy.setHP(enemy.HP - dano);
                    System.out.println(player.name + " deu " + dano + " de dano");
                    endBattle();
                    turnAction();
                    break;

                case 2:
                    int dano2 = enemy.attackEnemy(player) / 2;
                    player.setHP(player.HP - dano2);
                    System.out.println("Você tomou " + dano2 + " de dano");
                    endBattle();
                    dano2 = enemy.attackEnemy(player) * 2;
                    turnAction();
                    break;

                case 3:
                    //bag.getItems();
                    System.out.println("É para aparecer os itens aqui");
                    turnAction();
                    endBattle();
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
            System.out.println("Game Over");
            playerWin = 1;
        }
        else if(enemy.HP <= 0) {
            System.out.println("Você venceu");
            playerWin = 2;
            enemy.verifyEnemyHP();
        }
        else {
            playerWin = 3;
        }
        return playerWin;
    }
}
