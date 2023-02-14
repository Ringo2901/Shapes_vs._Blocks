public abstract class Blocks {
    private String color;
    private float coordX;
    private float coordY;
    private float width;
    private float height;

    Blocks(String color, float coordX, float coordY, float width, float height)
    {
        this.color=color;
        this.coordX=coordX;
        this.coordY=coordY;
        this.width=width;
        this.height=height;
    }
    public String getColor() {
        return color;
    }

    public float getCoordinateX() {
        return coordX;
    }

    public float getCoordinateY() {
        return coordY;
    }

    public float getWidth() {
        return width;
    }

    public float getHeight() {
        return height;
    }
    abstract public void hitWithBall();

}
