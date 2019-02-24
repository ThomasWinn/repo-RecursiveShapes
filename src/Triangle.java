import java.awt.*;

public class Triangle {

    private double xBottomLeftCorner;
    private double yBottomLeftCorner;
    private double triangleWidth;
    private double triangleHeight;
    private Color tColor;

    public Triangle(double xTriangle, double yTriangle, double width, double height){
        xBottomLeftCorner = xTriangle;
        yBottomLeftCorner = yTriangle;
        triangleWidth = width;
        triangleHeight = height;
    }

    // Calculates the perimeter of the triangle using pythagorean theorem
    public double calculatePerimeter(){
        double perimeter = 0;

        double a = (triangleWidth/2) * (triangleWidth/2);
        double b = triangleHeight * triangleHeight;
        double c = Math.sqrt(a + b);
        perimeter = c + c + triangleWidth;

        return perimeter;
    }

    // Calculates the area of the triangle area = (1/2)wh
    public double calculateArea() {
        double area = 0;
        area = 0.5 * (triangleWidth * triangleHeight);

        return area;
    }

    public void setColor(Color colorTriangle) {
        tColor = colorTriangle;
    }

    public void setPos(double xTriangle, double yTriangle){
        xBottomLeftCorner = xTriangle;
        yBottomLeftCorner = yTriangle;
    }

    public void setHeight(double height){
        triangleHeight = height;
    }

    public void setWidth(double width){
        triangleWidth = width;
    }

    public Color getColor(){
        return tColor;
    }

    public double getXPos(){
        return xBottomLeftCorner;
    }

    public double getYPos(){
        return yBottomLeftCorner;
    }

    public double getHeight(){
        return triangleHeight;
    }

    public double getWidth(){
        return triangleWidth;
    }

}
