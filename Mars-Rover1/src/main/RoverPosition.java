package main;

public class RoverPosition {

    private int x;
    private int y;
    private char direction;

    RoverPosition(){
    }

    public static RoverPosition parse(String input) {
        String[] position= input.split(" ");
        RoverPosition roverPosition = new RoverPosition();
        roverPosition.x= Integer.parseInt(position[0]);
        roverPosition.y= Integer.parseInt(position[1]);
        roverPosition.direction=position[2].charAt(0);
        return roverPosition;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public char getDirection() {
        return direction;
    }

    public void move() {
        switch (direction){
            case 'N':
                this.y+=1;
                break;
            case 'E':
                this.x+=1;
                break;

        }
    }

    public void turnRight() {
        switch (direction){
            case 'N':
                direction='E';
                break;
            case 'E':
                direction='S';
                break;
            case 's':
                direction='W';
                break;
            case 'W':
                direction='N';
                break;
        }
    }

    public void turnLeft() {

    }
}