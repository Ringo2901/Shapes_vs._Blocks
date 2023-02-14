public abstract class Figure {
    private String color;
    private float speed;
    private float coordX;
    private float coordY;

    public Figure(String color, float speed, float coordinateX, float coordinateY) {
        this.color = color;
        this.speed = speed;
        this.coordX = coordinateX;
        this.coordY = coordinateY;
    }

    public String getColor() {
        return color;
    }

    public float getSpeed() {
        return speed;
    }

    public float getCoordinateX() {
        return coordX;
    }

    public float getCoordinateY() {
        return coordY;
    }

    abstract void move();
}
