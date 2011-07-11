package main;


public class SouthDirection extends Direction {
    @Override
    public void move(RoverPosition roverPosition) {
        roverPosition.setY(roverPosition.getY()-1);
    }

    @Override
    public void turnLeft(RoverPosition roverPosition) {
        roverPosition.setDirection(new EastDirection());
    }

    @Override
    public void turnRight(RoverPosition roverPosition) {
        roverPosition.setDirection(new WestDirection());
    }
}
