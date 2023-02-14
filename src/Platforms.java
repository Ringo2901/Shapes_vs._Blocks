public class Platforms extends Figure{
    private final int width;
    private final int height;

    public Platforms(String color, float speed, float coordinateX, float coordinateY, int width, int height) {
        super(color, speed, coordinateX, coordinateY);
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
    @Override
    void move() {

    }
}
