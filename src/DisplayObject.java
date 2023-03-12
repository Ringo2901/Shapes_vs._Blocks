import java.awt.*;

public abstract class DisplayObject {
    private int x1;
    private int y1;
    private int x2;
    private int y2;
    private int x;
    private int y;
    private Color color;
    private int colorback;
    public int getX1() {
        return x1;
    }
    public  void setX1(int coordinate) {
        this.x1 = coordinate;
    }
    public int getY1() {
        return y1;
    }
    public  void setY1(int coordinate) {
        this.y1=coordinate;
    }
    public int getX2() {
        return x2;
    }
    public  void setX2(int coordinate) {
        this.x2 = coordinate;
    }
    public int getY2() {
        return y2;
    }
    public  void setY2(int coordinate) {
        this.y2=coordinate;
    }
    public int getX() {
        return x;
    }
    public  void setX(int coordinate) {
        this.x = coordinate;
    }
    public int getY() {
        return y;
    }
    public  void setY(int coordinate) {
        this.y=coordinate;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }


    public abstract boolean isCollidingWith(DisplayObject object);
    public abstract void draw(Graphics2D g2d);
    public abstract void move();
}
