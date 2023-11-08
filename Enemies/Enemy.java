package Enemies;

import javax.swing.JLabel;

import Players.Player;

public class Enemy {
    public String name;
    public int HP;
    public int attack;
    public int defense;
    public Player player;
    public JLabel enemyImg = new JLabel();

    public Enemy(String name,int HP, int attack, int defense) {
        this.name = name;
        this.HP = HP;
        this.attack = attack;
        this.defense = defense;
    }

    public int getHP() {
        return this.HP;
    }

    public int getAttack() {
        return this.attack;
    }

    public int attackEnemy(Player player) {
        int attackDamage;
        if(this.attack >=  player.defense) {
            attackDamage = this.attack * 2 - player.defense;
        }
        else {
            attackDamage = this.attack * this.attack / player.defense;
        }
        return attackDamage;
    }

    public double enemyAttack(Player player, double d) {
        double dano =  this.attackEnemy(player) * d;
        player.setHP(player.HP - dano);
        System.out.println(this.name + " lhe deu " + dano + " de dano");
        return dano;
    }

    public void getEnemyStats() {
        System.out.println(" ");
        System.out.println(this.name);
        System.out.println("HP: " + this.HP);
        System.out.println(" ");
    }

    public int setHP(int HP) {
        this.HP = HP;
        return this.HP;
    }
}
