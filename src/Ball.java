import java.awt.*;

import static java.lang.Math.abs;

public class Ball extends DisplayObject {
    int speed;
    float direction;
    Ball (int x1, int y1, int x2, int y2, int x, int y, Color color, int speed, float direction)
    {
        this.speed=speed;
        this.direction=direction;
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
    public  void setSpeed(int coordinate) {
        this.speed = coordinate;
    }
    public float getDirection() {
        return direction;
    }
    public  void setDirection(float coordinate) {
        this.direction=coordinate;
    }

    @Override
    public boolean isCollidingWith(DisplayObject object) {
        int x1 = getX1(); int x2 = getX2();
        int coordx = abs((x1 - x2)) /2;
        int coordy = getY1();
        int x3 = object.getX1(); int x4 = object.getX2(); int y3 = object.getY1(); int y4 = object.getY2();
        if (coordy >= y4 && coordy <=y3)
        {
            return coordx >= x3 && coordy <= x4;
        }
        return false;
    }

    @Override
    public void draw(Graphics2D g2d) {
        g2d.setColor(getColor());
        g2d.fillOval(getX1(),getY1(),abs(getX1()-getX2()),abs(getY1()-getY2()));
    }

    @Override
    public void move() {
        float dx = (float) Math.cos(direction) * speed;
        float dy = (float) Math.sin(direction) * speed;

        // Изменяем координаты шарика
        setX1((int)(getX1() + dx));
        setX2((int)(getX2() + dx));
        setY1((int)(getY1() + dy));
        setY2((int)(getY2() + dy));
    }
}
