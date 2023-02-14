public class DestroyedBlocks extends Blocks{
    int bonus;
    DestroyedBlocks(String color, float coordX, float coordY, float width, float height, int bonus) {
        super (color,coordX, coordY, width, height);
        this.bonus = bonus;
    }
    @Override
    public void hitWithBall() {

    }
}
