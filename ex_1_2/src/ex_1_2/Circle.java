package ex_1_2;

public class Circle {

    private double radius = 1.0;

    public Circle() {
        this.radius = 1.0;
    }

    public Circle(double radius) {
        this.setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        if(radius > 0) {
            this.radius = radius;
        } else {
            System.out.println("Ban kinh khong hop le!");
        }
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    public String toString() {
        return "Circle[radius=" + radius + "]";
    }
}