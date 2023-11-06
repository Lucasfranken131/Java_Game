package Enemies;

import java.awt.Dimension;
import javax.swing.ImageIcon;
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

    public int enemyAttack(Player player) {
        int dano =  this.attackEnemy(player);
        player.setHP(player.HP - dano);
        System.out.println("O inimigo lhe deu " + dano + " de dano");
        return dano;
    }

    public void getEnemyStats() {
        System.out.println(" ");
        System.out.println(this.name);
        System.out.println("HP: " + this.HP);
    }

    public void setHP(int HP) {
        this.HP = HP; 
    }
}
