package Maps;
import java.awt.event.KeyEvent;

public class Map {
    public int x;
    public int y;
    public String area;
    public String direction;
    public boolean upPressed, leftPressed, rightPressed, downPressed;

    public Map(int x, int y, String area, String direction) {
        this.x = x;
        this.y = y;
        this.area = area;
        this.direction = direction;
        arrayMap();
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public String getArea() {
        return this.area;
    }

    public String getDirection() {
        return this.direction;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int[] arrayMap() {
        int[] map = {this.x, this.y};
        System.out.println(getY()+ " "+" "+ getX()); 
        return map;
    }

    public void keyEvent(KeyEvent e) {
        int key = e.getKeyCode();

        if (key == KeyEvent.VK_W) {
            upPressed = true;
        }

        if (key == KeyEvent.VK_A) {
            leftPressed = true;
        }
    
        if (key == KeyEvent.VK_S) {
            downPressed = true;
        }
    
        if (key == KeyEvent.VK_D) {
            rightPressed = true;
        }

        System.out.println("X:" + this.x);
        System.out.println("Y" + this.y);
    }

    public void keyReleased(KeyEvent e) {

        int code = e.getKeyCode();

        if(code == KeyEvent.VK_W){
            upPressed = false;
        }

        else if(code == KeyEvent.VK_A){
            leftPressed = false;
        }

        else if(code == KeyEvent.VK_S){
            downPressed = false;
        }

        else if(code == KeyEvent.VK_D){
            rightPressed = false;
        }
    }
}
