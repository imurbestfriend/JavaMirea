package secondPrac;

public class Ball {
    private double x;
    private double y;

    public Ball(double x, double y){
        this.x = x;
        this.y =y;
    }

    public Ball(){

    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }
    public void SetXY(double x, double y){
        this.x = x;
        this.y = y;
    }
    public void  Move(double xDisp, double yDisp){
        this.x = x + xDisp;
        this.y = y + yDisp;
    }
    @Override
    public String toString(){
        return "Ball[X =" + x + ", Y =" + y + "]";
    }
}
