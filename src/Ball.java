public class Ball extends GameObject{
    int speed;
    float direction;
    public int getSpeed() {
        return speed;
    }
    public  void setSpeed(int coordinate) {
        this.speed = coordinate;
    }
    public float getDirection() {
        return direction;
    }
    public  void setDirection(float coordinate) {
        this.direction=coordinate;
    }

    @Override
    public void isCollidingWith(GameObject object) {

    }

    @Override
    public void render() {

    }
}
