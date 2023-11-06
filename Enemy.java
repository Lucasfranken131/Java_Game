import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

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
        int attackDamage = this.attack - player.defense;
        return attackDamage;
    }

    public void setHP(int HP) {
        this.HP = HP; 
    }

    public String verifyEnemyHP() {
        if(this.HP <= 0) {
            this.name = "explosion";
            setEnemyImage();
        }
        return this.name;
    }

    public JLabel setEnemyImage() {
        String fileName = verifyEnemyImage(this.name);
        enemyImg.setIcon(new ImageIcon(fileName));
        enemyImg.setSize(400, 400);
        Dimension size = enemyImg.getPreferredSize(); //Gets the size of the image
        enemyImg.setBounds(50, 30, size.width, size.height); //Sets the location of the image
        return enemyImg;
    }

    public String verifyEnemyImage(String name) {
        String fileName;
        switch (this.name) {
            case "bat":
                fileName = "imgs/bat.png";
                break;

            case "explosion":
                fileName = "imgs/explosion.png";
                break;

            case "slime":
                fileName = "imgs/slime.png";
                break;
                
            default:
                fileName = "imgs/pacman.jpg";
                break;
        }
        return fileName;
    }
}
