package secondPrac.two;

public class TestBall {
    public static void main(String[] args) {
        Ball ball = new Ball();
        ball.SetXY(5,8);
        ball.Move(3,3);
        System.out.println(ball.getX() + " " + ball.getY());
        System.out.println(ball);
    }
}
