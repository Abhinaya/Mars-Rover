package main;

public class WestDirection extends Direction{
    @Override
    public void move(RoverPosition roverPosition) {
         roverPosition.setX(roverPosition.getX()-1);
    }

    @Override
    public void turnLeft(RoverPosition roverPosition) {
        roverPosition.setDirection(new SouthDirection());
    }

    @Override
    public void turnRight(RoverPosition roverPosition) {
        roverPosition.setDirection(new NorthDirection());
    }
}
