import javax.swing.*;
import java.awt.*;
import java.util.Arrays;

import static java.lang.Math.abs;

public class DisplayCollection extends JPanel {
    DisplayObject allObjects[];
    int pos = 0;

    DisplayCollection()
    {
        allObjects = new DisplayObject[44];
        BlockCollection objects = new BlockCollection();
        addObjects(objects.blocks);
        PlatformCollection platform = new PlatformCollection();
        addObjects(platform.platforms);
        BallCollection balls= new BallCollection();
        addObjects(balls.balls);
    }

    public void addObjects(DisplayObject displayObject[])
    {
        for (DisplayObject block:displayObject)
        {
            allObjects[pos] = block;
            pos++;
        }
    }
    public void removeObjects(DisplayObject displayObject[])
    {

    }
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        for (DisplayObject object:allObjects) {
            object.draw(g2d);
        }
    }
}
