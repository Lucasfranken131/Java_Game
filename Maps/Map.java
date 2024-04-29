package Maps;
import Battle.Battle;
import Players.Player;
import Enemies.Enemy;
import java.util.Scanner;
import System.ClearScreen;
import java.util.Random;

public class Map {
    public int x;
    public int y;
    public String area;
    public int type; //type 1 = Sem monstros, type 2 = Com monstros
    public String direction;
    public int steps; // é para contar os passos, quantos mais passos maior a chance de ter uma batalha
    Player player;
    Enemy enemy;
    public boolean mapOn;

    public Map(int x, int y, int type, String direction, Player player) {
        this.x = x;
        this.y = y;
        this.type = type;
        this.direction = direction;
        this.player = player;
        this.steps = 0;
    }

    public void setMapOn(boolean mapOn) {
        this.mapOn = mapOn;
    }

    public String showDirection() {
        String playerDirection;
        switch(this.direction) {
            case "up":
                playerDirection = "^";

            case "left":
                playerDirection = "<";

            case "down":
                playerDirection = ">";

            case "right":
                playerDirection = "v";

            default:
                playerDirection = "^";
            break;
        }
        return playerDirection;
    }

    public String movePlayer() {
        String move;
        Scanner scan = new Scanner(System.in);
        System.out.println("w - Ir para cima");
        System.out.println("a - Ir para a esquerda");
        System.out.println("s - Ir para Baixo");
        System.out.println("d - Ir para a direita");
        System.out.println("Input:");
        System.out.println(" ");
        move = scan.nextLine();
        if(move.equals("w")) {
            setY(this.y + 1);
        }
        else if(move.equals("a")) {
            setX(this.x - 1);
        }
        else if(move.equals("s")) {
            setY(this.y - 1);
        }
        else if(move.equals("d")) {
            setX(this.x + 1);
        }
        else {
            ClearScreen.clrscr();
            System.out.println("Opção inválida");
            System.out.println(" ");
            movePlayer();
        }
        setSteps(steps + 1);
        mapToBattle();
        ClearScreen.clrscr();
        return move;
    }

    public void mapToBattle() {
        Random random = new Random();
        int battleChance = random.nextInt(100 + this.getSteps());
        if(battleChance >= 50) {
            Battle battle = new Battle(this.player, this.enemy, this);
        }
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public String getDirection() {
        return this.direction;
    }

    public boolean getMapOn() {
        return this.mapOn;
    }

    public int getSteps() {
        return this.steps;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setSteps(int steps) {
        this.steps = steps;
    }

    public void showMap() {
        //Feito para ser chamado nas sub-classes
    }
}
