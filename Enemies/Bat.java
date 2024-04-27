package Enemies;

public class Bat extends Enemy {

    static int id = 1;
    static String name = "Morcego";
    static int HP = 20;
    static int attack = 10;
    static int defense = 10;
    static int speed = 10;
    
    public Bat() {
        super(id, name ,HP, attack, defense, speed);
    }
}
