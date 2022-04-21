package za.ac.wsu.s220650268;

public class Circle {

    private int xCoordinate;
    private int yCoordinate;
    private float radius;

    public void setX(int xCoordinate){
        this.xCoordinate = xCoordinate;
    }

    public void setY(int yCoordinate){
        this.yCoordinate = yCoordinate;
    }

    public void setRadius(float radius) {

        if (radius < 0) {
            System.out.println("Radius cannot be lesser than zero.....setting radius to zero");
            this.radius = 0;

        } else {
            this.radius = radius;
        }
    }

    public int getX(){
        return xCoordinate;
    }

    public int getY(){
        return yCoordinate;
    }

    public float getRadius(){
        return radius;
    }

    public float calculateArea(){

        return (float)(Math.PI * (getRadius() * getRadius()));
    }

    public float calculateCircumference(){

        return (float)(2 * Math.PI * getRadius());
    }

    public float calculateDiameter(){

        return 2 * getRadius();
    }

}
