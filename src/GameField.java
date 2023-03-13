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
        displayCollection.gameDriver();

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
