public abstract class GameObject extends DisplayObject{
    private float x;
    private float y;
    private int height;
    private int width;
    public float getX() {
        return x;
    }
    public  void setX(float coordinate) {
        this.x = coordinate;
    }
    public float getY() {
        return y;
    }
    public  void setY(float coordinate) {
        this.y=coordinate;
    }
    public abstract void isCollidingWith(GameObject object);
    public abstract void render();
}
