package Maps;

import java.util.Scanner;

import System.ClearScreen;

public class Map {
    public int x;
    public int y;
    public String area;
    public String direction;
    public boolean mapOn;

    public Map(int x, int y, String direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
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

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setMapOn(boolean mapOn) {
        this.mapOn = mapOn;
    }

    public int[] arrayMap() {
        int[] map = {this.x, this.y};
        System.out.println(getY()+ " "+" "+ getX()); 
        return map;
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
        return move;
    }


    public void showMap() {
        //Só para ficar essa merda
    }
}
