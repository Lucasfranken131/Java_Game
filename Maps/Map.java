package Maps;

public class Map {
    public int x;
    public int y;
    public String area;
    public String direction;
    public boolean mapOn;

    public Map(int x, int y, String area, String direction) {
        this.x = x;
        this.y = y;
        this.area = area;
        this.direction = direction;
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
}
