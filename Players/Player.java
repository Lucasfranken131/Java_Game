package Players;
import Enemies.Enemy;
import Items.Bolsa.Bag;

public class Player {

    private String name;
    private double HP;
    private int attack;
    private int defense;
    private int mana;
    private int speed;
    private int level;
    Bag bag;

    public Player(String name, double HP, int attack, int defense, int mana, int speed, int level, Bag bag) {
        this.name = name;
        this.HP = HP;
        this.attack = attack;
        this.defense = defense;
        this.mana = mana;
        this.speed = speed;
        this.level = level;
        this.bag = bag;
    }

    public int damage(Enemy enemy) {
        int damage;
        if(this.attack >= enemy.getDefense()) {
            damage = this.attack * 2 - enemy.getDefense();
        }
        else {
            damage = this.attack * this.attack / enemy.getDefense();
        }
        return damage;
    }

    public void playerAttack(Enemy enemy) {
        if(this.HP > 0) {
            int dano = this.damage(enemy);
            enemy.setHP(enemy.getHP() - dano);
            System.out.println(" ");
            System.out.println(this.name + " deu " + dano + " de dano");
        }
    }

    public void getPlayerStats() {
        System.out.println(" ");
        System.out.println(this.name);
        System.out.println("HP: " + this.HP);
        System.out.println("Mana: " + this.mana);
    }

    public double getHP() {
        return this.HP;
    }

    public int getDefense() {
        return this.defense;
    }

    public int getAttack() {
        return this.attack;
    }

    public int getSpeed() {
        return this.speed;
    }
    
    public int getLevel() {
        return this.level;
    }

    public void getItems() {
        bag.displayItems();
    }
    
    public double setHP(double HP){
        return this.HP = HP;
    }
}
