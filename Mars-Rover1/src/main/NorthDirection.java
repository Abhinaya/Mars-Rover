package main;

public class NorthDirection extends Direction {
    @Override
    public void move(RoverPosition roverPosition) {
        roverPosition.setY(roverPosition.getY()+1);
    }

    @Override
    public void turnLeft(RoverPosition roverPosition) {
        roverPosition.setDirection(new WestDirection());
    }

    @Override
    public void turnRight(RoverPosition roverPosition) {
        roverPosition.setDirection(new EastDirection());
    }
}
