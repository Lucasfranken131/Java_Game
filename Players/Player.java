package Players;
import Enemies.Enemy;
import Items.Bolsa.Bag;

public class Player {

    private String name;
    private double HP;
    private double maxHP;
    private int attack;
    private int defense;
    private int mana;
    private int maxMana;
    private int speed;
    private int level;
    Bag bag;

    public Player(String name, double HP, double maxHP, int attack, int defense, int mana, int maxMana, int speed, int level, Bag bag) {
        this.name = name;
        this.HP = HP;
        this.maxHP = maxHP;
        this.attack = attack;
        this.defense = defense;
        this.mana = mana;
        this.maxMana = maxMana;
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

    public int playerAttack(Enemy enemy) {
        int dano;
        if(this.HP > 0) {
            dano = this.damage(enemy);
            enemy.setHP(enemy.getHP() - dano);
        }
        else {
            dano = 0;
        }
        correctValues();
        return dano;
    }

    public void getPlayerStats() {
        System.out.println(" ");
        System.out.println(this.name);
        System.out.println("HP: " + this.HP);
        System.out.println("Mana: " + this.mana);
    }

    public String getName() {
        return this.name;
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
        bag.displayItems(this);
    }
    
    public double setHP(double HP){
        return this.HP = HP;
    }

    public int setMana(int mana){
        return this.mana = mana;
    }

    public void correctMaxHP() {
        if(this.HP > this.maxHP) {
            setHP(maxHP);
        }
    }

    public void correctMaxMana() {
        if(this.mana > this.maxMana) {
            setMana(maxMana);
        }
    }

    public void correctValues() {
        correctMaxHP();
        correctMaxMana();
    }
}
