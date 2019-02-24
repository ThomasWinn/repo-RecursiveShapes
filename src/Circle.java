import java.awt.*;

public class Circle {

    private double xPosition;
    private double yPosition;
    private double cRadius;
    private Color cColor;

    public Circle(double positionX, double positionY, double circleRadius) {
        xPosition = positionX;
        yPosition = positionY;
        cRadius = circleRadius;
    }

    // Calculates perimeter of the circle 2 * pi * r
    public double calculatePerimeter() {
        double circumference = 0;
        circumference = Math.PI * cRadius * 2;

        return circumference;
    }

    // Calculates area of the circle pi * r * r
    public double calculateArea() {
        double area = 0;
        area = Math.PI * cRadius * cRadius;

        return area;
    }

    public void setColor(Color colorCircle) {
        cColor = colorCircle;
    }

    public void setPos(double xCent, double yCent){
        xPosition = xCent;
        yPosition = yCent;
    }

    public void setRadius(double circleRadius) {
        cRadius = circleRadius;
    }

    public Color getColor(){
        return cColor;
    }

    public double getXPos() {
        return xPosition;
    }

    public double getYPos() {
        return yPosition;
    }

    public double getRadius(){
        return cRadius;
    }

}
