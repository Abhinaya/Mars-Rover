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

    @Override
    public String toString() {
        return x+" "+y+" "+direction;
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
            case 'S':
                this.y-=1;
                break;
            case  'W':
                this.x-=1;
                break;
        }
    }

    public void turnRight() {
        switch (direction){
            case 'N':
                this.direction='E';
                break;
            case 'E':
                this.direction='S';
                break;
            case 'S':
                this.direction='W';
                break;
            case 'W':
                this.direction='N';
                break;
        }

    }

    public void turnLeft() {
        switch (direction){
            case 'N':
                this.direction='W';
                break;
            case 'E':
                this.direction='N';
                break;
            case 'S':
                this.direction='E';
                break;
            case 'W':
                this.direction='S';
                break;
        }

    }
}