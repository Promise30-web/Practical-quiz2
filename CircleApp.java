import za.ac.wsu.s220650268.Circle;

public class CircleApp {

    public static void main(String[] args) {

        Circle circle = new Circle();//Circle 1
        circle.setX(12);
        circle.setY(4);
        circle.setRadius((float) 15.6);

        System.out.println("Circle One Information");
        System.out.println("The area of circle 1: " + circle.calculateArea());
        System.out.println("The circumference of circle 1: " + circle.calculateCircumference());
        System.out.println("The diameter of circle 1: " + circle.calculateDiameter());

        Circle circle2 = new Circle();//Circle 2
        circle2.setX(25);
        circle2.setY(9);
        circle2.setRadius((float)35.9);

        System.out.println("\nCircle Two Information");
        System.out.println("The area of circle 2: " + circle2.calculateArea());
        System.out.println("The circumference of circle 2: " + circle2.calculateCircumference());
        System.out.println("The diameter of circle 2: " + circle2.calculateDiameter());

        Circle circle3 = new Circle();//Circle 3
        circle3.setX(36);
        circle3.setY(8);
        circle3.setRadius((float)45.3);

        System.out.println("\nCircle Three Information");
        System.out.println("The area of circle 3: " + circle3.calculateArea());
        System.out.println("The circumference of circle 3: " + circle3.calculateCircumference());
        System.out.println("The diameter of circle 3: " + circle3.calculateDiameter());

    }
}
