package main;

public class RoverPosition {

    private int x;
    private int y;
    private Direction direction;

    RoverPosition(){
    }

    public static RoverPosition parse(String input) {
        String[] position= input.split(" ");
        RoverPosition roverPosition = new RoverPosition();
        roverPosition.x= Integer.parseInt(position[0]);
        roverPosition.y= Integer.parseInt(position[1]);
        roverPosition.direction=Direction.convertCharacterToDirection(position[2].charAt(0));
        return roverPosition;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return x+" "+y+" "+getDirection();
    }

    public char getDirection() {
        return Direction.convertDirectionToCharecter(direction);
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void move() {
        direction.move(this);
    }

    public void turnRight() {
        direction.turnRight(this);
    }

    public void turnLeft() {
        direction.turnLeft(this);
    }
}