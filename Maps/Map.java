package Maps;

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

    public void isMapOn() {
        while(this.mapOn == true) {

        }
        //while(this.mapOn == false) {
            //
        //}
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
        System.out.println(playerDirection);
        return playerDirection;
    }
}
