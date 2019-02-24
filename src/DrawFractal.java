import java.awt.*;
import java.util.Scanner;

/*

Thomas Nguyen
CSCI 1933
ID# 5500699

 */

public class DrawFractal {

    // Method to draw the triangle fractal
    public static double triFractal(Canvas canvas, double factorial, double xPos, double yPos, double width, double height) {

        Triangle tri2 = new Triangle(800, 500, 200, 200);

        double area = 0;

        if (factorial >= 1) {

            // Draw initial shape
            canvas.drawShape(tri2);

            // Changing color of different levels of fractal
            if (factorial == 6) {
                tri2.setColor(Color.RED);
            }
            else if (factorial == 5) {
                tri2.setColor(Color.CYAN);
            }
            else if (factorial == 4) {
                tri2.setColor(Color.GREEN);
            }
            else if (factorial == 3) {
                tri2.setColor(Color.YELLOW);
            }
            else if (factorial == 2) {
                tri2.setColor(Color.MAGENTA);
            }
            else if (factorial == 1) {
                tri2.setColor(Color.PINK);
            }

            tri2.setWidth(width);
            tri2.setHeight(height);
            tri2.setPos(xPos, yPos);

            area += tri2.calculateArea();

            // Draws fractal width units to right and reduces w and h by 3/4
            area += triFractal(canvas, factorial - 1, tri2.getXPos() + tri2.getWidth(), tri2.getYPos(), tri2.getWidth() * 0.5, tri2.getHeight() * 0.5);

            // Draws fractal width units to left and reduces w and h by 3/4
            area += triFractal(canvas, factorial - 1, tri2.getXPos() - tri2.getWidth() * 0.5, tri2.getYPos(), tri2.getWidth() * 0.5, tri2.getHeight() * 0.5);

            // Draws fractal on the tip of triangle and reduce w and h by 3/4
            area += triFractal(canvas, factorial - 1, tri2.getXPos() + tri2.getWidth() * 0.25, tri2.getYPos() - tri2.getWidth(), tri2.getWidth() * 0.5, tri2.getHeight() * 0.5);


        }

        return area;

    }

    // Method to draw the circle fractal
    public static double cirFractal(Canvas canvas, double factorial, double xPos, double yPos, double radius) {

        Circle cir2 = new Circle(800, 800, 200);

        double area = 0;

        if (factorial >= 1) {
            //factorial --;

            // Draw initial shape
            canvas.drawShape(cir2);

            // Changing color of different levels of fractal
            if (factorial == 6) {
                cir2.setColor(Color.RED);
            }
            else if (factorial == 5) {
                cir2.setColor(Color.CYAN);
            }
            else if (factorial == 4) {
                cir2.setColor(Color.GREEN);
            }
            else if (factorial == 3) {
                cir2.setColor(Color.YELLOW);
            }
            else if (factorial == 2) {
                cir2.setColor(Color.MAGENTA);
            }
            else if (factorial == 1) {
                cir2.setColor(Color.PINK);
            }

            cir2.setRadius(radius);
            cir2.setPos(xPos,yPos);

            area += cir2.calculateArea();

            // Draws recursed circle with half of the previous circle's radius to right of the previous circle
            area += cirFractal(canvas, factorial - 1, cir2.getXPos() + cir2.getRadius(), cir2.getYPos(), cir2.getRadius() * 0.5);

            // Draws recursed circle with half of the previous circle's radius to left of the previous circle
            area += cirFractal(canvas, factorial - 1, cir2.getXPos() - cir2.getRadius(), cir2.getYPos(), cir2.getRadius() * 0.5);

            // Draws recursed circle with half of the previous circle's radius to top of the previous circle
            area += cirFractal(canvas, factorial - 1, cir2.getXPos(), cir2.getYPos() - cir2.getRadius(), cir2.getRadius() * 0.5);

            // Draws recursed circle with half of the previous circle's radius to bottom of the previous circle
            area += cirFractal(canvas, factorial - 1, cir2.getXPos(), cir2.getYPos() + cir2.getRadius(), cir2.getRadius() * 0.5);

        }

            return area;
    }

