import java.awt.*;

import static java.lang.Math.abs;

public class Platform extends DisplayObject {
    int speed;
    Platform (int x1, int y1, int x2, int y2, int x, int y, Color color, int speed)
    {
        this.speed=speed;
        super.setX1(x1);
        super.setY1(y1);
        super.setX2(x2);
        super.setY2(y2);
        super.setX(x);
        super.setY(y);
        super.setColor(color);
    }
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public boolean isCollidingWith(DisplayObject object) {
        return false;
    }

    @Override
    public void draw(Graphics2D g2d) {
        g2d.setColor(getColor());
        Rectangle rect = new Rectangle(getX1(),getY1(),abs(getX1()-getX2()),abs(getY1()-getY2()));
        g2d.fill(rect);
        g2d.setColor(Color.BLACK);
        g2d.draw(rect);
    }

    @Override
    public void move() {

    }
}
