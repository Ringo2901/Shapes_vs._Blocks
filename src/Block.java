public class Block extends GameObject{

    int healthlevel;
    Bonus bonus;

    public Bonus getBonus() {
        return bonus;
    }

    public void setBonus(Bonus bonus) {
        this.bonus = bonus;
    }

    public int getHealthlevel() {
        return healthlevel;
    }

    public void setHealthlevel(int healthlevel) {
        this.healthlevel = healthlevel;
    }

    public void checkCollisionWithBall(){

    }
    @Override
    public void isCollidingWith(GameObject object) {

    }

    @Override
    public void render() {

    }
}
