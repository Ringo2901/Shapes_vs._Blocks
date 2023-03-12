import java.awt.*;

public class BallCollection {
    Ball balls[];
    int pos =0;
    BallCollection (){
        balls = new Ball[1];
        addBall(new Ball(435,870,465,900,450,895, Color.getHSBColor(0.67f, 1.0f, 1.0f),30,(float)11));
    }
    public Ball getBall(int index) {
        return null;
    }

    public void addBall(Ball ball){
        balls[pos]=ball;
    }
    public void removeBall(Ball ball){

    }
}
