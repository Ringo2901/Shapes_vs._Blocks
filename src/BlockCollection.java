import java.awt.*;

import static java.lang.Math.abs;

public class BlockCollection{
    Block blocks[];
    int pos =0;
BlockCollection()
{
    int x1 = 10, x2 = 70,y1 = 10,y2 = 40;
    Color color;
    blocks = new Block[42];
    for (int i = 0; i < 16; i++) {
        color = Color.getHSBColor(2.0f, 1.0f, 1.0f);
        addBlock(new Block(x1, y1, x2, y2, abs(x1-x2)/2,abs(y1-y2)/2,color,2));
        x1+=60;
        x2+=60;
    }
    x1 = 70; x2 = 130; y1 = 40;y2 = 70;
    for (int i = 16; i < 30; i++) {
        color = Color.getHSBColor(10.0f, 100.0f, 100.0f);
        addBlock(new Block(x1, y1, x2, y2, abs(x1-x2)/2,abs(y1-y2)/2,color,2));
        x1+=60;
        x2+=60;
    }
    x1 = 130; x2 = 190; y1 = 70;y2 = 100;
    for (int i = 30; i < 42; i++) {
        color = Color.getHSBColor(100.0f, 10.0f, 10.0f);
        addBlock(new Block(x1, y1, x2, y2, abs(x1-x2)/2,abs(y1-y2)/2,color,2));
        x1+=60;
        x2+=60;
    }
}
    public void addBlock(Block block)
    {
        blocks[pos] = block;
        pos++;
    }
    public void removeblock(Block block)
    {

    }
    public Block getBlock(int index) {
        return null;
    }
}
