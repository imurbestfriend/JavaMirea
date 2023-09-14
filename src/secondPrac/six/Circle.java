package secondPrac.six;

public class Circle {
    private int radius;
    public void setRadius(int radius) {
        this.radius = radius;
    }



    double pi = Math.PI;
    public void area(double radius){
        double area = (double) Math.pow(radius, 2) * pi;
        System.out.println(area);
    }
    public void length(double radius){
        double length = (double) 2 * pi* radius;
        System.out.println(length);
    }
    public void circleDifference(double radiusOne, double radiusTwo){
        double difference = Math.abs( (pi*Math.pow(radiusOne, 2)) - pi*Math.pow(radiusTwo, 2));
        System.out.println(difference);
    }
}
