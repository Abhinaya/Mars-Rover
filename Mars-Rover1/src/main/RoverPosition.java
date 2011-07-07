package main;

public class RoverPosition {

    private int x;
    private int y;
    private String direction;

    private RoverPosition(){
    }

    public static RoverPosition parse(String input) {
        String[] position= input.split(" ");
        RoverPosition roverPosition = new RoverPosition();
        roverPosition.x= Integer.parseInt(position[0]);
        roverPosition.y= Integer.parseInt(position[1]);
        roverPosition.direction=position[2];
        return roverPosition;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getDirection() {
        return direction;
    }

    public void move() {
    }

    public void turnRight() {
    }

    public void turnLeft() {
    }
}