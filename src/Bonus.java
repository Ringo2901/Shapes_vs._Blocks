import java.awt.*;

public class Bonus extends DisplayObject {
    int type;

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    @Override
    public boolean isCollidingWith(DisplayObject object) {
        return false;
    }

    @Override
    public void draw(Graphics2D g2d) {

    }

    @Override
    public void move() {

    }
}
