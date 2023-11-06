package Enemies;

public class Bat extends Enemy {

    static String name = "Bat";
    static int HP = 20;
    static int attack = 10;
    static int defense = 10;
    
    public Bat() {
        super(name ,HP, attack, defense);
    }
}
