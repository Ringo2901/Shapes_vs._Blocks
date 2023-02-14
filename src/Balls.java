public class Balls extends Figure{
    private final int radius;

    public Balls(String color, float speed, float coordinateX, float coordinateY, int radius) {
        super(color, speed, coordinateX, coordinateY);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    void move() {

    }
}