    // Method to draw the rectangle fractal
    public static double rectFractal(Canvas canvas, double factorial, double xPos, double yPos, double width, double height) {

        Rectangle rec2 = new Rectangle(700, 450, 200, 100);

        double area = 0;

        if (factorial >= 1) {

            // Draw initial shape
            canvas.drawShape(rec2);

            // Changing color of different levels of fractal
            if (factorial == 6) {
                rec2.setColor(Color.RED);
            }
            else if (factorial == 5) {
                rec2.setColor(Color.CYAN);
            }
            else if (factorial == 4) {
                rec2.setColor(Color.GREEN);
            }
            else if (factorial == 3) {
                rec2.setColor(Color.YELLOW);
            }
            else if (factorial == 2) {
                rec2.setColor(Color.MAGENTA);
            }
            else if (factorial == 1) {
                rec2.setColor(Color.PINK);
            }

            rec2.setPos(xPos,yPos);
            rec2.setHeight(height);
            rec2.setWidth(width);

            area += rec2.calculateArea();


            // Recursive for top left rectangle - the space between the top left position of parent to bottom right of child factorial, is exactly 1/2 of height and width respectively of child's dimensions
            area += rectFractal(canvas, factorial - 1, rec2.getXPos() - 2 * rec2.getWidth() * 0.5, rec2.getYPos() - 2 * rec2.getHeight() * 0.5, rec2.getWidth() * 0.5, rec2.getHeight() * 0.5);

            // Recursive for bottom left rectangle - the space between the bottom left position of parent to top right of child factorial, is exactly 1/2 of height and width respectively of child's dimensions
            area += rectFractal(canvas, factorial - 1, rec2.getXPos() - 2 * rec2.getWidth() * 0.5, rec2.getYPos() + rec2.getHeight() + rec2.getHeight() * 0.5, rec2.getWidth() * 0.5, rec2.getHeight() * 0.5);

            // Recursive for top right rectangle - the space between the top right position of parent to bottom left of child factorial, is exactly 1/2 of height and width respectively of child's dimensions
            area += rectFractal(canvas, factorial - 1, rec2.getXPos() + rec2.getWidth() + rec2.getWidth() * 0.5, rec2.getYPos() - 2 * rec2.getHeight() * 0.5, rec2.getWidth() * 0.5, rec2.getHeight() * 0.5);

            // Recursive for bottom right rectangle - the space between the bottom right position of parent to top left of child factorial, is exactly 1/2 of height and width respectively of child's dimensions
            area += rectFractal(canvas, factorial - 1, rec2.getXPos() + rec2.getWidth() + rec2.getWidth() * 0.5, rec2.getYPos() + rec2.getHeight() + rec2.getHeight() * 0.5, rec2.getWidth() * 0.5, rec2.getHeight() * 0.5);

        }

        return area;
    }

    public static void main(String[] args) {

        // Number of levels in fractal
        double factorial = 7;

        System.out.println("What kind of fractal would you like to draw?" +
                "\n\n a) circle" +
                "\n b) triangle" +
                "\n c) rectangle\n");
        System.out.print("Answer: ");
        Scanner fractalInput = new Scanner(System.in);
        String userResponse = fractalInput.next();

        if (userResponse.equals("circle")) {

            System.out.println("Initializing circle fractal...");

            Canvas canvas = new Canvas(1600, 1600);
            Color col = Color.BLUE;
            Circle cir1 = new Circle(800,500, 200);
            cir1.setColor(col);
            canvas.drawShape(cir1);

            cirFractal(canvas, factorial, cir1.getXPos(), cir1.getYPos(), cir1.getRadius());

            // Outputs the area using recursed total inside method
            System.out.println("The total area = " + cirFractal(canvas, factorial, cir1.getXPos(), cir1.getYPos(), cir1.getRadius()));


        } else if (userResponse.equals("triangle")) {

            System.out.println("Initializing triangle fractal...");

            Canvas canvas = new Canvas(1600, 1600);
            Color col = Color.BLUE;
            Triangle tri1 = new Triangle(800, 800, 200, 200);
            tri1.setColor(col);
            canvas.drawShape(tri1);

            triFractal(canvas, factorial, tri1.getXPos(), tri1.getYPos(), tri1.getWidth(), tri1.getHeight());

            // Outputs the area using recursed total inside method
            System.out.println("The total area = " + triFractal(canvas, factorial, tri1.getXPos(), tri1.getYPos(), tri1.getWidth(), tri1.getHeight()));


        } else if (userResponse.equals("rectangle")) {

            System.out.println("Initializing rectangle fractal");

            Canvas canvas = new Canvas(1600,1600);
            Color col = Color.BLUE;
            Rectangle rec1 = new Rectangle(700, 450, 200, 100);
            rec1.setColor(col);
            canvas.drawShape(rec1);

            rectFractal(canvas, factorial, rec1.getXPos(), rec1.getYPos(), rec1.getWidth(), rec1.getHeight());

            // Output the area using recursed total inside method
            System.out.println("The total area = " + rectFractal(canvas, factorial, rec1.getXPos(), rec1.getYPos(), rec1.getWidth(), rec1.getHeight()));

        } else {

            System.out.println("ERROR INVALID INPUT...");
        }
    }

    }




