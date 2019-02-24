import java.awt.*;

public class Rectangle {

    private double xBottomLeftCorner;
    private double yBottomLeftCorner;
    private double rectangleWidth;
    private double rectangleHeight;
    private Color rColor;

    public Rectangle(double xRectangle, double yRectangle, double width, double height){
        xBottomLeftCorner = xRectangle;
        yBottomLeftCorner = yRectangle;
        rectangleWidth = width;
        rectangleHeight = height;
    }

    // Calculates the perimeter of the rectangle 2w + 2h
    public double calculatePerimeter() {
        double perimeter = 0;
        perimeter = rectangleHeight + rectangleWidth + rectangleWidth + rectangleHeight;

        return perimeter;
    }

    // Calculates the area of the rectangle w * h
    public double calculateArea(){
        double area;
        area = rectangleHeight * rectangleWidth;

        return area;
    }

    public void setColor(Color colorRectangle){
        rColor = colorRectangle;
    }

    public void setPos(double xRectangle, double yRectangle){
        xBottomLeftCorner = xRectangle;
        yBottomLeftCorner = yRectangle;
    }

    public void setHeight(double height){
        rectangleHeight = height;
    }

    public void setWidth(double width){
        rectangleWidth = width;
    }

    public Color getColor() {
        return rColor;
    }

    public double getXPos(){
        return xBottomLeftCorner;
    }

    public double getYPos(){
        return yBottomLeftCorner;
    }

    public double getHeight(){
        return rectangleHeight;
    }

    public double getWidth(){
        return rectangleWidth;
    }

}

