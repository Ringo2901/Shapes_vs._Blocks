import java.awt.*;
import javax.swing.*;
public class GameField extends JFrame{
    int x1;
    int y1;
    int x2;
    int y2;
    int x;
    int y;
    DisplayCollection displayCollection;
    int background;

    MessageBox messageBox;
    GameField() throws InterruptedException {
        setTitle("My Panel");
        displayCollection = new DisplayCollection();
        getContentPane().add(displayCollection);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1000, 1000);
        setVisible(true);
        gameDriver();

    }
    public int gameDriver() throws InterruptedException {
        while (true)
        {
            for (DisplayObject object: displayCollection.allObjects)
            {
                object.move();
                for (DisplayObject object2: displayCollection.allObjects)
                {
                    if (object.equals(object2)) continue;
                    if (object.isCollidingWith(object2))
                    {
                        object2.setX1(0);
                        object2.setX2(0);
                        object2.setY1(0);
                        object2.setY2(0);
                    }

                }
            }
            displayCollection.repaint();
            Thread.sleep(200);
        }
    }
    public int getBackgroundColor() {
        return background;
    }

    public void setBackground(int background) {
        this.background = background;
    }

    public DisplayCollection getDisplayObject() {
        return displayCollection;
    }

    public void setDisplayObject(DisplayCollection displayCollection) {
        this.displayCollection = displayCollection;
    }
    public void checkFinish(){

    }
}
